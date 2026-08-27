import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends dgi implements ded {
   public static final MapCodec<djp> c = b(djp::new);
   public static final dsd d = drt.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final evf h = dea.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final evf i = dea.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final evf j = dea.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final evf k = dea.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final evf[] l = new evf[]{dea.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final evf[] m = new evf[]{j, dea.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<djp> a() {
      return c;
   }

   public djp(drc.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      return this.n();
   }

   @Override
   public evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return $$0.c(b) == drz.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == drz.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : dec.a.n();
      }
   }

   @Override
   public boolean a(drd $$0, dbc $$1, io $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(dec.cC);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if ($$3 instanceof cjj && $$1.aa().b(dav.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(drd $$0, cxb $$1) {
      return false;
   }

   @Override
   public void a(daz $$0, io $$1, drd $$2, bsq $$3, ctq $$4) {
   }

   @Override
   public boolean d_(drd $$0) {
      return $$0.c(b) == drz.b && !this.n($$0);
   }

   @Override
   public void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      float $$4 = dfv.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqn $$0, drd $$1, io $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         drd $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, drz.a), 3);
         }
      }
   }

   private static boolean a(dbc $$0, io $$1) {
      drd $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(dec.kB);
   }

   private static boolean b(dbc $$0, io $$1) {
      return dfv.a($$0, $$1);
   }

   private static boolean m(drd $$0) {
      return $$0.a(dec.kB) && $$0.c(b) == drz.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dbc $$0, io $$1, drd $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(drd $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private djp.a d(dbc $$0, io $$1, drd $$2) {
      if (m($$2)) {
         return new djp.a($$1, $$2);
      } else {
         io $$3 = $$1.d();
         drd $$4 = $$0.a_($$3);
         return m($$4) ? new djp.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      djp.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      djp.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(io a, drd b) {
   }
}
