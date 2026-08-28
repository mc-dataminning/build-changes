import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cyr extends dat {
   private static final float o = 1.25F;
   public static final int a = 8;
   private boolean p = false;
   private boolean q = false;
   private static final float r = 0.2F;
   private static final float s = 0.5F;
   private static final float t = 3.15F;
   private static final float u = 1.6F;
   public static final float b = 1.6F;
   private static final cyr.b v = new cyr.b(Optional.of(awp.gN), Optional.of(awp.gM), Optional.of(awp.gL));

   public cyr(czu.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<czy> c() {
      return d;
   }

   @Override
   public Predicate<czy> a() {
      return c;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      dcc $$4 = $$3.a(kk.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bur.c;
      } else if (!$$1.d($$3).f()) {
         this.p = false;
         this.q = false;
         $$1.c($$2);
         return bur.c;
      } else {
         return bur.d;
      }
   }

   private static float a(dcc $$0) {
      return $$0.a(dac.vE) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(czy $$0, djx $$1, bxu $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      return a($$4, $$0, $$2) >= 1.0F && g($$0);
   }

   private static boolean a(bxu $$0, czy $$1) {
      List<czy> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kk.P, dcc.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(czy $$0) {
      dcc $$1 = $$0.a(kk.P, dcc.a);
      return !$$1.b();
   }

   @Override
   protected void a(bxu $$0, css $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bxu $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new ffq($$7, $$10, $$8), $$5);
      } else {
         ffq $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         ffq $$14 = $$0.h(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awp.gR, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(bxu $$0, ffq $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ffq $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected css a(djx $$0, bxu $$1, czy $$2, czy $$3, boolean $$4) {
      if ($$3.a(dac.vE)) {
         return new csn($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         css $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof csf $$6) {
            $$6.b(awp.gK);
         }

         return $$5;
      }
   }

   @Override
   protected int h(czy $$0) {
      return $$0.a(dac.vE) ? 3 : 1;
   }

   public void a(djx $$0, bxu $$1, buq $$2, czy $$3, float $$4, float $$5, @Nullable bxu $$6) {
      if ($$0 instanceof ars $$7) {
         dcc $$9 = $$3.b(kk.P, dcc.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof crx, $$6);
            if ($$1 instanceof art $$10) {
               aq.G.a($$10, $$3);
               $$10.b(awz.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azx $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azx $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(djx $$0, bxu $$1, czy $$2, int $$3) {
      if (!$$0.C) {
         cyr.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.p = false;
            this.q = false;
         }

         if ($$5 >= 0.2F && !this.p) {
            this.p = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awo)$$2x.a(), awq.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.q) {
            this.q = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awo)$$2x.a(), awq.h, 0.5F, 1.0F));
         }

         if ($$5 >= 1.0F && !g($$2) && a($$1, $$2)) {
            $$4.c().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awo)$$2x.a(), $$1.dm(), 1.0F, 1.0F / ($$0.G_().i() * 0.5F + 1.0F) + 0.2F));
         }
      }
   }

   @Override
   public int a(czy $$0, bxu $$1) {
      return 72000;
   }

   public static int b(czy $$0, bxu $$1) {
      float $$2 = dgn.a($$0, $$1, 1.25F);
      return azo.d($$2 * 20.0F);
   }

   @Override
   public daa b(czy $$0) {
      return daa.g;
   }

   cyr.b i(czy $$0) {
      return dgn.b($$0, dgm.B).orElse(v);
   }

   private static float a(int $$0, czy $$1, bxu $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public boolean e_(czy $$0) {
      return $$0.a((czu)this);
   }

   @Override
   public int b() {
      return 8;
   }

   public static enum a implements bam {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cyr.a> d = bam.a(cyr.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<jf<awo>> b, Optional<jf<awo>> c, Optional<jf<awo>> d) {
      public static final Codec<cyr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awo.b.optionalFieldOf("start").forGetter(cyr.b::a),
                  awo.b.optionalFieldOf("mid").forGetter(cyr.b::b),
                  awo.b.optionalFieldOf("end").forGetter(cyr.b::c)
               )
               .apply($$0, cyr.b::new)
      );

      public Optional<jf<awo>> a() {
         return this.b;
      }

      public Optional<jf<awo>> b() {
         return this.c;
      }

      public Optional<jf<awo>> c() {
         return this.d;
      }
   }
}
