import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cus extends cwx {
   private static final float l = 1.25F;
   public static final int a = 8;
   private boolean m = false;
   private boolean n = false;
   private static final float o = 0.2F;
   private static final float p = 0.5F;
   private static final float q = 3.15F;
   private static final float r = 1.6F;
   public static final float b = 1.6F;
   private static final cus.a s = new cus.a(Optional.of(awl.gr), Optional.of(awl.gq), Optional.of(awl.gp));

   public cus(cvx.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cwb> d() {
      return d;
   }

   @Override
   public Predicate<cwb> b() {
      return c;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      cyg $$4 = $$3.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bsd.c;
      } else if (!$$1.d($$3).f()) {
         this.m = false;
         this.n = false;
         $$1.c($$2);
         return bsd.c;
      } else {
         return bsd.d;
      }
   }

   private static float a(cyg $$0) {
      return $$0.a(cwf.uw) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cwb $$0, dfb $$1, bva $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cus.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dC(), $$2.dE(), $$2.dI(), (awk)$$2x.a(), $$2.dn(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bva $$0, cwb $$1) {
      List<cwb> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ku.O, cyg.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cwb $$0) {
      cyg $$1 = $$0.a(ku.O, cyg.a);
      return !$$1.b();
   }

   @Override
   protected void a(bva $$0, cpg $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bva $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dC() - $$0.dC();
         double $$8 = $$6.dI() - $$0.dI();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dE() + $$9 * 0.2F;
         $$11 = a($$0, new ezn($$7, $$10, $$8), $$5);
      } else {
         ezn $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         ezn $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.ea(), $$2);
      $$0.dX().a(null, $$0.dC(), $$0.dE(), $$0.dI(), awl.gv, $$0.dn(), 1.0F, $$16);
   }

   private static Vector3f a(bva $$0, ezn $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ezn $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cpg a(dfb $$0, bva $$1, cwb $$2, cwb $$3, boolean $$4) {
      if ($$3.a(cwf.uw)) {
         return new cpb($$0, $$3, $$1, $$1.dC(), $$1.dG() - 0.15F, $$1.dI(), true);
      } else {
         cpg $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cou $$6) {
            $$6.b(awl.go);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cwb $$0) {
      return $$0.a(cwf.uw) ? 3 : 1;
   }

   public void a(dfb $$0, bva $$1, bsc $$2, cwb $$3, float $$4, float $$5, @Nullable bva $$6) {
      if ($$0 instanceof arn $$7) {
         cyg $$9 = $$3.b(ku.O, cyg.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof com, $$6);
            if ($$1 instanceof aro $$10) {
               ao.G.a($$10, $$3);
               $$10.b(awv.c.b($$3.h()));
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
   public void a(dfb $$0, bva $$1, cwb $$2, int $$3) {
      if (!$$0.C) {
         cus.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.m = false;
            this.n = false;
         }

         if ($$5 >= 0.2F && !this.m) {
            this.m = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (awk)$$2x.a(), awm.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.n) {
            this.n = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), (awk)$$2x.a(), awm.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cwb $$0, bva $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cwb $$0, bva $$1) {
      float $$2 = dbu.a($$0, $$1, 1.25F);
      return azk.d($$2 * 20.0F);
   }

   @Override
   public cwd b(cwb $$0) {
      return cwd.g;
   }

   cus.a i(cwb $$0) {
      return dbu.b($$0, dbt.B).orElse(s);
   }

   private static float a(int $$0, cwb $$1, bva $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      cyg $$4 = $$0.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         cwb $$5 = $$4.a().get(0);
         $$2.add(xi.c("item.minecraft.crossbow.projectile").b(xh.v).b($$5.J()));
         if ($$3.a() && $$5.a(cwf.uw)) {
            List<xi> $$6 = Lists.newArrayList();
            cwf.uw.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xi.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cwb $$0) {
      return $$0.a((cvx)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jq<awk>> b, Optional<jq<awk>> c, Optional<jq<awk>> d) {
      public static final Codec<cus.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awk.b.optionalFieldOf("start").forGetter(cus.a::a),
                  awk.b.optionalFieldOf("mid").forGetter(cus.a::b),
                  awk.b.optionalFieldOf("end").forGetter(cus.a::c)
               )
               .apply($$0, cus.a::new)
      );

      public Optional<jq<awk>> a() {
         return this.b;
      }

      public Optional<jq<awk>> b() {
         return this.c;
      }

      public Optional<jq<awk>> c() {
         return this.d;
      }
   }
}
