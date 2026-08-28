import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class djk extends dnl implements djq, dqt {
   public static final MapCodec<djk> a = b(djk::new);
   private static final dxp b = dxo.J;
   private static final dxv<dyi> c = dxo.bo;
   private static final int d = -1;
   private static final Object2IntMap<dyi> e = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dyi.b, 10);
      $$0.put(dyi.c, 10);
      $$0.put(dyi.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dyi, fbv> j = ImmutableMap.of(
      dyi.a,
      djn.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyi.b,
      djn.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyi.c,
      djn.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dyi.d,
      fbs.a()
   );
   private static final fbv k = djn.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbv> l = ImmutableMap.of(
      jn.c, fbs.b(djl.b, k, fbf.e), jn.d, fbs.b(djl.c, k, fbf.e), jn.f, fbs.b(djl.d, k, fbf.e), jn.e, fbs.b(djl.e, k, fbf.e)
   );
   private final Map<dwy, fbv> m;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jn.c).b(c, dyi.a));
      this.m = this.a(djk::o);
   }

   private static fbv o(dwy $$0) {
      return fbs.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dgk $$0, azh $$1, ji $$2, jn $$3) {
      int $$4 = ayz.a($$1, 2, 5);
      ji.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dgl)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jn.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         djl.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jn.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dwy $$0) {
      return $$0.l() || $$0.a(djp.J) || $$0.a(djp.th);
   }

   protected static boolean a(dgl $$0, ji $$1, dwy $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dgk $$0, ji $$1, eta $$2, jn $$3) {
      dwy $$4 = djp.tf.m().b(b, Boolean.valueOf($$2.a(etb.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      this.a($$1, $$0, $$2.b(), dyi.d, awa.hW);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(b) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwy $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(djp.tg) || $$4.a(awp.bA);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djp.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etb.c, etb.c.a($$1));
         }

         return $$4 == jn.b && $$6.a(this) ? djp.tg.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      dwy $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      ji $$4 = $$2.d();
      dwy $$5 = $$0.a_($$4);
      if (a((dgl)$$0, $$4, $$5)) {
         jn $$6 = $$3.c(aF);
         djl.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dyi.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dyi.b, null);
         }
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dyi $$4 = $$0.c(c);
         if ($$4 == dyi.b) {
            this.a($$0, $$1, $$2, dyi.c, awa.hW);
         } else if ($$4 == dyi.c) {
            this.a($$0, $$1, $$2, dyi.d, awa.hW);
         } else if ($$4 == dyi.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dgj $$0, ji $$1, avz $$2) {
      float $$3 = ayz.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(ji $$0, bum $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dwy $$0, dgj $$1, ji $$2, dyi $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dwy $$0, dgj $$1, ji $$2) {
      a($$0, $$1, $$2, dyi.a);
      if ($$0.c(c) != dyi.a) {
         a($$1, $$2, awa.hX);
      }
   }

   private static void a(dwy $$0, dgj $$1, ji $$2, dyi $$3) {
      dyi $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ebu.c, $$2);
      }
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.m.get($$0);
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a().e());
      eta $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(djp.tf) || $$1.a(djp.tg);
      return this.m().b(b, Boolean.valueOf($$2.a(etb.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, aF, c);
   }
}
