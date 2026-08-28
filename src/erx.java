import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.function.Function;
import org.slf4j.Logger;

public abstract class erx extends err {
   private static final Logger h = LogUtils.getLogger();
   protected final String a;
   protected evp b;
   protected evl c;
   protected iv d;

   public erx(ese $$0, int $$1, evq $$2, alg $$3, String $$4, evl $$5, iv $$6) {
      super($$0, $$1, $$2.a($$3).b($$5, $$6));
      this.a(jb.c);
      this.a = $$4;
      this.d = $$6;
      this.b = $$2.a($$3);
      this.c = $$5;
   }

   public erx(ese $$0, tz $$1, evq $$2, Function<alg, evl> $$3) {
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
   protected void a(esd $$0, tz $$1) {
      $$1.a("TPX", this.d.u());
      $$1.a("TPY", this.d.v());
      $$1.a("TPZ", this.d.w());
      $$1.a("Template", this.a);
   }

   @Override
   public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
      this.c.a($$4);
      this.f = this.b.b(this.c, this.d);
      if (this.b.a($$0, this.d, $$6, this.c, $$3, 2)) {
         for (evp.d $$8 : this.b.a(this.d, this.c, dmt.pG)) {
            if ($$8.c() != null) {
               ecd $$9 = $$8.c().<ecd>a("mode", ecd.e).orElseThrow();
               if ($$9 == ecd.d) {
                  this.a($$8.c().j("metadata"), $$8.a(), $$0, $$3, $$4);
               }
            }
         }

         for (evp.d $$11 : this.b.a(this.d, this.c, dmt.pH)) {
            if ($$11.c() != null) {
               String $$12 = $$11.c().j("final_state");
               eat $$13 = dmt.a.m();

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

   protected abstract void a(String var1, iv var2, dkd var3, azv var4, erf var5);

   @Deprecated
   @Override
   public void a(int $$0, int $$1, int $$2) {
      super.a($$0, $$1, $$2);
      this.d = this.d.b($$0, $$1, $$2);
   }

   @Override
   public dtl a() {
      return this.c.d();
   }

   public evp c() {
      return this.b;
   }

   public iv d() {
      return this.d;
   }

   public evl e() {
      return this.c;
   }
}
