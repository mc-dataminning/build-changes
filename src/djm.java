import com.mojang.serialization.MapCodec;

public class djm extends dlg implements dly {
   public static final MapCodec<djm> b = b(djm::new);
   public static final dsr c = dsq.C;
   public static final dsr d = dsq.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<djm> a() {
      return b;
   }

   public djm(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dsa a(cxy $$0) {
      ent $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == enu.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(c) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dsa $$0, dbw $$1, iz $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dsa $$0, dbw $$1, iz $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if ($$1.ac() && (long)$$1.z.a(200) <= $$1.Z() % 200L && $$2.v() == $$1.a(dxs.a.b, $$2.u(), $$2.w()) - 1) {
         azb.a($$0.c(a).o(), $$1, $$2, 0.125, li.aT, bqd.a(1, 2));
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      if ($$0.ac() && $$3 instanceof coa && ((coa)$$3).K()) {
         iz $$4 = $$2.a();
         if ($$0.h($$4)) {
            btm $$5 = bsy.am.a($$0);
            if ($$5 != null) {
               $$5.e(evp.c($$4.c()));
               bss $$6 = $$3.s();
               $$5.b($$6 instanceof arf ? (arf)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, avz.zE, awa.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }
}
