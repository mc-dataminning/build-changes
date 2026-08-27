import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhv extends dep implements dck {
   public static final MapCodec<dhv> c = b(dhv::new);
   public static final dqi d = dpy.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final etc h = dch.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final etc i = dch.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final etc j = dch.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final etc k = dch.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final etc[] l = new etc[]{dch.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final etc[] m = new etc[]{j, dch.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dhv> a() {
      return c;
   }

   public dhv(dph.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      return this.n();
   }

   @Override
   public etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$0.c(b) == dqe.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dqe.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dcj.a.n();
      }
   }

   @Override
   public boolean a(dpi $$0, czj $$1, id $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(dcj.cC);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      if ($$3 instanceof chl && $$1.aa().b(czc.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dpi $$0, cux $$1) {
      return false;
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, bqt $$3, crs $$4) {
   }

   @Override
   public boolean e_(dpi $$0) {
      return $$0.c(b) == dqe.b && !this.n($$0);
   }

   @Override
   public void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      float $$4 = dec.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(apu $$0, dpi $$1, id $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dpi $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dqe.a), 3);
         }
      }
   }

   private static boolean a(czj $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dcj.kB);
   }

   private static boolean b(czj $$0, id $$1) {
      return dec.a($$0, $$1);
   }

   private static boolean m(dpi $$0) {
      return $$0.a(dcj.kB) && $$0.c(b) == dqe.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(czj $$0, id $$1, dpi $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dpi $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dhv.a d(czj $$0, id $$1, dpi $$2) {
      if (m($$2)) {
         return new dhv.a($$1, $$2);
      } else {
         id $$3 = $$1.d();
         dpi $$4 = $$0.a_($$3);
         return m($$4) ? new dhv.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      dhv.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      dhv.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(id a, dpi b) {
   }
}
