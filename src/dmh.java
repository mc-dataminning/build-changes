import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmh extends dkg implements dsb {
   public static final MapCodec<dmh> a = b(dmh::new);
   public static final dzd b = dzc.I;
   private static final fdo c = dku.a(6.0);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dvy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.A, $$0.C ? dvy::a : dvy::b);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axf.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
