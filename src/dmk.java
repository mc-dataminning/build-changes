import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends djd implements dgy {
   public static final MapCodec<dmk> c = b(dmk::new);
   public static final dva d = duq.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eyx h = dgv.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eyx i = dgv.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eyx j = dgv.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eyx k = dgv.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eyx[] l = new eyx[]{dgv.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eyx[] m = new eyx[]{j, dgv.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dmk> a() {
      return c;
   }

   public dmk(dtz.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      return this.o();
   }

   @Override
   public eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$0.c(b) == duw.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == duw.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dgx.a.o();
      }
   }

   @Override
   public boolean a(dua $$0, ddv $$1, je $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(dgx.cC);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3 instanceof cla && $$1.ac().b(ddo.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dua $$0, cyw $$1) {
      return false;
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
   }

   @Override
   public boolean f(dua $$0) {
      return $$0.c(b) == duw.b && !this.q($$0);
   }

   @Override
   public void b(dua $$0, arg $$1, je $$2, azk $$3) {
      float $$4 = diq.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(arg $$0, dua $$1, je $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dua $$5 = $$1.b(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(b, duw.a), 3);
         }
      }
   }

   private static boolean a(ddv $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dgx.kB);
   }

   private static boolean b(ddv $$0, je $$1) {
      return diq.a($$0, $$1);
   }

   private static boolean o(dua $$0) {
      return $$0.a(dgx.kB) && $$0.c(b) == duw.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(ddv $$0, je $$1, dua $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(dua $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dmk.a d(ddv $$0, je $$1, dua $$2) {
      if (o($$2)) {
         return new dmk.a($$1, $$2);
      } else {
         je $$3 = $$1.e();
         dua $$4 = $$0.a_($$3);
         return o($$4) ? new dmk.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      dmk.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      dmk.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(je a, dua b) {
   }
}
