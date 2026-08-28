import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ctc extends cvn {
   private static final float k = 1.25F;
   public static final int a = 8;
   private boolean l = false;
   private boolean m = false;
   private static final float n = 0.2F;
   private static final float o = 0.5F;
   private static final float p = 3.15F;
   private static final float q = 1.6F;
   public static final float b = 1.6F;
   private static final ctc.a r = new ctc.a(Optional.of(avp.gq), Optional.of(avp.gp), Optional.of(avp.go));

   public ctc(cul.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cuq> d() {
      return j;
   }

   @Override
   public Predicate<cuq> b() {
      return c;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      cxg $$4 = $$3.a(kq.E);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bqs.b($$3);
      } else if (!$$1.g($$3).e()) {
         this.l = false;
         this.m = false;
         $$1.c($$2);
         return bqs.b($$3);
      } else {
         return bqs.d($$3);
      }
   }

   private static float a(cxg $$0) {
      return $$0.a(cut.uu) ? 1.6F : 3.15F;
   }

   @Override
   public void a(cuq $$0, dcw $$1, btn $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !i($$0) && a($$2, $$0)) {
         ctc.a $$6 = this.k($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dt(), $$2.dv(), $$2.dz(), (avo)$$2x.a(), $$2.de(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F));
      }
   }

   private static boolean a(btn $$0, cuq $$1) {
      List<cuq> $$2 = a($$1, $$0.g($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kq.E, cxg.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean i(cuq $$0) {
      cxg $$1 = $$0.a(kq.E, cxg.a);
      return !$$1.b();
   }

   @Override
   protected void a(btn $$0, cnp $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btn $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dt() - $$0.dt();
         double $$8 = $$6.dz() - $$0.dz();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dv() + $$9 * 0.2F;
         $$11 = a($$0, new exc($$7, $$10, $$8), $$5);
      } else {
         exc $$12 = $$0.j(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.c, $$12.d, $$12.e);
         exc $$14 = $$0.g(1.0F);
         $$11 = $$14.j().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dR(), $$2);
      $$0.dO().a(null, $$0.dt(), $$0.dv(), $$0.dz(), avp.gu, $$0.de(), 1.0F, $$16);
   }

   private static Vector3f a(btn $$0, exc $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         exc $$5 = $$0.j(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cnp a(dcw $$0, btn $$1, cuq $$2, cuq $$3, boolean $$4) {
      if ($$3.a(cut.uu)) {
         return new cnk($$0, $$3, $$1, $$1.dt(), $$1.dx() - 0.15F, $$1.dz(), true);
      } else {
         cnp $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cnd $$6) {
            $$6.b(avp.gn);
         }

         return $$5;
      }
   }

   @Override
   protected int j(cuq $$0) {
      return $$0.a(cut.uu) ? 3 : 1;
   }

   public void a(dcw $$0, btn $$1, bqq $$2, cuq $$3, float $$4, float $$5, @Nullable btn $$6) {
      if ($$0 instanceof aqu $$7) {
         cxg $$9 = $$3.b(kq.E, cxg.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cmx, $$6);
            if ($$1 instanceof aqv $$10) {
               an.G.a($$10, $$3);
               $$10.b(avz.c.b($$3.g()));
            }
         }
      }
   }

   private static float a(ayw $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, ayw $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dcw $$0, btn $$1, cuq $$2, int $$3) {
      if (!$$0.B) {
         ctc.a $$4 = this.k($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.l = false;
            this.m = false;
         }

         if ($$5 >= 0.2F && !this.l) {
            this.l = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), (avo)$$2x.a(), avq.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.m) {
            this.m = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), (avo)$$2x.a(), avq.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cuq $$0, btn $$1) {
      float $$2 = dae.a($$0, $$1, 1.25F);
      return ayo.d($$2 * 20.0F);
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.g;
   }

   ctc.a k(cuq $$0) {
      return dae.b($$0, dad.B).orElse(r);
   }

   private static float a(int $$0, cuq $$1, btn $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      cxg $$4 = $$0.a(kq.E);
      if ($$4 != null && !$$4.b()) {
         cuq $$5 = $$4.a().get(0);
         $$2.add(wz.c("item.minecraft.crossbow.projectile").b(wy.v).b($$5.F()));
         if ($$3.a() && $$5.a(cut.uu)) {
            List<wz> $$6 = Lists.newArrayList();
            cut.uu.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wz.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean l(cuq $$0) {
      return $$0.a((cul)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jm<avo>> b, Optional<jm<avo>> c, Optional<jm<avo>> d) {
      public static final Codec<ctc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avo.b.optionalFieldOf("start").forGetter(ctc.a::a),
                  avo.b.optionalFieldOf("mid").forGetter(ctc.a::b),
                  avo.b.optionalFieldOf("end").forGetter(ctc.a::c)
               )
               .apply($$0, ctc.a::new)
      );

      public Optional<jm<avo>> a() {
         return this.b;
      }

      public Optional<jm<avo>> b() {
         return this.c;
      }

      public Optional<jm<avo>> c() {
         return this.d;
      }
   }
}
