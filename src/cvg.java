import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cvg extends cxl {
   private static final float m = 1.25F;
   public static final int a = 8;
   private boolean n = false;
   private boolean o = false;
   private static final float p = 0.2F;
   private static final float q = 0.5F;
   private static final float r = 3.15F;
   private static final float s = 1.6F;
   public static final float b = 1.6F;
   private static final cvg.b t = new cvg.b(Optional.of(awa.gL), Optional.of(awa.gK), Optional.of(awa.gJ));

   public cvg(cwl.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cwp> d() {
      return d;
   }

   @Override
   public Predicate<cwp> b() {
      return c;
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      cyu $$4 = $$3.a(kv.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bsk.c;
      } else if (!$$1.d($$3).f()) {
         this.n = false;
         this.o = false;
         $$1.c($$2);
         return bsk.c;
      } else {
         return bsk.d;
      }
   }

   private static float a(cyu $$0) {
      return $$0.a(cwt.vt) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cwp $$0, dgi $$1, bvh $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cvg.b $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dA(), $$2.dC(), $$2.dG(), (avz)$$2x.a(), $$2.dm(), 1.0F, 1.0F / ($$1.H_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bvh $$0, cwp $$1) {
      List<cwp> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kv.O, cyu.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cwp $$0) {
      cyu $$1 = $$0.a(kv.O, cyu.a);
      return !$$1.b();
   }

   @Override
   protected void a(bvh $$0, cpq $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvh $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new fba($$7, $$10, $$8), $$5);
      } else {
         fba $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fba $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awa.gP, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(bvh $$0, fba $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fba $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cpq a(dgi $$0, bvh $$1, cwp $$2, cwp $$3, boolean $$4) {
      if ($$3.a(cwt.vt)) {
         return new cpl($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         cpq $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cpe $$6) {
            $$6.b(awa.gI);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cwp $$0) {
      return $$0.a(cwt.vt) ? 3 : 1;
   }

   public void a(dgi $$0, bvh $$1, bsj $$2, cwp $$3, float $$4, float $$5, @Nullable bvh $$6) {
      if ($$0 instanceof ard $$7) {
         cyu $$9 = $$3.b(kv.O, cyu.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cox, $$6);
            if ($$1 instanceof are $$10) {
               ap.G.a($$10, $$3);
               $$10.b(awk.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azh $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azh $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dgi $$0, bvh $$1, cwp $$2, int $$3) {
      if (!$$0.C) {
         cvg.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.n = false;
            this.o = false;
         }

         if ($$5 >= 0.2F && !this.n) {
            this.n = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (avz)$$2x.a(), awb.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.o) {
            this.o = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (avz)$$2x.a(), awb.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cwp $$0, bvh $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cwp $$0, bvh $$1) {
      float $$2 = ddb.a($$0, $$1, 1.25F);
      return ayz.d($$2 * 20.0F);
   }

   @Override
   public cwr b(cwp $$0) {
      return cwr.g;
   }

   cvg.b i(cwp $$0) {
      return ddb.b($$0, dda.B).orElse(t);
   }

   private static float a(int $$0, cwp $$1, bvh $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      cyu $$4 = $$0.a(kv.O);
      if ($$4 != null && !$$4.b()) {
         cwp $$5 = $$4.a().get(0);
         $$2.add(wp.c("item.minecraft.crossbow.projectile").b(wo.v).b($$5.K()));
         if ($$3.a() && $$5.a(cwt.vt)) {
            List<wp> $$6 = Lists.newArrayList();
            cwt.vt.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wp.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cwp $$0) {
      return $$0.a((cwl)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static enum a implements azv {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cvg.a> d = azv.a(cvg.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<jr<avz>> b, Optional<jr<avz>> c, Optional<jr<avz>> d) {
      public static final Codec<cvg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avz.b.optionalFieldOf("start").forGetter(cvg.b::a),
                  avz.b.optionalFieldOf("mid").forGetter(cvg.b::b),
                  avz.b.optionalFieldOf("end").forGetter(cvg.b::c)
               )
               .apply($$0, cvg.b::new)
      );

      public Optional<jr<avz>> a() {
         return this.b;
      }

      public Optional<jr<avz>> b() {
         return this.c;
      }

      public Optional<jr<avz>> c() {
         return this.d;
      }
   }
}
