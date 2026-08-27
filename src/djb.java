import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djb extends den {
   public static final MapCodec<djb> a = b(djb::new);
   public static final dtw b = dts.Q;
   public static final dtt c = dts.f;
   private static final exn d = dfc.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final exn e = dfc.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final exn f = exk.a(e, d);
   private static final exn g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final exn h = exk.a(f, g, ewy.e);
   private static final exn i = exk.a(h, dfc.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final exn j = exk.a(h, dfc.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final exn k = exk.a(h, dfc.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final exn l = exk.a(h, dfc.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final exn m = exk.a(h, dfc.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final exn n = g;
   private static final exn o = exk.a(g, dfc.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final exn F = exk.a(g, dfc.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final exn G = exk.a(g, dfc.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final exn H = exk.a(g, dfc.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   public djb(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((iw)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2) {
      switch ((iw)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dtc a(cyd $$0) {
      iw $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == iw.a.b ? iw.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new drc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return $$0.C ? null : a($$2, dqe.s, drc::a);
   }

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         dqc $$5 = $$1.c_($$2);
         if ($$5 instanceof drc) {
            $$3.a((drc)$$5);
            $$3.a(avz.ae);
         }

         return bqa.b;
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dca $$0, ir $$1, dtc $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      bpw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.c;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return cpg.a($$1.c_($$2));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      dqc $$4 = $$1.c_($$2);
      if ($$4 instanceof drc) {
         drc.a($$1, $$2, $$0, $$3, (drc)$$4);
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
