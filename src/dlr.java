import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends dej implements dly {
   public static final MapCodec<dlr> a = b(dlr::new);
   public static final dsr b = dsq.F;
   public static final dsr c = dsq.C;
   public static final dsr d = dsq.G;
   protected static final ewi e = dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(je.a.b);

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, bss $$3) {
      if ($$0 instanceof are $$4) {
         arf $$5 = dqn.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dph.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if ($$1 instanceof are $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dph.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dph.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return e;
   }

   @Override
   protected ewi f(dsa $$0, dbc $$1, iz $$2) {
      return e;
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqn($$0, $$1);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      return this.o().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == enu.c));
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, cun $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpu.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return !$$0.B ? dej.a($$2, dph.L, ($$0x, $$1x, $$2x, $$3) -> dxc.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }
}
