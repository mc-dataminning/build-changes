import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class csp extends cuv {
   private static final float k = 1.25F;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;
   private static final csp.a r = new csp.a(Optional.of(avh.gq), Optional.of(avh.gp), Optional.of(avh.go));

   public csp(ctx.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cuc> d() {
      return j;
   }

   @Override
   public Predicate<cuc> b() {
      return c;
   }

   @Override
   public bqh<cuc> a(dcf $$0, cmk $$1, bqf $$2) {
      cuc $$3 = $$1.b($$2);
      cwp $$4 = $$3.a(kn.E);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bqh.b($$3);
      } else if (!$$1.g($$3).e()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return bqh.b($$3);
      } else {
         return bqh.d($$3);
      }
   }

   private static float a(cwp $$0) {
      return $$0.a(cuf.uu) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cuc $$0, dcf $$1, btb $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !i($$0) && a($$2, $$0)) {
         csp.a $$6 = this.k($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dv(), $$2.dx(), $$2.dB(), (avg)$$2x.a(), $$2.df(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F));
      }
   }

   private static boolean a(btb $$0, cuc $$1) {
      List<cuc> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kn.E, cwp.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean i(cuc $$0) {
      cwp $$1 = $$0.a(kn.E, cwp.a);
      return !$$1.b();
   }

   @Override
   protected void a(btb $$0, cnc $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btb $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dv() - $$0.dv();
         double $$8 = $$6.dB() - $$0.dB();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dx() + $$9 * 0.2F;
         $$11 = a($$0, new ewf($$7, $$10, $$8), $$5);
      } else {
         ewf $$12 = $$0.j(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         ewf $$14 = $$0.g(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dT(), $$2);
      $$0.dQ().a(null, $$0.dv(), $$0.dx(), $$0.dB(), avh.gu, $$0.df(), 1.0F, $$16);
   }

   private static Vector3f a(btb $$0, ewf $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ewf $$5 = $$0.j(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cnc a(dcf $$0, btb $$1, cuc $$2, cuc $$3, boolean $$4) {
      if ($$3.a(cuf.uu)) {
         return new cmx($$0, $$3, $$1, $$1.dv(), $$1.dz() - 0.15F, $$1.dB(), true);
      } else {
         cnc $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cmq $$6) {
            $$6.b(avh.gn);
         }

         return $$5;
      }
   }

   @Override
   protected int j(cuc $$0) {
      return $$0.a(cuf.uu) ? 3 : 1;
   }

   public void a(dcf $$0, btb $$1, bqf $$2, cuc $$3, float $$4, float $$5, @Nullable btb $$6) {
      if ($$0 instanceof aqm $$7) {
         cwp $$9 = $$3.b(kn.E, cwp.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cmk, $$6);
            if ($$1 instanceof aqn $$10) {
               am.G.a($$10, $$3);
               $$10.b(avr.c.b($$3.g()));
            }
         }
      }
   }

   private static float a(ayo $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, ayo $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dcf $$0, btb $$1, cuc $$2, int $$3) {
      if (!$$0.B) {
         csp.a $$4 = this.k($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)a($$1);
         if ($$5 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$5 >= 0.2F && !this.l) {
            this.l = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), (avg)$$2x.a(), avi.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.m) {
            this.m = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), (avg)$$2x.a(), avi.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cuc $$0, btb $$1) {
      return a($$1) + 3;
   }

   public static int a(btb $$0) {
      float $$1 = czn.a($$0, 1.25F);
      return ayg.d($$1 * 20.0F);
   }

   @Override
   public cvx b(cuc $$0) {
      return cvx.g;
   }

   csp.a k(cuc $$0) {
      return czn.b($$0, czm.B).orElse(r);
   }

   private static float a(int $$0, cuc $$1, btb $$2) {
      float $$3 = (float)$$0 / (float)a($$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      cwp $$4 = $$0.a(kn.E);
      if ($$4 != null && !$$4.b()) {
         cuc $$5 = $$4.a().get(0);
         $$2.add(wu.c("item.minecraft.crossbow.projectile").b(wt.v).b($$5.F()));
         if ($$3.a() && $$5.a(cuf.uu)) {
            List<wu> $$6 = Lists.newArrayList();
            cuf.uu.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wu.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cuc $$0) {
      return $$0.a((ctx)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jj<avg>> b, Optional<jj<avg>> c, Optional<jj<avg>> d) {
      public static final Codec<csp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avg.b.optionalFieldOf("start").forGetter(csp.a::a),
                  avg.b.optionalFieldOf("mid").forGetter(csp.a::b),
                  avg.b.optionalFieldOf("end").forGetter(csp.a::c)
               )
               .apply($$0, csp.a::new)
      );

      public Optional<jj<avg>> a() {
         return this.b;
      }

      public Optional<jj<avg>> b() {
         return this.c;
      }

      public Optional<jj<avg>> c() {
         return this.d;
      }
   }
}
