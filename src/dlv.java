import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends den implements dmc {
   public static final MapCodec<dlv> a = b(dlv::new);
   public static final dsv b = dsu.F;
   public static final dsv c = dsu.C;
   public static final dsv d = dsu.G;
   protected static final ewm e = dfb.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(je.a.b);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   public dlv(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, bsw $$3) {
      if ($$0 instanceof arf $$4) {
         arg $$5 = dqr.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpl.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if ($$1 instanceof arf $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpl.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpl.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return e;
   }

   @Override
   protected ewm f(dse $$0, dbg $$1, iz $$2) {
      return e;
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqr($$0, $$1);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == eny.c));
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(c) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, cur $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpy.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return !$$0.B ? den.a($$2, dpl.L, ($$0x, $$1x, $$2x, $$3) -> dxg.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }
}
