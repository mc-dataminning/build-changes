import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class dzj extends dzd {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected ecz b;
   protected ecv c;
   protected hx d;

   public dzj(dzq $$0, int $$1, eda $$2, ahd $$3, String $$4, ecv $$5, hx $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ic.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public dzj(dzq $$0, sl $$1, eda $$2, Function<ahd, ecv> $$3) {
      super($$0, $$1);
      this.a(ic.c);
      this.a = $$1.l("Template");
      this.d = new hx($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      ahd $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected ahd b() {
      return new ahd(this.a);
   }

   @Override
   protected void a(dzp $$0, sl $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cud $$0, cub $$1, dkx $$2, aup $$3, dyr $$4, csp $$5, hx $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (ecz.c $$8 : this.b.a(this.d, this.c, cwl.pa)) {
            if ($$8.c() != null) {
               dkk $$9 = dkk.valueOf($$8.c().l("mode"));
               if ($$9 == dkk.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (ecz.c $$11 : this.b.a(this.d, this.c, cwl.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dja $$13 = cwl.a.o();

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

   protected abstract void a(String var1, hx var2, ctx var3, aup var4, dyr var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dcv a() {
      return this.c.d();
   }

   public ecz c() {
      return this.b;
   }

   public hx d() {
      return this.d;
   }

   public ecv e() {
      return this.c;
   }
}
