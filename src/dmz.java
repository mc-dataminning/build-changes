import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dmz extends drd implements dnf, dun {
   public static final MapCodec<dmz> a = b(dmz::new);
   private static final ebv b = ebu.I;
   private static final ecc<ecq> c = ebu.bo;
   private static final int d = -1;
   private static final Object2IntMap<ecq> f = ag.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(ecq.b, 10);
      $$0.put(ecq.c, 10);
      $$0.put(ecq.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<ecq, fgk> D = Maps.newEnumMap(
      Map.of(ecq.a, dnc.b(16.0, 11.0, 15.0), ecq.b, dnc.b(16.0, 11.0, 15.0), ecq.c, dnc.b(16.0, 11.0, 13.0), ecq.d, fgh.a())
   );
   private final Function<ebe, fgk> R;

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jb.c).b(c, ecq.a));
      this.R = this.q();
   }

   private Function<ebe, fgk> q() {
      Map<jb, fgk> $$0 = fgh.c(dnc.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fgh.a(D.get($$1.c(c)), $$0.get($$1.c(e))), new ech[]{b});
   }

   public static void a(djy $$0, azx $$1, iv $$2, jb $$3) {
      int $$4 = azo.a($$1, 2, 5);
      iv.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((djz)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jb.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dna.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jb.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(ebe $$0) {
      return $$0.l() || $$0.a(dne.J) || $$0.a(dne.tp);
   }

   protected static boolean a(djz $$0, iv $$1, ebe $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(djy $$0, iv $$1, exo $$2, jb $$3) {
      ebe $$4 = dne.tn.m().b(b, Boolean.valueOf($$2.a(exp.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      this.a($$1, $$0, $$2.b(), ecq.d, awp.hZ);
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(b) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      ebe $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dne.to) || $$4.a(axe.bB);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$4 == jb.a && !$$0.a($$1, $$3)) {
         return dne.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exp.c, exp.c.a($$1));
         }

         return $$4 == jb.b && $$6.a(this) ? dne.to.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      ebe $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      iv $$4 = $$2.d();
      ebe $$5 = $$0.a_($$4);
      if (a((djz)$$0, $$4, $$5)) {
         jb $$6 = $$3.c(e);
         dna.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!$$1.C) {
         if ($$0.c(c) == ecq.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, ecq.b, null);
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         ecq $$4 = $$0.c(c);
         if ($$4 == ecq.b) {
            this.a($$0, $$1, $$2, ecq.c, awp.hZ);
         } else if ($$4 == ecq.c) {
            this.a($$0, $$1, $$2, ecq.d, awp.hZ);
         } else if ($$4 == ecq.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(djx $$0, iv $$1, awo $$2) {
      float $$3 = azo.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awq.e, 1.0F, $$3);
   }

   private static boolean a(iv $$0, bwt $$1) {
      return $$1.aH() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(ebe $$0, djx $$1, iv $$2, ecq $$3, @Nullable awo $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(ebe $$0, djx $$1, iv $$2) {
      a($$0, $$1, $$2, ecq.a);
      if ($$0.c(c) != ecq.a) {
         a($$1, $$2, awp.ia);
      }
   }

   private static void a(ebe $$0, djx $$1, iv $$2, ecq $$3) {
      ecq $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ege.c, $$2);
      }
   }

   @Override
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a().e());
      exo $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dne.tn) || $$1.a(dne.to);
      return this.m().b(b, Boolean.valueOf($$2.a(exp.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, e, c);
   }
}
