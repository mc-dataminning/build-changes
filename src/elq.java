import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class elq extends elk {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected epi b;
   protected epe c;
   protected jf d;

   public elq(elx $$0, int $$1, epj $$2, ale $$3, String $$4, epe $$5, jf $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jk.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public elq(elx $$0, ug $$1, epj $$2, Function<ale, epe> $$3) {
      super($$0, $$1);
      this.a(jk.c);
      this.a = $$1.l("Template");
      this.d = new jf($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ale $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ale b() {
      return ale.a(this.a);
   }

   @Override
   protected void a(elw $$0, ug $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dfg $$0, dfe $$1, dwp $$2, azn $$3, eky $$4, ddp $$5, jf $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (epi.c $$8 : this.b.a(this.d, this.c, dho.pa)) {
            if ($$8.c() != null) {
               dwc $$9 = dwc.valueOf($$8.c().l("mode"));
               if ($$9 == dwc.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (epi.c $$11 : this.b.a(this.d, this.c, dho.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dus $$13 = dho.a.n();

               try {
                  $$13 = go.a($$0.a(lw.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, jf var2, dez var3, azn var4, eky var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public doa a() {
      return this.c.d();
   }

   public epi c() {
      return this.b;
   }

   public jf d() {
      return this.d;
   }

   public epe e() {
      return this.c;
   }
}
