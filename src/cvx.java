import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cvx extends cyc {
   private static final float m = 1.25F;
   public static final int a = 8;
   private boolean n = false;
   private boolean o = false;
   private static final float p = 0.2F;
   private static final float q = 0.5F;
   private static final float r = 3.15F;
   private static final float s = 1.6F;
   public static final float b = 1.6F;
   private static final cvx.a t = new cvx.a(Optional.of(awv.gL), Optional.of(awv.gK), Optional.of(awv.gJ));

   public cvx(cxc.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cxg> d() {
      return d;
   }

   @Override
   public Predicate<cxg> b() {
      return c;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      czl $$4 = $$3.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bta.c;
      } else if (!$$1.d($$3).f()) {
         this.n = false;
         this.o = false;
         $$1.c($$2);
         return bta.c;
      } else {
         return bta.d;
      }
   }

   private static float a(czl $$0) {
      return $$0.a(cxk.vt) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cxg $$0, dgz $$1, bvx $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cvx.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dB(), $$2.dD(), $$2.dH(), (awu)$$2x.a(), $$2.dn(), 1.0F, 1.0F / ($$1.H_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bvx $$0, cxg $$1) {
      List<cxg> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ku.O, czl.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cxg $$0) {
      czl $$1 = $$0.a(ku.O, czl.a);
      return !$$1.b();
   }

   @Override
   protected void a(bvx $$0, cqh $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvx $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dB() - $$0.dB();
         double $$8 = $$6.dH() - $$0.dH();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dD() + $$9 * 0.2F;
         $$11 = a($$0, new fbr($$7, $$10, $$8), $$5);
      } else {
         fbr $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fbr $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dZ(), $$2);
      $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), awv.gP, $$0.dn(), 1.0F, $$16);
   }

   private static Vector3f a(bvx $$0, fbr $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fbr $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cqh a(dgz $$0, bvx $$1, cxg $$2, cxg $$3, boolean $$4) {
      if ($$3.a(cxk.vt)) {
         return new cqc($$0, $$3, $$1, $$1.dB(), $$1.dF() - 0.15F, $$1.dH(), true);
      } else {
         cqh $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cpv $$6) {
            $$6.b(awv.gI);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cxg $$0) {
      return $$0.a(cxk.vt) ? 3 : 1;
   }

   public void a(dgz $$0, bvx $$1, bsz $$2, cxg $$3, float $$4, float $$5, @Nullable bvx $$6) {
      if ($$0 instanceof arx $$7) {
         czl $$9 = $$3.b(ku.O, czl.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cpo, $$6);
            if ($$1 instanceof ary $$10) {
               ao.G.a($$10, $$3);
               $$10.b(axf.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(bac $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, bac $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dgz $$0, bvx $$1, cxg $$2, int $$3) {
      if (!$$0.C) {
         cvx.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.n = false;
            this.o = false;
         }

         if ($$5 >= 0.2F && !this.n) {
            this.n = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), (awu)$$2x.a(), aww.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.o) {
            this.o = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), (awu)$$2x.a(), aww.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cxg $$0, bvx $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cxg $$0, bvx $$1) {
      float $$2 = dds.a($$0, $$1, 1.25F);
      return azu.d($$2 * 20.0F);
   }

   @Override
   public cxi b(cxg $$0) {
      return cxi.g;
   }

   cvx.a i(cxg $$0) {
      return dds.b($$0, ddr.B).orElse(t);
   }

   private static float a(int $$0, cxg $$1, bvx $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      czl $$4 = $$0.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         cxg $$5 = $$4.a().get(0);
         $$2.add(xk.c("item.minecraft.crossbow.projectile").b(xj.v).b($$5.K()));
         if ($$3.a() && $$5.a(cxk.vt)) {
            List<xk> $$6 = Lists.newArrayList();
            cxk.vt.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xk.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cxg $$0) {
      return $$0.a((cxc)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jq<awu>> b, Optional<jq<awu>> c, Optional<jq<awu>> d) {
      public static final Codec<cvx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.b.optionalFieldOf("start").forGetter(cvx.a::a),
                  awu.b.optionalFieldOf("mid").forGetter(cvx.a::b),
                  awu.b.optionalFieldOf("end").forGetter(cvx.a::c)
               )
               .apply($$0, cvx.a::new)
      );

      public Optional<jq<awu>> a() {
         return this.b;
      }

      public Optional<jq<awu>> b() {
         return this.c;
      }

      public Optional<jq<awu>> c() {
         return this.d;
      }
   }
}
