import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ebv extends ebp {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected efl b;
   protected efh c;
   protected hz d;

   public ebv(ecc $$0, int $$1, efm $$2, aiy $$3, String $$4, efh $$5, hz $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(ie.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ebv(ecc $$0, sw $$1, efm $$2, Function<aiy, efh> $$3) {
      super($$0, $$1);
      this.a(ie.c);
      this.a = $$1.l("Template");
      this.d = new hz($$1.h("TPX"), $$1.h("TPY"), $$1.h("TPZ"));
      aiy $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected aiy b() {
      return new aiy(this.a);
   }

   @Override
   protected void a(ecb $$0, sw $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(cwm $$0, cwk $$1, dng $$2, awp $$3, ebd $$4, cuy $$5, hz $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (efl.c $$8 : this.b.a(this.d, this.c, cyu.pa)) {
            if ($$8.c() != null) {
               dmt $$9 = dmt.valueOf($$8.c().l("mode"));
               if ($$9 == dmt.d) {
                  this.a($$8.c().l("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (efl.c $$11 : this.b.a(this.d, this.c, cyu.pb)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().l("final_state");
               dlj $$13 = cyu.a.o();

               try {
                  $$13 = fm.a($$0.a(kg.f), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, hz var2, cwg var3, awp var4, ebd var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dfe a() {
      return this.c.d();
   }

   public efl c() {
      return this.b;
   }

   public hz d() {
      return this.d;
   }

   public efh e() {
      return this.c;
   }
}
