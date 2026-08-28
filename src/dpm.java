import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dpm extends dku implements dsb {
   public static final MapCodec<dpm> a = b(dpm::new);
   public static final int b = 15;
   public static final dzm c = dzc.aS;
   public static final dzd d = dzc.I;
   public static final ToIntFunction<dym> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   public dpm(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(15)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C && $$3.gF()) {
         $$1.a($$2, $$0.a(c), 2);
         return btq.b;
      } else {
         return btq.c;
      }
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$3.a(cyc.ib) ? fdl.b() : fdl.a();
   }

   @Override
   protected boolean e_(dym $$0) {
      return $$0.y().c();
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }

   @Override
   protected float c(dym $$0, dgv $$1, jj $$2) {
      return 1.0F;
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static cxy a(cxy $$0, int $$1) {
      $$0.b(kx.ao, czx.a.a(c, $$1));
      return $$0;
   }
}
