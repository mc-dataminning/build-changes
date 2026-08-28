import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cwq extends cyt {
   private static final float n = 1.25F;
   public static final int a = 8;
   private boolean o = false;
   private boolean p = false;
   private static final float q = 0.2F;
   private static final float r = 0.5F;
   private static final float s = 3.15F;
   private static final float t = 1.6F;
   public static final float b = 1.6F;
   private static final cwq.b u = new cwq.b(Optional.of(awk.gL), Optional.of(awk.gK), Optional.of(awk.gJ));

   public cwq(cxu.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cxy> d() {
      return d;
   }

   @Override
   public Predicate<cxy> b() {
      return c;
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      daa $$4 = $$3.a(kx.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return btq.c;
      } else if (!$$1.e($$3).f()) {
         this.o = false;
         this.p = false;
         $$1.c($$2);
         return btq.c;
      } else {
         return btq.d;
      }
   }

   private static float a(daa $$0) {
      return $$0.a(cyc.vx) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cxy $$0, dhp $$1, bwr $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cwq.b $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dA(), $$2.dC(), $$2.dG(), (awj)$$2x.a(), $$2.dm(), 1.0F, 1.0F / ($$1.C_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bwr $$0, cxy $$1) {
      List<cxy> $$2 = a($$1, $$0.e($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kx.P, daa.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cxy $$0) {
      daa $$1 = $$0.a(kx.P, daa.a);
      return !$$1.b();
   }

   @Override
   protected void a(bwr $$0, crb $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bwr $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new fcu($$7, $$10, $$8), $$5);
      } else {
         fcu $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fcu $$14 = $$0.h(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awk.gP, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(bwr $$0, fcu $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fcu $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected crb a(dhp $$0, bwr $$1, cxy $$2, cxy $$3, boolean $$4) {
      if ($$3.a(cyc.vx)) {
         return new cqw($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         crb $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cqp $$6) {
            $$6.b(awk.gI);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cxy $$0) {
      return $$0.a(cyc.vx) ? 3 : 1;
   }

   public void a(dhp $$0, bwr $$1, btp $$2, cxy $$3, float $$4, float $$5, @Nullable bwr $$6) {
      if ($$0 instanceof arn $$7) {
         daa $$9 = $$3.b(kx.P, daa.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cqi, $$6);
            if ($$1 instanceof aro $$10) {
               ap.G.a($$10, $$3);
               $$10.b(awu.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azs $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azs $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dhp $$0, bwr $$1, cxy $$2, int $$3) {
      if (!$$0.C) {
         cwq.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.o = false;
            this.p = false;
         }

         if ($$5 >= 0.2F && !this.o) {
            this.o = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awj)$$2x.a(), awl.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.p) {
            this.p = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awj)$$2x.a(), awl.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cxy $$0, bwr $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cxy $$0, bwr $$1) {
      float $$2 = dej.a($$0, $$1, 1.25F);
      return azk.d($$2 * 20.0F);
   }

   @Override
   public cya b(cxy $$0) {
      return cya.g;
   }

   cwq.b i(cxy $$0) {
      return dej.b($$0, dei.B).orElse(u);
   }

   private static float a(int $$0, cxy $$1, bwr $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cxy $$0, cxu.b $$1, List<wv> $$2, czn $$3) {
      daa $$4 = $$0.a(kx.P);
      if ($$4 != null && !$$4.b()) {
         cxy $$5 = $$4.a().get(0);
         $$2.add(wv.c("item.minecraft.crossbow.projectile").b(wu.v).b($$5.K()));
         if ($$3.a() && $$5.a(cyc.vx)) {
            List<wv> $$6 = Lists.newArrayList();
            cyc.vx.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wv.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cxy $$0) {
      return $$0.a((cxu)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static enum a implements bag {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cwq.a> d = bag.a(cwq.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<js<awj>> b, Optional<js<awj>> c, Optional<js<awj>> d) {
      public static final Codec<cwq.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awj.b.optionalFieldOf("start").forGetter(cwq.b::a),
                  awj.b.optionalFieldOf("mid").forGetter(cwq.b::b),
                  awj.b.optionalFieldOf("end").forGetter(cwq.b::c)
               )
               .apply($$0, cwq.b::new)
      );

      public Optional<js<awj>> a() {
         return this.b;
      }

      public Optional<js<awj>> b() {
         return this.c;
      }

      public Optional<js<awj>> c() {
         return this.d;
      }
   }
}
