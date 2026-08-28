import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drc extends djp implements drj {
   public static final MapCodec<drc> a = b(drc::new);
   public static final dyf b = dye.D;
   public static final dyf c = dye.J;
   public static final dyf d = dye.f;
   protected static final fcl e = dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   public drc(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvb $$3) {
      if ($$0 instanceof arx $$4) {
         ary $$5 = dwb.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dus.M).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if ($$1 instanceof arx $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dus.M).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dus.M).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return e;
   }

   @Override
   protected fcl d_(dxo $$0) {
      return e;
   }

   @Override
   protected boolean g_(dxo $$0) {
      return true;
   }

   @Nullable
   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dwb($$0, $$1);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == etr.c));
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, cxg $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bsc.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return !$$0.C ? djp.a($$2, dus.M, ($$0x, $$1x, $$2x, $$3) -> ect.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }
}
