import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dvm extends dvg {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected dyv b;
   protected dyr c;
   protected gw d;

   public dvm(dvt $$0, int $$1, dyw $$2, aez $$3, String $$4, dyr $$5, gw $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ha.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dvm(dvt $$0, qw $$1, dyw $$2, Function<aez, dyr> $$3) {
      super($$0, $$1);
      this.a(ha.c);
      this.a = $$1.l("Template");
      this.d = new gw($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aez $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aez b() {
      return new aez(this.a);
   }

   @Override
   protected void a(dvs $$0, qw $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cqv $$0, cqt $$1, dha $$2, ash $$3, duu $$4, cpi $$5, gw $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (dyv.c $$8 : this.b.a(this.d, this.c, cte.pa)) {
            if ($$8.c() != null) {
               dgn $$9 = dgn.valueOf($$8.c().l("mode"));
               if ($$9 == dgn.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (dyv.c $$11 : this.b.a(this.d, this.c, cte.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dfd $$13 = cte.a.o();

               try {
                  $$13 = fi.a($$0.a(jc.e), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, gw var2, cqq var3, ash var4, duu var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public czn a() {
      return this.c.d();
   }

   public dyv c() {
      return this.b;
   }

   public gw d() {
      return this.d;
   }

   public dyr e() {
      return this.c;
   }
}
