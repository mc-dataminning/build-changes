import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpd extends dhv implements dpk {
   public static final MapCodec<dpd> a = b(dpd::new);
   public static final dwf b = dwe.F;
   public static final dwf c = dwe.C;
   public static final dwf d = dwe.G;
   protected static final fal e = dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jm.a.b);

   @Override
   public MapCodec<dpd> a() {
      return a;
   }

   public dpd(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, bui $$3) {
      if ($$0 instanceof arq $$4) {
         arr $$5 = dub.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dst.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if ($$1 instanceof arq $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dst.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dst.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return e;
   }

   @Override
   protected fal d_(dvo $$0) {
      return e;
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dub($$0, $$1);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == erp.c));
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, cwf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brj.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return !$$0.C ? dhv.a($$2, dst.L, ($$0x, $$1x, $$2x, $$3) -> eat.c.a($$0x, $$3.gx(), $$3.gy())) : null;
   }
}
