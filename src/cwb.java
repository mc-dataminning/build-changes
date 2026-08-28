import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cwb extends cyg {
   private static final float l = 1.25F;
   public static final int a = 8;
   private boolean m = false;
   private boolean n = false;
   private static final float o = 0.2F;
   private static final float p = 0.5F;
   private static final float q = 3.15F;
   private static final float r = 1.6F;
   public static final float b = 1.6F;
   private static final cwb.a s = new cwb.a(Optional.of(axf.gJ), Optional.of(axf.gI), Optional.of(axf.gH));

   public cwb(cxg.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cxk> d() {
      return d;
   }

   @Override
   public Predicate<cxk> b() {
      return c;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      czp $$4 = $$3.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bte.c;
      } else if (!$$1.d($$3).f()) {
         this.m = false;
         this.n = false;
         $$1.c($$2);
         return bte.c;
      } else {
         return bte.d;
      }
   }

   private static float a(czp $$0) {
      return $$0.a(cxo.vk) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cxk $$0, dha $$1, bwb $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cwb.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dA(), $$2.dC(), $$2.dG(), (axe)$$2x.a(), $$2.dm(), 1.0F, 1.0F / ($$1.H_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bwb $$0, cxk $$1) {
      List<cxk> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ku.O, czp.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cxk $$0) {
      czp $$1 = $$0.a(ku.O, czp.a);
      return !$$1.b();
   }

   @Override
   protected void a(bwb $$0, cql $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bwb $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new fbs($$7, $$10, $$8), $$5);
      } else {
         fbs $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fbs $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), axf.gN, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(bwb $$0, fbs $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fbs $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cql a(dha $$0, bwb $$1, cxk $$2, cxk $$3, boolean $$4) {
      if ($$3.a(cxo.vk)) {
         return new cqg($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         cql $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cpz $$6) {
            $$6.b(axf.gG);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cxk $$0) {
      return $$0.a(cxo.vk) ? 3 : 1;
   }

   public void a(dha $$0, bwb $$1, btd $$2, cxk $$3, float $$4, float $$5, @Nullable bwb $$6) {
      if ($$0 instanceof ash $$7) {
         czp $$9 = $$3.b(ku.O, czp.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cps, $$6);
            if ($$1 instanceof asi $$10) {
               ao.G.a($$10, $$3);
               $$10.b(axp.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(bam $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, bam $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dha $$0, bwb $$1, cxk $$2, int $$3) {
      if (!$$0.C) {
         cwb.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.m = false;
            this.n = false;
         }

         if ($$5 >= 0.2F && !this.m) {
            this.m = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (axe)$$2x.a(), axg.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.n) {
            this.n = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (axe)$$2x.a(), axg.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cxk $$0, bwb $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cxk $$0, bwb $$1) {
      float $$2 = ddt.a($$0, $$1, 1.25F);
      return bae.d($$2 * 20.0F);
   }

   @Override
   public cxm b(cxk $$0) {
      return cxm.g;
   }

   cwb.a i(cxk $$0) {
      return ddt.b($$0, dds.B).orElse(s);
   }

   private static float a(int $$0, cxk $$1, bwb $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      czp $$4 = $$0.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         cxk $$5 = $$4.a().get(0);
         $$2.add(xv.c("item.minecraft.crossbow.projectile").b(xu.v).b($$5.J()));
         if ($$3.a() && $$5.a(cxo.vk)) {
            List<xv> $$6 = Lists.newArrayList();
            cxo.vk.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xv.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cxk $$0) {
      return $$0.a((cxg)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jq<axe>> b, Optional<jq<axe>> c, Optional<jq<axe>> d) {
      public static final Codec<cwb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.b.optionalFieldOf("start").forGetter(cwb.a::a),
                  axe.b.optionalFieldOf("mid").forGetter(cwb.a::b),
                  axe.b.optionalFieldOf("end").forGetter(cwb.a::c)
               )
               .apply($$0, cwb.a::new)
      );

      public Optional<jq<axe>> a() {
         return this.b;
      }

      public Optional<jq<axe>> b() {
         return this.c;
      }

      public Optional<jq<axe>> c() {
         return this.d;
      }
   }
}
