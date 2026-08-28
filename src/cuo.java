import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cuo extends cwt {
   private static final float l = 1.25F;
   public static final int a = 8;
   private boolean m = false;
   private boolean n = false;
   private static final float o = 0.2F;
   private static final float p = 0.5F;
   private static final float q = 3.15F;
   private static final float r = 1.6F;
   public static final float b = 1.6F;
   private static final cuo.a s = new cuo.a(Optional.of(awk.gr), Optional.of(awk.gq), Optional.of(awk.gp));

   public cuo(cvt.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cvx> d() {
      return d;
   }

   @Override
   public Predicate<cvx> b() {
      return c;
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      cyc $$4 = $$3.a(kt.N);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bry.c;
      } else if (!$$1.d($$3).f()) {
         this.m = false;
         this.n = false;
         $$1.c($$2);
         return bry.c;
      } else {
         return bry.d;
      }
   }

   private static float a(cyc $$0) {
      return $$0.a(cwb.uw) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cvx $$0, dev $$1, buv $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cuo.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dC(), $$2.dE(), $$2.dI(), (awj)$$2x.a(), $$2.dn(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(buv $$0, cvx $$1) {
      List<cvx> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kt.N, cyc.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cvx $$0) {
      cyc $$1 = $$0.a(kt.N, cyc.a);
      return !$$1.b();
   }

   @Override
   protected void a(buv $$0, cpb $$1, int $$2, float $$3, float $$4, float $$5, @Nullable buv $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dC() - $$0.dC();
         double $$8 = $$6.dI() - $$0.dI();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dE() + $$9 * 0.2F;
         $$11 = a($$0, new ezh($$7, $$10, $$8), $$5);
      } else {
         ezh $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         ezh $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.ea(), $$2);
      $$0.dX().a(null, $$0.dC(), $$0.dE(), $$0.dI(), awk.gv, $$0.dn(), 1.0F, $$16);
   }

   private static Vector3f a(buv $$0, ezh $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ezh $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cpb a(dev $$0, buv $$1, cvx $$2, cvx $$3, boolean $$4) {
      if ($$3.a(cwb.uw)) {
         return new cow($$0, $$3, $$1, $$1.dC(), $$1.dG() - 0.15F, $$1.dI(), true);
      } else {
         cpb $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cop $$6) {
            $$6.b(awk.go);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cvx $$0) {
      return $$0.a(cwb.uw) ? 3 : 1;
   }

   public void a(dev $$0, buv $$1, brx $$2, cvx $$3, float $$4, float $$5, @Nullable buv $$6) {
      if ($$0 instanceof arm $$7) {
         cyc $$9 = $$3.b(kt.N, cyc.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof coh, $$6);
            if ($$1 instanceof arn $$10) {
               an.G.a($$10, $$3);
               $$10.b(awu.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azr $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azr $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dev $$0, buv $$1, cvx $$2, int $$3) {
      if (!$$0.C) {
         cuo.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.m = false;
            this.n = false;
         }

         if ($$5 >= 0.2F && !this.m) {
            this.m = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (awj)$$2x.a(), awl.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.n) {
            this.n = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (awj)$$2x.a(), awl.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cvx $$0, buv $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cvx $$0, buv $$1) {
      float $$2 = dbo.a($$0, $$1, 1.25F);
      return azj.d($$2 * 20.0F);
   }

   @Override
   public cvz a(cvx $$0) {
      return cvz.g;
   }

   cuo.a i(cvx $$0) {
      return dbo.b($$0, dbn.B).orElse(s);
   }

   private static float a(int $$0, cvx $$1, buv $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cvx $$0, cvt.b $$1, List<xh> $$2, cxp $$3) {
      cyc $$4 = $$0.a(kt.N);
      if ($$4 != null && !$$4.b()) {
         cvx $$5 = $$4.a().get(0);
         $$2.add(xh.c("item.minecraft.crossbow.projectile").b(xg.v).b($$5.J()));
         if ($$3.a() && $$5.a(cwb.uw)) {
            List<xh> $$6 = Lists.newArrayList();
            cwb.uw.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xh.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean k(cvx $$0) {
      return $$0.a((cvt)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jp<awj>> b, Optional<jp<awj>> c, Optional<jp<awj>> d) {
      public static final Codec<cuo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awj.b.optionalFieldOf("start").forGetter(cuo.a::a),
                  awj.b.optionalFieldOf("mid").forGetter(cuo.a::b),
                  awj.b.optionalFieldOf("end").forGetter(cuo.a::c)
               )
               .apply($$0, cuo.a::new)
      );

      public Optional<jp<awj>> a() {
         return this.b;
      }

      public Optional<jp<awj>> b() {
         return this.c;
      }

      public Optional<jp<awj>> c() {
         return this.d;
      }
   }
}
