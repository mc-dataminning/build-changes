import com.mojang.serialization.MapCodec;
import java.util.function.BiFunction;

public class czl extends cuj implements cud {
   public static final MapCodec<czl> a = b(czl::new);
   public static final int b = 1;
   public static final int c = 4;
   public static final dgv d = dgr.R;
   public static final dhb e = dgr.S;
   private static final BiFunction<hx, Integer, eiy> f = ac.a(
      ($$0, $$1) -> {
         eiy[] $$2 = new eiy[]{
            cua.a(8.0, 0.0, 8.0, 16.0, 3.0, 16.0),
            cua.a(8.0, 0.0, 0.0, 16.0, 3.0, 8.0),
            cua.a(0.0, 0.0, 0.0, 8.0, 3.0, 8.0),
            cua.a(0.0, 0.0, 8.0, 8.0, 3.0, 16.0)
         };
         eiy $$3 = eiv.a();

         for (int $$4 = 0; $$4 < $$1; $$4++) {
            int $$5 = Math.floorMod($$4 - $$0.e(), 4);
            $$3 = eiv.a($$3, $$2[$$5]);
         }

         return $$3.b();
      }
   );

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   protected czl(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, hx.c).a(e, Integer.valueOf(1)));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(e) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return f.apply($$0.c(d), $$0.c(e));
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(e, Integer.valueOf(Math.min(4, $$1.c(e) + 1))) : this.o().a(d, $$0.g().g());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(d, e);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return true;
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      int $$4 = $$3.c(e);
      if ($$4 < 4) {
         $$0.a($$2, $$3.a(e, Integer.valueOf($$4 + 1)), 2);
      } else {
         a($$0, $$2, new ckj(this));
      }
   }
}
