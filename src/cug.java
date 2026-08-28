import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cug extends cwo {
   private static final float k = 1.25F;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;
   private static final cug.a r = new cug.a(Optional.of(awg.gr), Optional.of(awg.gq), Optional.of(awg.gp));

   public cug(cvn.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cvs> d() {
      return d;
   }

   @Override
   public Predicate<cvs> b() {
      return c;
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      cyd $$4 = $$3.a(ks.J);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return brs.c;
      } else if (!$$1.f($$3).f()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return brs.c;
      } else {
         return brs.d;
      }
   }

   private static float a(cyd $$0) {
      return $$0.a(cvw.uw) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cvs $$0, dej $$1, bun $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cug.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dx(), $$2.dz(), $$2.dD(), (awf)$$2x.a(), $$2.di(), 1.0F, 1.0F / ($$1.D_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bun $$0, cvs $$1) {
      List<cvs> $$2 = a($$1, $$0.f($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ks.J, cyd.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cvs $$0) {
      cyd $$1 = $$0.a(ks.J, cyd.a);
      return !$$1.b();
   }

   @Override
   protected void a(bun $$0, cor $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bun $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dx() - $$0.dx();
         double $$8 = $$6.dD() - $$0.dD();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dz() + $$9 * 0.2F;
         $$11 = a($$0, new eyw($$7, $$10, $$8), $$5);
      } else {
         eyw $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         eyw $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dV(), $$2);
      $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), awg.gv, $$0.di(), 1.0F, $$16);
   }

   private static Vector3f a(bun $$0, eyw $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         eyw $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cor a(dej $$0, bun $$1, cvs $$2, cvs $$3, boolean $$4) {
      if ($$3.a(cvw.uw)) {
         return new col($$0, $$3, $$1, $$1.dx(), $$1.dB() - 0.15F, $$1.dD(), true);
      } else {
         cor $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof coe $$6) {
            $$6.b(awg.go);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cvs $$0) {
      return $$0.a(cvw.uw) ? 3 : 1;
   }

   public void a(dej $$0, bun $$1, brr $$2, cvs $$3, float $$4, float $$5, @Nullable bun $$6) {
      if ($$0 instanceof arj $$7) {
         cyd $$9 = $$3.b(ks.J, cyd.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cnx, $$6);
            if ($$1 instanceof ark $$10) {
               an.G.a($$10, $$3);
               $$10.b(awq.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azn $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azn $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dej $$0, bun $$1, cvs $$2, int $$3) {
      if (!$$0.B) {
         cug.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$5 >= 0.2F && !this.l) {
            this.l = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), (awf)$$2x.a(), awh.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.m) {
            this.m = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), (awf)$$2x.a(), awh.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cvs $$0, bun $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cvs $$0, bun $$1) {
      float $$2 = dbp.a($$0, $$1, 1.25F);
      return azf.d($$2 * 20.0F);
   }

   @Override
   public cvu a(cvs $$0) {
      return cvu.g;
   }

   cug.a i(cvs $$0) {
      return dbp.b($$0, dbo.B).orElse(r);
   }

   private static float a(int $$0, cvs $$1, bun $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      cyd $$4 = $$0.a(ks.J);
      if ($$4 != null && !$$4.b()) {
         cvs $$5 = $$4.a().get(0);
         $$2.add(xe.c("item.minecraft.crossbow.projectile").b(xd.v).b($$5.I()));
         if ($$3.a() && $$5.a(cvw.uw)) {
            List<xe> $$6 = Lists.newArrayList();
            cvw.uw.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xe.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean k(cvs $$0) {
      return $$0.a((cvn)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jo<awf>> b, Optional<jo<awf>> c, Optional<jo<awf>> d) {
      public static final Codec<cug.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awf.b.optionalFieldOf("start").forGetter(cug.a::a),
                  awf.b.optionalFieldOf("mid").forGetter(cug.a::b),
                  awf.b.optionalFieldOf("end").forGetter(cug.a::c)
               )
               .apply($$0, cug.a::new)
      );

      public Optional<jo<awf>> a() {
         return this.b;
      }

      public Optional<jo<awf>> b() {
         return this.c;
      }

      public Optional<jo<awf>> c() {
         return this.d;
      }
   }
}
