import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class csn extends cut {
   private static final float k = 1.25F;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;
   private static final csn.a r = new csn.a(Optional.of(avf.gq), Optional.of(avf.gp), Optional.of(avf.go));

   public csn(ctv.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cua> d() {
      return j;
   }

   @Override
   public Predicate<cua> b() {
      return c;
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      cwn $$4 = $$3.a(kn.E);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bqe.b($$3);
      } else if (!$$1.g($$3).e()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return bqe.b($$3);
      } else {
         return bqe.d($$3);
      }
   }

   private static float a(cwn $$0) {
      return $$0.a(cud.uu) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cua $$0, dcd $$1, bsy $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !i($$0) && a($$2, $$0)) {
         csn.a $$6 = this.k($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.du(), $$2.dw(), $$2.dA(), (ave)$$2x.a(), $$2.de(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F));
      }
   }

   private static boolean a(bsy $$0, cua $$1) {
      List<cua> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kn.E, cwn.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean i(cua $$0) {
      cwn $$1 = $$0.a(kn.E, cwn.a);
      return !$$1.b();
   }

   @Override
   protected void a(bsy $$0, cmz $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bsy $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.du() - $$0.du();
         double $$8 = $$6.dA() - $$0.dA();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dw() + $$9 * 0.2F;
         $$11 = a($$0, new evz($$7, $$10, $$8), $$5);
      } else {
         evz $$12 = $$0.j(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         evz $$14 = $$0.g(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dS(), $$2);
      $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), avf.gu, $$0.de(), 1.0F, $$16);
   }

   private static Vector3f a(bsy $$0, evz $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         evz $$5 = $$0.j(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cmz a(dcd $$0, bsy $$1, cua $$2, cua $$3, boolean $$4) {
      if ($$3.a(cud.uu)) {
         return new cmu($$0, $$3, $$1, $$1.du(), $$1.dy() - 0.15F, $$1.dA(), true);
      } else {
         cmz $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cmn $$6) {
            $$6.b(avf.gn);
         }

         return $$5;
      }
   }

   @Override
   protected int j(cua $$0) {
      return $$0.a(cud.uu) ? 3 : 1;
   }

   public void a(dcd $$0, bsy $$1, bqc $$2, cua $$3, float $$4, float $$5, @Nullable bsy $$6) {
      if ($$0 instanceof aqk $$7) {
         cwn $$9 = $$3.b(kn.E, cwn.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cmh, $$6);
            if ($$1 instanceof aql $$10) {
               am.G.a($$10, $$3);
               $$10.b(avp.c.b($$3.g()));
            }
         }
      }
   }

   private static float a(aym $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, aym $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dcd $$0, bsy $$1, cua $$2, int $$3) {
      if (!$$0.B) {
         csn.a $$4 = this.k($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$5 >= 0.2F && !this.l) {
            this.l = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), (ave)$$2x.a(), avg.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.m) {
            this.m = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), (ave)$$2x.a(), avg.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cua $$0, bsy $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cua $$0, bsy $$1) {
      float $$3;
      if ($$1.dP() instanceof aqk $$2) {
         $$3 = czl.b($$2, $$0, $$1, 1.25F);
      } else {
         $$3 = 1.25F;
      }

      return aye.d($$3 * 20.0F);
   }

   @Override
   public cvv b(cua $$0) {
      return cvv.g;
   }

   csn.a k(cua $$0) {
      return czl.b($$0, czk.C).orElse(r);
   }

   private static float a(int $$0, cua $$1, bsy $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cwn $$4 = $$0.a(kn.E);
      if ($$4 != null && !$$4.b()) {
         cua $$5 = $$4.a().get(0);
         $$2.add(wu.c("item.minecraft.crossbow.projectile").b(wt.v).b($$5.F()));
         if ($$3.a() && $$5.a(cud.uu)) {
            List<wu> $$6 = Lists.newArrayList();
            cud.uu.a($$5, $$1, $$6, $$3);
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
   public boolean l(cua $$0) {
      return $$0.a(this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jj<ave>> b, Optional<jj<ave>> c, Optional<jj<ave>> d) {
      public static final Codec<csn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ave.b.optionalFieldOf("start").forGetter(csn.a::a),
                  ave.b.optionalFieldOf("mid").forGetter(csn.a::b),
                  ave.b.optionalFieldOf("end").forGetter(csn.a::c)
               )
               .apply($$0, csn.a::new)
      );

      public Optional<jj<ave>> a() {
         return this.b;
      }

      public Optional<jj<ave>> b() {
         return this.c;
      }

      public Optional<jj<ave>> c() {
         return this.d;
      }
   }
}
