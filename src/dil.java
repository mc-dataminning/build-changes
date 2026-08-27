import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dil extends ddm {
   public static final MapCodec<dil> a = b(dil::new);
   public static final drx b = dhw.aE;
   public static final dru c = drt.w;
   public static final dru d = drt.o;
   public static final evf e = dea.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final evf f = dea.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final evf g = evc.a(e, f);
   public static final evf h = dea.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final evf i = evc.a(g, h);
   public static final evf j = evc.a(
      dea.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dea.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dea.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final evf k = evc.a(
      dea.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dea.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dea.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final evf l = evc.a(
      dea.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dea.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dea.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final evf m = evc.a(
      dea.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dea.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dea.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.c;
   }

   @Override
   protected evf f(drd $$0, daf $$1, io $$2) {
      return g;
   }

   @Override
   protected boolean f_(drd $$0) {
      return true;
   }

   @Override
   public drd a(cxb $$0) {
      daz $$1 = $$0.q();
      ctq $$2 = $$0.n();
      cly $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cwf $$5 = $$2.a(kb.N, cwf.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.n().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return i;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      switch ((it)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpk($$0, $$1);
   }

   public static boolean a(@Nullable brw $$0, daz $$1, io $$2, drd $$3, ctq $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable brw $$0, daz $$1, io $$2, drd $$3, ctq $$4) {
      if ($$1.c_($$2) instanceof dpk $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avi.cz, avj.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable brw $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      drd $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dvw.c, $$2, dvw.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(daz $$0, io $$1, drd $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(daz $$0, io $$1, drd $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(daz $$0, io $$1, drd $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(drd $$0, daz $$1, io $$2) {
      if ($$1.c_($$2) instanceof dpk $$4) {
         it $$5 = $$0.c(b);
         ctq $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cii $$9 = new cii($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$3 == it.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      if ($$0.c(d)) {
         doi $$3 = $$1.c_($$2);
         if ($$3 instanceof dpk) {
            return ((dpk)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$1.c(d)) {
         return bpy.d;
      } else if ($$0.a(awf.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bpy.a($$2.B) : bpy.e;
      } else {
         return $$0.e() && $$5 == bpv.a ? bpy.e : bpy.d;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bpw.a($$1.B);
      } else {
         return bpw.b;
      }
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(daz $$0, io $$1, cly $$2) {
      doi $$3 = $$0.c_($$1);
      if ($$3 instanceof dpk) {
         $$2.a((dpk)$$3);
         $$2.a(avs.au);
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
