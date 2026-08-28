import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class ers extends erm {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected evk b;
   protected evg c;
   protected iv d;

   public ers(erz $$0, int $$1, evl $$2, alg $$3, String $$4, evg $$5, iv $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jb.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public ers(erz $$0, tz $$1, evl $$2, Function<alg, evg> $$3) {
      super($$0, $$1);
      this.a(jb.c);
      this.a = $$1.j("Template");
      this.d = new iv($$1.f("TPX"), $$1.f("TPY"), $$1.f("TPZ"));
      alg $$4 = this.b();
      this.b = $$2.a($$4);
      this.c = $$3.apply($$4);
      this.f = this.b.b(this.c, this.d);
   }

   protected alg b() {
      return alg.a(this.a);
   }

   @Override
   protected void a(ery $$0, tz $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dkg $$0, dkd $$1, ecm $$2, azv $$3, era $$4, dio $$5, iv $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (evk.d $$8 : this.b.a(this.d, this.c, dmo.pG)) {
            if ($$8.c() != null) {
               eby $$9 = $$8.c().<eby>a("mode", eby.e).orElseThrow();
               if ($$9 == eby.d) {
                  this.a($$8.c().j("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (evk.d $$11 : this.b.a(this.d, this.c, dmo.pH)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().j("final_state");
               eao $$13 = dmo.a.m();

               try {
                  $$13 = ge.a($$0.a(mh.i), $$12, true).a();
               } catch (CommandSyntaxException var15) {
                  h.error("Error while parsing blockstate {} in jigsaw block @ {}", $$12, $$11.a());
               }

               $$0.a($$11.a(), $$13, 3);
            }
         }
      }
   }

   protected abstract void a(String var1, iv var2, djy var3, azv var4, era var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dtg a() {
      return this.c.d();
   }

   public evk c() {
      return this.b;
   }

   public iv d() {
      return this.d;
   }

   public evg e() {
      return this.c;
   }
}
