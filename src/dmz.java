import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class dmz extends dhv implements dhp {
   public static final MapCodec<dmz> a = b(dmz::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dvm d = dvi.R;
   public static final dvs e = dvi.S;
   private static final BiFunction<jk, Integer, ezq> f = ad.a(
      ($$0, $$1) -> {
         ezq[] $$2 = new ezq[]{
            dhm.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            dhm.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            dhm.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            dhm.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         ezq $$3 = ezn.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = ezn.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, jk.c).b(e, Integer.valueOf(1)));
   }

   @Override
   public dus a(dus $$0, doa $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   public dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dus $$0, czn $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.n().b(d, $$0.g().g());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return true;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.b(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new cvs(this));
      }
   }
}
