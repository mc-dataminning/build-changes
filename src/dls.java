import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dek implements dlz {
   public static final MapCodec<dls> a = b(dls::new);
   public static final dss b = dsr.F;
   public static final dss c = dsr.C;
   public static final dss d = dsr.G;
   protected static final ewj e = dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(je.a.b);

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bst $$3) {
      if ($$0 instanceof are $$4) {
         arf $$5 = dqo.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dpi.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if ($$1 instanceof are $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dpi.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dpi.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return e;
   }

   @Override
   protected ewj f(dsb $$0, dbd $$1, iz $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqo($$0, $$1);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == env.c));
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(c) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpv.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return !$$0.B ? dek.a($$2, dpi.L, ($$0x, $$1x, $$2x, $$3) -> dxd.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }
}
