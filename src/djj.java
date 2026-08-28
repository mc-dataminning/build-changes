import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class djj extends dnk implements djp, dqs {
   public static final MapCodec<djj> a = b(djj::new);
   private static final dxo b = dxn.J;
   private static final dxu<dyh> c = dxn.bo;
   private static final int d = -1;
   private static final Object2IntMap<dyh> e = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dyh.b, 10);
      $$0.put(dyh.c, 10);
      $$0.put(dyh.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dyh, fbu> j = ImmutableMap.of(
      dyh.a,
      djm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyh.b,
      djm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyh.c,
      djm.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dyh.d,
      fbr.a()
   );
   private static final fbu k = djm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbu> l = ImmutableMap.of(
      jn.c, fbr.b(djk.b, k, fbe.e), jn.d, fbr.b(djk.c, k, fbe.e), jn.f, fbr.b(djk.d, k, fbe.e), jn.e, fbr.b(djk.e, k, fbe.e)
   );
   private final Map<dwx, fbu> m;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jn.c).b(c, dyh.a));
      this.m = this.a(djj::o);
   }

   private static fbu o(dwx $$0) {
      return fbr.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dgj $$0, azh $$1, ji $$2, jn $$3) {
      int $$4 = ayz.a($$1, 2, 5);
      ji.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dgk)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jn.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         djk.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jn.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dwx $$0) {
      return $$0.l() || $$0.a(djo.J) || $$0.a(djo.th);
   }

   protected static boolean a(dgk $$0, ji $$1, dwx $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dgj $$0, ji $$1, esz $$2, jn $$3) {
      dwx $$4 = djo.tf.m().b(b, Boolean.valueOf($$2.a(eta.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
      this.a($$1, $$0, $$2.b(), dyh.d, awa.hW);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(b) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwx $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(djo.tg) || $$4.a(awp.bA);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djo.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eta.c, eta.c.a($$1));
         }

         return $$4 == jn.b && $$6.a(this) ? djo.tg.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      dwx $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      ji $$4 = $$2.d();
      dwx $$5 = $$0.a_($$4);
      if (a((dgk)$$0, $$4, $$5)) {
         jn $$6 = $$3.c(aF);
         djk.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dyh.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dyh.b, null);
         }
      }
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dyh $$4 = $$0.c(c);
         if ($$4 == dyh.b) {
            this.a($$0, $$1, $$2, dyh.c, awa.hW);
         } else if ($$4 == dyh.c) {
            this.a($$0, $$1, $$2, dyh.d, awa.hW);
         } else if ($$4 == dyh.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dgi $$0, ji $$1, avz $$2) {
      float $$3 = ayz.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(ji $$0, bul $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dwx $$0, dgi $$1, ji $$2, dyh $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dwx $$0, dgi $$1, ji $$2) {
      a($$0, $$1, $$2, dyh.a);
      if ($$0.c(c) != dyh.a) {
         a($$1, $$2, awa.hX);
      }
   }

   private static void a(dwx $$0, dgi $$1, ji $$2, dyh $$3) {
      dyh $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ebt.c, $$2);
      }
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.m.get($$0);
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = $$0.q().a_($$0.a().e());
      esz $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(djo.tf) || $$1.a(djo.tg);
      return this.m().b(b, Boolean.valueOf($$2.a(eta.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, aF, c);
   }
}
