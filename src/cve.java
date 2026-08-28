import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cve extends cxj {
   private static final float m = 1.25F;
   public static final int a = 8;
   private boolean n = false;
   private boolean o = false;
   private static final float p = 0.2F;
   private static final float q = 0.5F;
   private static final float r = 3.15F;
   private static final float s = 1.6F;
   public static final float b = 1.6F;
   private static final cve.b t = new cve.b(Optional.of(avz.gL), Optional.of(avz.gK), Optional.of(avz.gJ));

   public cve(cwj.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cwn> d() {
      return d;
   }

   @Override
   public Predicate<cwn> b() {
      return c;
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      cys $$4 = $$3.a(kv.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bsi.c;
      } else if (!$$1.d($$3).f()) {
         this.n = false;
         this.o = false;
         $$1.c($$2);
         return bsi.c;
      } else {
         return bsi.d;
      }
   }

   private static float a(cys $$0) {
      return $$0.a(cwr.vt) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cwn $$0, dgg $$1, bvf $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cve.b $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dB(), $$2.dD(), $$2.dH(), (avy)$$2x.a(), $$2.dn(), 1.0F, 1.0F / ($$1.H_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bvf $$0, cwn $$1) {
      List<cwn> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kv.O, cys.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cwn $$0) {
      cys $$1 = $$0.a(kv.O, cys.a);
      return !$$1.b();
   }

   @Override
   protected void a(bvf $$0, cpo $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvf $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dB() - $$0.dB();
         double $$8 = $$6.dH() - $$0.dH();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dD() + $$9 * 0.2F;
         $$11 = a($$0, new fay($$7, $$10, $$8), $$5);
      } else {
         fay $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         fay $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dZ(), $$2);
      $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), avz.gP, $$0.dn(), 1.0F, $$16);
   }

   private static Vector3f a(bvf $$0, fay $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         fay $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cpo a(dgg $$0, bvf $$1, cwn $$2, cwn $$3, boolean $$4) {
      if ($$3.a(cwr.vt)) {
         return new cpj($$0, $$3, $$1, $$1.dB(), $$1.dF() - 0.15F, $$1.dH(), true);
      } else {
         cpo $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof cpc $$6) {
            $$6.b(avz.gI);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cwn $$0) {
      return $$0.a(cwr.vt) ? 3 : 1;
   }

   public void a(dgg $$0, bvf $$1, bsh $$2, cwn $$3, float $$4, float $$5, @Nullable bvf $$6) {
      if ($$0 instanceof arc $$7) {
         cys $$9 = $$3.b(kv.O, cys.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cov, $$6);
            if ($$1 instanceof ard $$10) {
               ap.G.a($$10, $$3);
               $$10.b(awj.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azg $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azg $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dgg $$0, bvf $$1, cwn $$2, int $$3) {
      if (!$$0.C) {
         cve.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.n = false;
            this.o = false;
         }

         if ($$5 >= 0.2F && !this.n) {
            this.n = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), (avy)$$2x.a(), awa.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.o) {
            this.o = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dB(), $$1.dD(), $$1.dH(), (avy)$$2x.a(), awa.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cwn $$0, bvf $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cwn $$0, bvf $$1) {
      float $$2 = dcz.a($$0, $$1, 1.25F);
      return ayy.d($$2 * 20.0F);
   }

   @Override
   public cwp b(cwn $$0) {
      return cwp.g;
   }

   cve.b i(cwn $$0) {
      return dcz.b($$0, dcy.B).orElse(t);
   }

   private static float a(int $$0, cwn $$1, bvf $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      cys $$4 = $$0.a(kv.O);
      if ($$4 != null && !$$4.b()) {
         cwn $$5 = $$4.a().get(0);
         $$2.add(wo.c("item.minecraft.crossbow.projectile").b(wn.v).b($$5.K()));
         if ($$3.a() && $$5.a(cwr.vt)) {
            List<wo> $$6 = Lists.newArrayList();
            cwr.vt.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, wo.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cwn $$0) {
      return $$0.a((cwj)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static enum a implements azu {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cve.a> d = azu.a(cve.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<jr<avy>> b, Optional<jr<avy>> c, Optional<jr<avy>> d) {
      public static final Codec<cve.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avy.b.optionalFieldOf("start").forGetter(cve.b::a),
                  avy.b.optionalFieldOf("mid").forGetter(cve.b::b),
                  avy.b.optionalFieldOf("end").forGetter(cve.b::c)
               )
               .apply($$0, cve.b::new)
      );

      public Optional<jr<avy>> a() {
         return this.b;
      }

      public Optional<jr<avy>> b() {
         return this.c;
      }

      public Optional<jr<avy>> c() {
         return this.d;
      }
   }
}
