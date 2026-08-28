import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dph extends dhj {
   public static final MapCodec<dph> a = b(dph::new);
   private static final xd d = xd.c("container.stonecutter");
   public static final dvi b = dlf.aF;
   protected static final ezm c = dhj.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   public dph(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jj.c));
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, $$0.g().g());
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awo.ay);
      }

      return brp.a;
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      return new brx(($$2x, $$3, $$4) -> new csz($$2x, $$3, crj.a($$1, $$2)), d);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   protected boolean g_(duo $$0) {
      return true;
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.c;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
