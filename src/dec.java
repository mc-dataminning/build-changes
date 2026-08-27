import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dec extends daw implements cyr {
   public static final MapCodec<dec> c = b(dec::new);
   public static final dmf d = dlv.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eol h = cyo.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eol i = cyo.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eol j = cyo.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eol k = cyo.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eol[] l = new eol[]{cyo.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eol[] m = new eol[]{j, cyo.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dec> a() {
      return c;
   }

   public dec(dle.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      return this.o();
   }

   @Override
   public eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return $$0.c(b) == dmb.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dmb.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cyq.a.o();
      }
   }

   @Override
   public boolean a(dlf $$0, cvq $$1, hz $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(cyq.cC);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, bno $$3) {
      if ($$3 instanceof ces && $$1.Z().b(cvj.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dlf $$0, crg $$1) {
      return false;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, bog $$3, coz $$4) {
   }

   @Override
   public boolean e_(dlf $$0) {
      return $$0.c(b) == dmb.b && !this.n($$0);
   }

   @Override
   public void b(dlf $$0, aov $$1, hz $$2, awo $$3) {
      float $$4 = daj.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aov $$0, dlf $$1, hz $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dlf $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dmb.a), 3);
         }
      }
   }

   private static boolean a(cvq $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cyq.kB);
   }

   private static boolean b(cvq $$0, hz $$1) {
      return daj.a($$0, $$1);
   }

   private static boolean m(dlf $$0) {
      return $$0.a(cyq.kB) && $$0.c(b) == dmb.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cvq $$0, hz $$1, dlf $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dlf $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dec.a d(cvq $$0, hz $$1, dlf $$2) {
      if (m($$2)) {
         return new dec.a($$1, $$2);
      } else {
         hz $$3 = $$1.d();
         dlf $$4 = $$0.a_($$3);
         return m($$4) ? new dec.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(cvq $$0, hz $$1, dlf $$2) {
      dec.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cvn $$0, awo $$1, hz $$2, dlf $$3) {
      return true;
   }

   @Override
   public void a(aov $$0, awo $$1, hz $$2, dlf $$3) {
      dec.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hz a, dlf b) {
   }
}
