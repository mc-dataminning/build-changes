import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class elm extends elg {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected epe b;
   protected epa c;
   protected je d;

   public elm(elt $$0, int $$1, epf $$2, alc $$3, String $$4, epa $$5, je $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jj.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public elm(elt $$0, uf $$1, epf $$2, Function<alc, epa> $$3) {
      super($$0, $$1);
      this.a(jj.c);
      this.a = $$1.l("Template");
      this.d = new je($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      alc $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alc b() {
      return alc.a(this.a);
   }

   @Override
   protected void a(els $$0, uf $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dfd $$0, dfb $$1, dwl $$2, azl $$3, eku $$4, ddm $$5, je $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (epe.c $$8 : this.b.a(this.d, this.c, dhl.pa)) {
            if ($$8.c() != null) {
               dvy $$9 = dvy.valueOf($$8.c().l("mode"));
               if ($$9 == dvy.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (epe.c $$11 : this.b.a(this.d, this.c, dhl.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               duo $$13 = dhl.a.o();

               try {
                  $$13 = gn.a($$0.a(lv.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, je var2, dew var3, azl var4, eku var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dnx a() {
      return this.c.d();
   }

   public epe c() {
      return this.b;
   }

   public je d() {
      return this.d;
   }

   public epa e() {
      return this.c;
   }
}
