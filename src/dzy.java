import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dzy extends dzs {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected edo b;
   protected edk c;
   protected hx d;

   public dzy(eaf $$0, int $$1, edp $$2, ahh $$3, String $$4, edk $$5, hx $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ic.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dzy(eaf $$0, so $$1, edp $$2, Function<ahh, edk> $$3) {
      super($$0, $$1);
      this.a(ic.c);
      this.a = $$1.l("Template");
      this.d = new hx($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ahh $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ahh b() {
      return new ahh(this.a);
   }

   @Override
   protected void a(eae $$0, so $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cus $$0, cuq $$1, dlm $$2, auw $$3, dzg $$4, cte $$5, hx $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (edo.c $$8 : this.b.a(this.d, this.c, cxa.pa)) {
            if ($$8.c() != null) {
               dkz $$9 = dkz.valueOf($$8.c().l("mode"));
               if ($$9 == dkz.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (edo.c $$11 : this.b.a(this.d, this.c, cxa.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               djp $$13 = cxa.a.o();

               try {
                  $$13 = fk.a($$0.a(ke.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, hx var2, cum var3, auw var4, dzg var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public ddk a() {
      return this.c.d();
   }

   public edo c() {
      return this.b;
   }

   public hx d() {
      return this.d;
   }

   public edk e() {
      return this.c;
   }
}
