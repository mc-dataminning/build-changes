import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class deb extends dib {
   public static final MapCodec<deb> a = b(deb::new);
   public static final dtw b = djc.aE;
   private static final exn c = dfc.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final exn d = dfc.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final exn e = dfc.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final exn f = dfc.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final exn g = dfc.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final exn h = dfc.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final exn i = dfc.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final exn j = exk.a(c, d, e, f);
   private static final exn k = exk.a(c, g, h, i);
   private static final xe l = xe.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public deb(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         return bqa.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.aD);
         return bqa.b;
      }
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      return new bqk(($$2x, $$3, $$4) -> new cpi($$2x, $$3, cpr.a($$1, $$2)), l);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      iw $$4 = $$0.c(b);
      return $$4.o() == iw.a.a ? j : k;
   }

   @Override
   protected void a(cif $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, dtc $$3, cif $$4) {
      if (!$$4.ba()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dca $$0, ir $$1, cif $$2) {
      if (!$$2.ba()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bqt a(brv $$0) {
      return $$0.dX().b($$0);
   }

   @Nullable
   public static dtc e(dtc $$0) {
      if ($$0.a(dfe.hM)) {
         return dfe.hN.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dfe.hN) ? dfe.hO.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   public int b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.d($$1, $$2).al;
   }
}
