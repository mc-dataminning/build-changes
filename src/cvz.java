import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cvz extends cyc {
   private static final float n = 1.25F;
   public static final int a = 8;
   private boolean o = false;
   private boolean p = false;
   private static final float q = 0.2F;
   private static final float r = 0.5F;
   private static final float s = 3.15F;
   private static final float t = 1.6F;
   public static final float b = 1.6F;
   private static final cvz.b u = new cvz.b(Optional.of(awa.gL), Optional.of(awa.gK), Optional.of(awa.gJ));

   public cvz(cxd.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cxh> d() {
      return d;
   }

   @Override
   public Predicate<cxh> b() {
      return c;
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      cxh $$3 = $$1.b($$2);
      czk $$4 = $$3.a(kv.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bsy.c;
      } else if (!$$1.d($$3).f()) {
         this.o = false;
         this.p = false;
         $$1.c($$2);
         return bsy.c;
      } else {
         return bsy.d;
      }
   }

   private static float a(czk $$0) {
      return $$0.a(cxl.vv) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cxh $$0, dgz $$1, bvy $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cvz.b $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dz(), $$2.dB(), $$2.dF(), (avz)$$2x.a(), $$2.dl(), 1.0F, 1.0F / ($$1.C_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bvy $$0, cxh $$1) {
      List<cxh> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kv.P, czk.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cxh $$0) {
      czk $$1 = $$0.a(kv.P, czk.a);
      return !$$1.b();
   }

   @Override
   protected void a(bvy $$0, cqk $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvy $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dz() - $$0.dz();
         double $$8 = $$6.dF() - $$0.dF();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dB() + $$9 * 0.2F;
         $$11 = a($$0, new fbx($$7, $$10, $$8), $$5);
      } else {
         fbx $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fbx $$14 = $$0.h(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dX(), $$2);
      $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), awa.gP, $$0.dl(), 1.0F, $$16);
   }

   private static Vector3f a(bvy $$0, fbx $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fbx $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cqk a(dgz $$0, bvy $$1, cxh $$2, cxh $$3, boolean $$4) {
      if ($$3.a(cxl.vv)) {
         return new cqf($$0, $$3, $$1, $$1.dz(), $$1.dD() - 0.15F, $$1.dF(), true);
      } else {
         cqk $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cpy $$6) {
            $$6.b(awa.gI);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cxh $$0) {
      return $$0.a(cxl.vv) ? 3 : 1;
   }

   public void a(dgz $$0, bvy $$1, bsx $$2, cxh $$3, float $$4, float $$5, @Nullable bvy $$6) {
      if ($$0 instanceof ard $$7) {
         czk $$9 = $$3.b(kv.P, czk.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cpr, $$6);
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
   public void a(dgz $$0, bvy $$1, cxh $$2, int $$3) {
      if (!$$0.C) {
         cvz.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.o = false;
            this.p = false;
         }

         if ($$5 >= 0.2F && !this.o) {
            this.o = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (avz)$$2x.a(), awb.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.p) {
            this.p = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), (avz)$$2x.a(), awb.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cxh $$0, bvy $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cxh $$0, bvy $$1) {
      float $$2 = ddt.a($$0, $$1, 1.25F);
      return ayz.d($$2 * 20.0F);
   }

   @Override
   public cxj b(cxh $$0) {
      return cxj.g;
   }

   cvz.b i(cxh $$0) {
      return ddt.b($$0, dds.B).orElse(u);
   }

   private static float a(int $$0, cxh $$1, bvy $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cxh $$0, cxd.b $$1, List<wp> $$2, cyx $$3) {
      czk $$4 = $$0.a(kv.P);
      if ($$4 != null && !$$4.b()) {
         cxh $$5 = $$4.a().get(0);
         $$2.add(wp.c("item.minecraft.crossbow.projectile").b(wo.v).b($$5.K()));
         if ($$3.a() && $$5.a(cxl.vv)) {
            List<wp> $$6 = Lists.newArrayList();
            cxl.vv.a($$5, $$1, $$6, $$3);
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
   public boolean d_(cxh $$0) {
      return $$0.a((cxd)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static enum a implements azv {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cvz.a> d = azv.a(cvz.a::values);
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
      public static final Codec<cvz.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avz.b.optionalFieldOf("start").forGetter(cvz.b::a),
                  avz.b.optionalFieldOf("mid").forGetter(cvz.b::b),
                  avz.b.optionalFieldOf("end").forGetter(cvz.b::c)
               )
               .apply($$0, cvz.b::new)
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
