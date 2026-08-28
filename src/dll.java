import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dll extends dgh implements dgb {
   public static final MapCodec<dll> a = b(dll::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dtw d = dts.R;
   public static final duc e = dts.S;
   private static final BiFunction<ji, Integer, ext> f = ad.a(
      ($$0, $$1) -> {
         ext[] $$2 = new ext[]{
            dfy.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dfy.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dfy.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dfy.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ext $$3 = exq.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = exq.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   protected dll(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, ji.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dtc a(dtc $$0, dmm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dtc $$0, cyd $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cuq(this));
      }
   }
}
