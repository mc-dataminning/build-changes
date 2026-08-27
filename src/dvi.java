import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dvi extends dvc {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dyr b;
   protected dyn c;
   protected gu d;

   public dvi(dvp $$0, int $$1, dys $$2, aer $$3, String $$4, dyn $$5, gu $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ha.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dvi(dvp $$0, qr $$1, dys $$2, Function<aer, dyn> $$3) {
      super($$0, $$1);
      this.a(ha.c);
      this.a = $$1.l("Template");
      this.d = new gu($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aer $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aer b() {
      return new aer(this.a);
   }

   @Override
   protected void a(dvo $$0, qr $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cqf $$0, cqd $$1, dgw $$2, aru $$3, duq $$4, cos $$5, gu $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dyr.c $$8 : this.b.a(this.d, this.c, csm.pa)) {
            if ($$8.c() != null) {
               dgj $$9 = dgj.valueOf($$8.c().l("mode"));
               if ($$9 == dgj.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dyr.c $$11 : this.b.a(this.d, this.c, csm.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dez $$13 = csm.a.n();

               try {
                  $$13 = fg.a($$0.a(jc.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, gu var2, cqa var3, aru var4, duq var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public cyx a() {
      return this.c.d();
   }

   public dyr c() {
      return this.b;
   }

   public gu d() {
      return this.d;
   }

   public dyn e() {
      return this.c;
   }
}
