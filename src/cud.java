import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cud extends cwl {
   private static final float k = 1.25F;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;
   private static final cud.a r = new cud.a(Optional.of(awe.gr), Optional.of(awe.gq), Optional.of(awe.gp));

   public cud(cvk.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cvp> d() {
      return d;
   }

   @Override
   public Predicate<cvp> b() {
      return c;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      cya $$4 = $$3.a(kr.J);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return brp.c;
      } else if (!$$1.f($$3).f()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return brp.c;
      } else {
         return brp.d;
      }
   }

   private static float a(cya $$0) {
      return $$0.a(cvt.uw) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cvp $$0, deg $$1, buk $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cud.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dx(), $$2.dz(), $$2.dD(), (awd)$$2x.a(), $$2.di(), 1.0F, 1.0F / ($$1.C_().i() * 0.5F + 1.0F) + 0.2F));
      }
   }

   private static boolean a(buk $$0, cvp $$1) {
      List<cvp> $$2 = a($$1, $$0.f($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kr.J, cya.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cvp $$0) {
      cya $$1 = $$0.a(kr.J, cya.a);
      return !$$1.b();
   }

   @Override
   protected void a(buk $$0, coo $$1, int $$2, float $$3, float $$4, float $$5, @Nullable buk $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dx() - $$0.dx();
         double $$8 = $$6.dD() - $$0.dD();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dz() + $$9 * 0.2F;
         $$11 = a($$0, new eys($$7, $$10, $$8), $$5);
      } else {
         eys $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         eys $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dV(), $$2);
      $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), awe.gv, $$0.di(), 1.0F, $$16);
   }

   private static Vector3f a(buk $$0, eys $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         eys $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected coo a(deg $$0, buk $$1, cvp $$2, cvp $$3, boolean $$4) {
      if ($$3.a(cvt.uw)) {
         return new coi($$0, $$3, $$1, $$1.dx(), $$1.dB() - 0.15F, $$1.dD(), true);
      } else {
         coo $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cob $$6) {
            $$6.b(awe.go);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cvp $$0) {
      return $$0.a(cvt.uw) ? 3 : 1;
   }

   public void a(deg $$0, buk $$1, bro $$2, cvp $$3, float $$4, float $$5, @Nullable buk $$6) {
      if ($$0 instanceof arh $$7) {
         cya $$9 = $$3.b(kr.J, cya.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cnu, $$6);
            if ($$1 instanceof ari $$10) {
               an.G.a($$10, $$3);
               $$10.b(awo.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azl $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azl $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(deg $$0, buk $$1, cvp $$2, int $$3) {
      if (!$$0.B) {
         cud.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$5 >= 0.2F && !this.l) {
            this.l = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), (awd)$$2x.a(), awf.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.m) {
            this.m = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), (awd)$$2x.a(), awf.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cvp $$0, buk $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cvp $$0, buk $$1) {
      float $$2 = dbm.a($$0, $$1, 1.25F);
      return azd.d($$2 * 20.0F);
   }

   @Override
   public cvr a(cvp $$0) {
      return cvr.g;
   }

   cud.a i(cvp $$0) {
      return dbm.b($$0, dbl.B).orElse(r);
   }

   private static float a(int $$0, cvp $$1, buk $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      cya $$4 = $$0.a(kr.J);
      if ($$4 != null && !$$4.b()) {
         cvp $$5 = $$4.a().get(0);
         $$2.add(xd.c("item.minecraft.crossbow.projectile").b(xc.v).b($$5.H()));
         if ($$3.a() && $$5.a(cvt.uw)) {
            List<xd> $$6 = Lists.newArrayList();
            cvt.uw.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xd.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean k(cvp $$0) {
      return $$0.a((cvk)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jn<awd>> b, Optional<jn<awd>> c, Optional<jn<awd>> d) {
      public static final Codec<cud.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awd.b.optionalFieldOf("start").forGetter(cud.a::a),
                  awd.b.optionalFieldOf("mid").forGetter(cud.a::b),
                  awd.b.optionalFieldOf("end").forGetter(cud.a::c)
               )
               .apply($$0, cud.a::new)
      );

      public Optional<jn<awd>> a() {
         return this.b;
      }

      public Optional<jn<awd>> b() {
         return this.c;
      }

      public Optional<jn<awd>> c() {
         return this.d;
      }
   }
}
