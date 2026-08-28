import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cvd extends cxi {
   private static final float l = 1.25F;
   public static final int a = 8;
   private boolean m = false;
   private boolean n = false;
   private static final float o = 0.2F;
   private static final float p = 0.5F;
   private static final float q = 3.15F;
   private static final float r = 1.6F;
   public static final float b = 1.6F;
   private static final cvd.a s = new cvd.a(Optional.of(awn.gr), Optional.of(awn.gq), Optional.of(awn.gp));

   public cvd(cwi.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cwm> d() {
      return d;
   }

   @Override
   public Predicate<cwm> b() {
      return c;
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      cyr $$4 = $$3.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bsk.c;
      } else if (!$$1.d($$3).f()) {
         this.m = false;
         this.n = false;
         $$1.c($$2);
         return bsk.c;
      } else {
         return bsk.d;
      }
   }

   private static float a(cyr $$0) {
      return $$0.a(cwq.uM) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cwm $$0, dfm $$1, bvh $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cvd.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dA(), $$2.dC(), $$2.dG(), (awm)$$2x.a(), $$2.dm(), 1.0F, 1.0F / ($$1.G_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bvh $$0, cwm $$1) {
      List<cwm> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ku.O, cyr.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cwm $$0) {
      cyr $$1 = $$0.a(ku.O, cyr.a);
      return !$$1.b();
   }

   @Override
   protected void a(bvh $$0, cpn $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvh $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new ezy($$7, $$10, $$8), $$5);
      } else {
         ezy $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         ezy $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awn.gv, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(bvh $$0, ezy $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ezy $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cpn a(dfm $$0, bvh $$1, cwm $$2, cwm $$3, boolean $$4) {
      if ($$3.a(cwq.uM)) {
         return new cpi($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         cpn $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cpb $$6) {
            $$6.b(awn.go);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cwm $$0) {
      return $$0.a(cwq.uM) ? 3 : 1;
   }

   public void a(dfm $$0, bvh $$1, bsj $$2, cwm $$3, float $$4, float $$5, @Nullable bvh $$6) {
      if ($$0 instanceof arp $$7) {
         cyr $$9 = $$3.b(ku.O, cyr.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cou, $$6);
            if ($$1 instanceof arq $$10) {
               ao.G.a($$10, $$3);
               $$10.b(awx.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azu $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azu $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dfm $$0, bvh $$1, cwm $$2, int $$3) {
      if (!$$0.C) {
         cvd.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.m = false;
            this.n = false;
         }

         if ($$5 >= 0.2F && !this.m) {
            this.m = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awm)$$2x.a(), awo.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.n) {
            this.n = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awm)$$2x.a(), awo.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cwm $$0, bvh $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cwm $$0, bvh $$1) {
      float $$2 = dcf.a($$0, $$1, 1.25F);
      return azm.d($$2 * 20.0F);
   }

   @Override
   public cwo b(cwm $$0) {
      return cwo.g;
   }

   cvd.a i(cwm $$0) {
      return dcf.b($$0, dce.B).orElse(s);
   }

   private static float a(int $$0, cwm $$1, bvh $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      cyr $$4 = $$0.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         cwm $$5 = $$4.a().get(0);
         $$2.add(xj.c("item.minecraft.crossbow.projectile").b(xi.v).b($$5.J()));
         if ($$3.a() && $$5.a(cwq.uM)) {
            List<xj> $$6 = Lists.newArrayList();
            cwq.uM.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xj.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cwm $$0) {
      return $$0.a((cwi)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jq<awm>> b, Optional<jq<awm>> c, Optional<jq<awm>> d) {
      public static final Codec<cvd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awm.b.optionalFieldOf("start").forGetter(cvd.a::a),
                  awm.b.optionalFieldOf("mid").forGetter(cvd.a::b),
                  awm.b.optionalFieldOf("end").forGetter(cvd.a::c)
               )
               .apply($$0, cvd.a::new)
      );

      public Optional<jq<awm>> a() {
         return this.b;
      }

      public Optional<jq<awm>> b() {
         return this.c;
      }

      public Optional<jq<awm>> c() {
         return this.d;
      }
   }
}
