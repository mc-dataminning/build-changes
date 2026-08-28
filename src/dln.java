import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dln extends dig implements dgb {
   public static final MapCodec<dln> c = b(dln::new);
   public static final duc d = dts.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ext h = dfy.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ext i = dfy.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ext j = dfy.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ext k = dfy.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ext[] l = new ext[]{dfy.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ext[] m = new ext[]{j, dfy.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dln> a() {
      return c;
   }

   public dln(dtb.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      return this.o();
   }

   @Override
   public ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return $$0.c(b) == dty.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dty.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dga.a.o();
      }
   }

   @Override
   public boolean a(dtc $$0, dcz $$1, jd $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(dga.cC);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3 instanceof cki && $$1.ab().b(dcs.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dtc $$0, cyd $$1) {
      return false;
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, btn $$3, cuq $$4) {
   }

   @Override
   public boolean d_(dtc $$0) {
      return $$0.c(b) == dty.b && !this.n($$0);
   }

   @Override
   public void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      float $$4 = dht.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqu $$0, dtc $$1, jd $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dtc $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.a(b, dty.a), 3);
         }
      }
   }

   private static boolean a(dcz $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dga.kB);
   }

   private static boolean b(dcz $$0, jd $$1) {
      return dht.a($$0, $$1);
   }

   private static boolean m(dtc $$0) {
      return $$0.a(dga.kB) && $$0.c(b) == dty.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dcz $$0, jd $$1, dtc $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean n(dtc $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dln.a d(dcz $$0, jd $$1, dtc $$2) {
      if (m($$2)) {
         return new dln.a($$1, $$2);
      } else {
         jd $$3 = $$1.e();
         dtc $$4 = $$0.a_($$3);
         return m($$4) ? new dln.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      dln.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      dln.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(jd a, dtc b) {
   }
}
