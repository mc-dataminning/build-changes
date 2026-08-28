import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drt extends dkg implements dsb {
   public static final MapCodec<drt> a = b(drt::new);
   public static final dzd b = dzc.C;
   public static final dzd c = dzc.I;
   public static final dzd d = dzc.e;
   private static final fdo f = dku.b(16.0, 0.0, 8.0);
   public static final double e = f.c(jo.a.b);

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   public drt(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bvs $$3) {
      if ($$0 instanceof arn $$4) {
         aro $$5 = dwx.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dvn.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dvn.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return f;
   }

   @Override
   protected fdo d_(dym $$0) {
      return f;
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dwx($$0, $$1);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == euu.c));
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(c) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bss.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return !$$0.C ? dkg.a($$2, dvn.M, ($$0x, $$1x, $$2x, $$3) -> edv.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }
}
