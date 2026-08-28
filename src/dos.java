import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends dhk implements doz {
   public static final MapCodec<dos> a = b(dos::new);
   public static final dvu b = dvt.F;
   public static final dvu c = dvt.C;
   public static final dvu d = dvt.G;
   protected static final fab e = dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(jl.a.b);

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, btz $$3) {
      if ($$0 instanceof arm $$4) {
         arn $$5 = dtq.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dsi.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if ($$1 instanceof arm $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dsi.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dsi.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return e;
   }

   @Override
   protected fab d_(dvd $$0) {
      return e;
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Nullable
   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtq($$0, $$1);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      return this.m().b(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == erf.c));
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(c) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, cvx $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bra.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return !$$0.C ? dhk.a($$2, dsi.L, ($$0x, $$1x, $$2x, $$3) -> eaj.c.a($$0x, $$3.gx(), $$3.gy())) : null;
   }
}
