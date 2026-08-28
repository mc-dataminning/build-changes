import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cuw extends cxb {
   private static final float l = 1.25F;
   public static final int a = 8;
   private boolean m = false;
   private boolean n = false;
   private static final float o = 0.2F;
   private static final float p = 0.5F;
   private static final float q = 3.15F;
   private static final float r = 1.6F;
   public static final float b = 1.6F;
   private static final cuw.a s = new cuw.a(Optional.of(awo.gr), Optional.of(awo.gq), Optional.of(awo.gp));

   public cuw(cwb.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<cwf> d() {
      return d;
   }

   @Override
   public Predicate<cwf> b() {
      return c;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      cyk $$4 = $$3.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bsh.c;
      } else if (!$$1.d($$3).f()) {
         this.m = false;
         this.n = false;
         $$1.c($$2);
         return bsh.c;
      } else {
         return bsh.d;
      }
   }

   private static float a(cyk $$0) {
      return $$0.a(cwj.uM) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(cwf $$0, dff $$1, bve $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      float $$5 = a($$4, $$0, $$2);
      if ($$5 >= 1.0F && !g($$0) && a($$2, $$0)) {
         cuw.a $$6 = this.i($$0);
         $$6.c().ifPresent($$2x -> $$1.a(null, $$2.dD(), $$2.dF(), $$2.dJ(), (awn)$$2x.a(), $$2.do(), 1.0F, 1.0F / ($$1.E_().i() * 0.5F + 1.0F) + 0.2F));
         return true;
      } else {
         return false;
      }
   }

   private static boolean a(bve $$0, cwf $$1) {
      List<cwf> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(ku.O, cyk.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(cwf $$0) {
      cyk $$1 = $$0.a(ku.O, cyk.a);
      return !$$1.b();
   }

   @Override
   protected void a(bve $$0, cpk $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bve $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dD() - $$0.dD();
         double $$8 = $$6.dJ() - $$0.dJ();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dF() + $$9 * 0.2F;
         $$11 = a($$0, new ezr($$7, $$10, $$8), $$5);
      } else {
         ezr $$12 = $$0.l(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         ezr $$14 = $$0.g(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.eb(), $$2);
      $$0.dY().a(null, $$0.dD(), $$0.dF(), $$0.dJ(), awo.gv, $$0.do(), 1.0F, $$16);
   }

   private static Vector3f a(bve $$0, ezr $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         ezr $$5 = $$0.l(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected cpk a(dff $$0, bve $$1, cwf $$2, cwf $$3, boolean $$4) {
      if ($$3.a(cwj.uM)) {
         return new cpf($$0, $$3, $$1, $$1.dD(), $$1.dH() - 0.15F, $$1.dJ(), true);
      } else {
         cpk $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof coy $$6) {
            $$6.b(awo.go);
         }

         return $$5;
      }
   }

   @Override
   protected int h(cwf $$0) {
      return $$0.a(cwj.uM) ? 3 : 1;
   }

   public void a(dff $$0, bve $$1, bsg $$2, cwf $$3, float $$4, float $$5, @Nullable bve $$6) {
      if ($$0 instanceof arq $$7) {
         cyk $$9 = $$3.b(ku.O, cyk.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof cor, $$6);
            if ($$1 instanceof arr $$10) {
               ao.G.a($$10, $$3);
               $$10.b(awy.c.b($$3.h()));
            }
         }
      }
   }

   private static float a(azv $$0, int $$1) {
      return $$1 == 0 ? 1.0F : a(($$1 & 1) == 1, $$0);
   }

   private static float a(boolean $$0, azv $$1) {
      float $$2 = $$0 ? 0.63F : 0.43F;
      return 1.0F / ($$1.i() * 0.5F + 1.8F) + $$2;
   }

   @Override
   public void a(dff $$0, bve $$1, cwf $$2, int $$3) {
      if (!$$0.C) {
         cuw.a $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.m = false;
            this.n = false;
         }

         if ($$5 >= 0.2F && !this.m) {
            this.m = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), (awn)$$2x.a(), awp.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.n) {
            this.n = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dD(), $$1.dF(), $$1.dJ(), (awn)$$2x.a(), awp.h, 0.5F, 1.0F));
         }
      }
   }

   @Override
   public int a(cwf $$0, bve $$1) {
      return b($$0, $$1) + 3;
   }

   public static int b(cwf $$0, bve $$1) {
      float $$2 = dby.a($$0, $$1, 1.25F);
      return azn.d($$2 * 20.0F);
   }

   @Override
   public cwh b(cwf $$0) {
      return cwh.g;
   }

   cuw.a i(cwf $$0) {
      return dby.b($$0, dbx.B).orElse(s);
   }

   private static float a(int $$0, cwf $$1, bve $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      cyk $$4 = $$0.a(ku.O);
      if ($$4 != null && !$$4.b()) {
         cwf $$5 = $$4.a().get(0);
         $$2.add(xl.c("item.minecraft.crossbow.projectile").b(xk.v).b($$5.J()));
         if ($$3.a() && $$5.a(cwj.uM)) {
            List<xl> $$6 = Lists.newArrayList();
            cwj.uM.a($$5, $$1, $$6, $$3);
            if (!$$6.isEmpty()) {
               for (int $$7 = 0; $$7 < $$6.size(); $$7++) {
                  $$6.set($$7, xl.b("  ").b($$6.get($$7)).a(n.h));
               }

               $$2.addAll($$6);
            }
         }
      }
   }

   @Override
   public boolean d_(cwf $$0) {
      return $$0.a((cwb)this);
   }

   @Override
   public int c() {
      return 8;
   }

   public static record a(Optional<jq<awn>> b, Optional<jq<awn>> c, Optional<jq<awn>> d) {
      public static final Codec<cuw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awn.b.optionalFieldOf("start").forGetter(cuw.a::a),
                  awn.b.optionalFieldOf("mid").forGetter(cuw.a::b),
                  awn.b.optionalFieldOf("end").forGetter(cuw.a::c)
               )
               .apply($$0, cuw.a::new)
      );

      public Optional<jq<awn>> a() {
         return this.b;
      }

      public Optional<jq<awn>> b() {
         return this.c;
      }

      public Optional<jq<awn>> c() {
         return this.d;
      }
   }
}
