import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dka extends dob implements dkg, drj {
   public static final MapCodec<dka> a = b(dka::new);
   private static final dyf b = dye.J;
   private static final dyl<dyy> c = dye.bo;
   private static final int d = -1;
   private static final Object2IntMap<dyy> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dyy.b, 10);
      $$0.put(dyy.c, 10);
      $$0.put(dyy.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dyy, fcl> j = ImmutableMap.of(
      dyy.a,
      dkd.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyy.b,
      dkd.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyy.c,
      dkd.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dyy.d,
      fci.a()
   );
   private static final fcl k = dkd.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fcl> l = ImmutableMap.of(
      jm.c, fci.b(dkb.b, k, fbv.e), jm.d, fci.b(dkb.c, k, fbv.e), jm.f, fci.b(dkb.d, k, fbv.e), jm.e, fci.b(dkb.e, k, fbv.e)
   );
   private final Map<dxo, fcl> m;

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   protected dka(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dyy.a));
      this.m = this.a(dka::o);
   }

   private static fcl o(dxo $$0) {
      return fci.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dha $$0, bac $$1, jh $$2, jm $$3) {
      int $$4 = azu.a($$1, 2, 5);
      jh.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jm.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dkb.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dxo $$0) {
      return $$0.l() || $$0.a(dkf.J) || $$0.a(dkf.th);
   }

   protected static boolean a(dhb $$0, jh $$1, dxo $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dha $$0, jh $$1, etq $$2, jm $$3) {
      dxo $$4 = dkf.tf.m().b(b, Boolean.valueOf($$2.a(etr.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      this.a($$1, $$0, $$2.b(), dyy.d, awv.hW);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(b) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxo $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dkf.tg) || $$4.a(axk.bA);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dkf.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etr.c, etr.c.a($$1));
         }

         return $$4 == jm.b && $$6.a(this) ? dkf.tg.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      dxo $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      jh $$4 = $$2.d();
      dxo $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dkb.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dyy.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dyy.b, null);
         }
      }
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dyy $$4 = $$0.c(c);
         if ($$4 == dyy.b) {
            this.a($$0, $$1, $$2, dyy.c, awv.hW);
         } else if ($$4 == dyy.c) {
            this.a($$0, $$1, $$2, dyy.d, awv.hW);
         } else if ($$4 == dyy.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dgz $$0, jh $$1, awu $$2) {
      float $$3 = azu.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aww.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bvb $$1) {
      return $$1.aJ() && $$1.du().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dxo $$0, dgz $$1, jh $$2, dyy $$3, @Nullable awu $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dxo $$0, dgz $$1, jh $$2) {
      a($$0, $$1, $$2, dyy.a);
      if ($$0.c(c) != dyy.a) {
         a($$1, $$2, awv.hX);
      }
   }

   private static void a(dxo $$0, dgz $$1, jh $$2, dyy $$3) {
      dyy $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eck.c, $$2);
      }
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return this.m.get($$0);
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a().e());
      etq $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dkf.tf) || $$1.a(dkf.tg);
      return this.m().b(b, Boolean.valueOf($$2.a(etr.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, aF, c);
   }
}
