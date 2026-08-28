import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cyd extends daf {
   private static final float o = 1.25F;
   public static final int a = 8;
   private boolean p = false;
   private boolean q = false;
   private static final float r = 0.2F;
   private static final float s = 0.5F;
   private static final float t = 3.15F;
   private static final float u = 1.6F;
   public static final float b = 1.6F;
   private static final cyd.b v = new cyd.b(Optional.of(awn.gN), Optional.of(awn.gM), Optional.of(awn.gL));

   public cyd(czg.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<czk> c() {
      return d;
   }

   @Override
   public Predicate<czk> a() {
      return c;
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      czk $$3 = $$1.b($$2);
      dbo $$4 = $$3.a(kk.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bug.c;
      } else if (!$$1.d($$3).f()) {
         this.p = false;
         this.q = false;
         $$1.c($$2);
         return bug.c;
      } else {
         return bug.d;
      }
   }

   private static float a(dbo $$0) {
      return $$0.a(czo.vE) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(czk $$0, djh $$1, bxj $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      return a($$4, $$0, $$2) >= 1.0F && g($$0);
   }

   private static boolean a(bxj $$0, czk $$1) {
      List<czk> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kk.P, dbo.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(czk $$0) {
      dbo $$1 = $$0.a(kk.P, dbo.a);
      return !$$1.b();
   }

   @Override
   protected void a(bxj $$0, cse $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bxj $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dz() - $$0.dz();
         double $$8 = $$6.dF() - $$0.dF();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dB() + $$9 * 0.2F;
         $$11 = a($$0, new fex($$7, $$10, $$8), $$5);
      } else {
         fex $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fex $$14 = $$0.h(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dX(), $$2);
      $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), awn.gR, $$0.dl(), 1.0F, $$16);
   }

   private static Vector3f a(bxj $$0, fex $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fex $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cse a(djh $$0, bxj $$1, czk $$2, czk $$3, boolean $$4) {
      if ($$3.a(czo.vE)) {
         return new crz($$0, $$3, $$1, $$1.dz(), $$1.dD() - 0.15F, $$1.dF(), true);
      } else {
         cse $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof crr $$6) {
            $$6.b(awn.gK);
         }

         return $$5;
      }
   }

   @Override
   protected int h(czk $$0) {
      return $$0.a(czo.vE) ? 3 : 1;
   }

   public void a(djh $$0, bxj $$1, buf $$2, czk $$3, float $$4, float $$5, @Nullable bxj $$6) {
      if ($$0 instanceof arq $$7) {
         dbo $$9 = $$3.b(kk.P, dbo.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof crj, $$6);
            if ($$1 instanceof arr $$10) {
               aq.G.a($$10, $$3);
               $$10.b(awx.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azv $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azv $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(djh $$0, bxj $$1, czk $$2, int $$3) {
      if (!$$0.C) {
         cyd.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.p = false;
            this.q = false;
         }

         if ($$5 >= 0.2F && !this.p) {
            this.p = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (awm)$$2x.a(), awo.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.q) {
            this.q = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (awm)$$2x.a(), awo.h, 0.5F, 1.0F));
         }

         if ($$5 >= 1.0F && !g($$2) && a($$1, $$2)) {
            $$4.c().ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (awm)$$2x.a(), $$1.dl(), 1.0F, 1.0F / ($$0.C_().i() * 0.5F + 1.0F) + 0.2F));
         }
      }
   }

   @Override
   public int a(czk $$0, bxj $$1) {
      return 72000;
   }

   public static int b(czk $$0, bxj $$1) {
      float $$2 = dfz.a($$0, $$1, 1.25F);
      return azm.d($$2 * 20.0F);
   }

   @Override
   public czm b(czk $$0) {
      return czm.g;
   }

   cyd.b i(czk $$0) {
      return dfz.b($$0, dfy.B).orElse(v);
   }

   private static float a(int $$0, czk $$1, bxj $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public boolean e_(czk $$0) {
      return $$0.a((czg)this);
   }

   @Override
   public int b() {
      return 8;
   }

   public static enum a implements bak {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cyd.a> d = bak.a(cyd.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<jf<awm>> b, Optional<jf<awm>> c, Optional<jf<awm>> d) {
      public static final Codec<cyd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awm.b.optionalFieldOf("start").forGetter(cyd.b::a),
                  awm.b.optionalFieldOf("mid").forGetter(cyd.b::b),
                  awm.b.optionalFieldOf("end").forGetter(cyd.b::c)
               )
               .apply($$0, cyd.b::new)
      );

      public Optional<jf<awm>> a() {
         return this.b;
      }

      public Optional<jf<awm>> b() {
         return this.c;
      }

      public Optional<jf<awm>> c() {
         return this.d;
      }
   }
}
