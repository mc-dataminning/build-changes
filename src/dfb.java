import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfb extends dej {
   public static final MapCodec<dfb> a = b(dfb::new);
   public static final dsr[] b = new dsr[]{dsq.k, dsq.l, dsq.m};
   protected static final ewi c = ewf.a(dex.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dex.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dpi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return $$0.B ? null : a($$2, dph.l, dpi::a);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         return bqs.a;
      } else {
         dpf $$5 = $$1.c_($$2);
         if ($$5 instanceof dpi) {
            $$3.a((dpi)$$5);
            $$3.a(awj.aa);
         }

         return bqs.c;
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(li.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      bqo.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
