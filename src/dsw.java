import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dsw extends dib {
   public static final MapCodec<dsw> b = b(dsw::new);
   public static final dua<due> c = dts.bg;
   public static final dtt d = dts.x;
   public static final float e = 4.0F;
   protected static final exv f = dfy.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exv g = dfy.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final exv h = dfy.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final exv i = dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final exv j = dfy.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exv k = dfy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final exv o = dfy.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exv F = dfy.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final exv G = dfy.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final exv H = dfy.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final exv I = dfy.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exv J = dfy.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final exv K = dfy.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final exv L = dfy.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exv M = dfy.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final exv N = dfy.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final exv O = dfy.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final exv P = dfy.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final exv[] Q = a(true);
   private static final exv[] R = a(false);

   @Override
   protected MapCodec<dsw> a() {
      return b;
   }

   private static exv[] a(boolean $$0) {
      return Arrays.stream(ji.values()).map($$1 -> a($$1, $$0)).toArray(exv[]::new);
   }

   private static exv a(ji $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return exs.a(k, $$1 ? L : F);
         case b:
            return exs.a(j, $$1 ? K : o);
         case c:
            return exs.a(i, $$1 ? N : H);
         case d:
            return exs.a(h, $$1 ? M : G);
         case e:
            return exs.a(g, $$1 ? P : J);
         case f:
            return exs.a(f, $$1 ? O : I);
      }
   }

   public dsw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ji.c).a(c, due.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dtc $$0, dtc $$1) {
      dfy $$2 = $$0.c(c) == due.a ? dga.by : dga.br;
      return $$1.a($$2) && $$1.c(dsv.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.B && $$3.fZ().d) {
         jd $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         jd $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dga.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if ($$0.a((dcz)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq($$2.c(c) == due.b ? dga.br : dga.by);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
