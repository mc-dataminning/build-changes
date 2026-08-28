import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class czd extends dbf {
   private static final float o = 1.25F;
   public static final int a = 8;
   private boolean p = false;
   private boolean q = false;
   private static final float r = 0.2F;
   private static final float s = 0.5F;
   private static final float t = 3.15F;
   private static final float u = 1.6F;
   public static final float b = 1.6F;
   private static final czd.b v = new czd.b(Optional.of(awy.gN), Optional.of(awy.gM), Optional.of(awy.gL));

   public czd(dag.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<dak> c() {
      return d;
   }

   @Override
   public Predicate<dak> a() {
      return c;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      dco $$4 = $$3.a(kl.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bvc.c;
      } else if (!$$1.d($$3).f()) {
         this.p = false;
         this.q = false;
         $$1.c($$2);
         return bvc.c;
      } else {
         return bvc.d;
      }
   }

   private static float a(dco $$0) {
      return $$0.a(dao.vE) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(dak $$0, dkj $$1, byf $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      return a($$4, $$0, $$2) >= 1.0F && g($$0);
   }

   private static boolean a(byf $$0, dak $$1) {
      List<dak> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kl.P, dco.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(dak $$0) {
      dco $$1 = $$0.a(kl.P, dco.a);
      return !$$1.b();
   }

   @Override
   protected void a(byf $$0, ctd $$1, int $$2, float $$3, float $$4, float $$5, @Nullable byf $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new fgc($$7, $$10, $$8), $$5);
      } else {
         fgc $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fgc $$14 = $$0.h(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awy.gR, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(byf $$0, fgc $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fgc $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected ctd a(dkj $$0, byf $$1, dak $$2, dak $$3, boolean $$4) {
      if ($$3.a(dao.vE)) {
         return new csy($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         ctd $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof csq $$6) {
            $$6.b(awy.gK);
         }

         return $$5;
      }
   }

   @Override
   protected int h(dak $$0) {
      return $$0.a(dao.vE) ? 3 : 1;
   }

   public void a(dkj $$0, byf $$1, bvb $$2, dak $$3, float $$4, float $$5, @Nullable byf $$6) {
      if ($$0 instanceof asb $$7) {
         dco $$9 = $$3.b(kl.P, dco.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof csi, $$6);
            if ($$1 instanceof asc $$10) {
               aq.G.a($$10, $$3);
               $$10.b(axi.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(bai $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, bai $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dkj $$0, byf $$1, dak $$2, int $$3) {
      if (!$$0.C) {
         czd.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.p = false;
            this.q = false;
         }

         if ($$5 >= 0.2F && !this.p) {
            this.p = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awx)$$2x.a(), awz.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.q) {
            this.q = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awx)$$2x.a(), awz.h, 0.5F, 1.0F));
         }

         if ($$5 >= 1.0F && !g($$2) && a($$1, $$2)) {
            $$4.c().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awx)$$2x.a(), $$1.dm(), 1.0F, 1.0F / ($$0.G_().i() * 0.5F + 1.0F) + 0.2F));
         }
      }
   }

   @Override
   public int a(dak $$0, byf $$1) {
      return 72000;
   }

   public static int b(dak $$0, byf $$1) {
      float $$2 = dgz.a($$0, $$1, 1.25F);
      return azz.d($$2 * 20.0F);
   }

   @Override
   public dam b(dak $$0) {
      return dam.g;
   }

   czd.b i(dak $$0) {
      return dgz.b($$0, dgy.B).orElse(v);
   }

   private static float a(int $$0, dak $$1, byf $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public boolean e_(dak $$0) {
      return $$0.a((dag)this);
   }

   @Override
   public int b() {
      return 8;
   }

   public static enum a implements bax {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<czd.a> d = bax.a(czd.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<jg<awx>> b, Optional<jg<awx>> c, Optional<jg<awx>> d) {
      public static final Codec<czd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awx.b.optionalFieldOf("start").forGetter(czd.b::a),
                  awx.b.optionalFieldOf("mid").forGetter(czd.b::b),
                  awx.b.optionalFieldOf("end").forGetter(czd.b::c)
               )
               .apply($$0, czd.b::new)
      );

      public Optional<jg<awx>> a() {
         return this.b;
      }

      public Optional<jg<awx>> b() {
         return this.c;
      }

      public Optional<jg<awx>> c() {
         return this.d;
      }
   }
}
