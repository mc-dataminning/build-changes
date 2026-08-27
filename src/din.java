import com.mojang.serialization.MapCodec;

public class din extends dkh implements dkz {
   public static final MapCodec<din> b = b(din::new);
   public static final drs c = drr.C;
   public static final drs d = drr.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<din> a() {
      return b;
   }

   public din(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emv.c;
      return this.n().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(c) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(drb $$0, dax $$1, io $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(drb $$0, dax $$1, io $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$1.ab() && (long)$$1.z.a(200) <= $$1.Y() % 200L && $$2.v() == $$1.a(dwt.a.b, $$2.u(), $$2.w()) - 1) {
         ayg.a($$0.c(a).o(), $$1, $$2, 0.125, ky.aT, bpf.a(1, 2));
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.O().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   protected void a(dax $$0, drb $$1, eug $$2, cmo $$3) {
      if ($$0.ab() && $$3 instanceof cnb && ((cnb)$$3).K()) {
         io $$4 = $$2.a();
         if ($$0.h($$4)) {
            bsn $$5 = bsa.am.a($$0);
            if ($$5 != null) {
               $$5.e(euk.c($$4.c()));
               bru $$6 = $$3.s();
               $$5.b($$6 instanceof aqn ? (aqn)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, avh.zE, avi.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }
}
