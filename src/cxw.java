import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class cxw extends czy {
   private static final float o = 1.25F;
   public static final int a = 8;
   private boolean p = false;
   private boolean q = false;
   private static final float r = 0.2F;
   private static final float s = 0.5F;
   private static final float t = 3.15F;
   private static final float u = 1.6F;
   public static final float b = 1.6F;
   private static final cxw.b v = new cxw.b(Optional.of(awn.gN), Optional.of(awn.gM), Optional.of(awn.gL));

   public cxw(cyz.a $$0) {
      super($$0);
   }

   @Override
   public Predicate<czd> c() {
      return d;
   }

   @Override
   public Predicate<czd> a() {
      return c;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      dbh $$4 = $$3.a(kj.P);
      if ($$4 != null && !$$4.b()) {
         this.a($$0, $$1, $$2, $$3, a($$4), 1.0F, null);
         return bud.c;
      } else if (!$$1.d($$3).f()) {
         this.p = false;
         this.q = false;
         $$1.c($$2);
         return bud.c;
      } else {
         return bud.d;
      }
   }

   private static float a(dbh $$0) {
      return $$0.a(czh.vE) ? 1.6F : 3.15F;
   }

   @Override
   public boolean a(czd $$0, dja $$1, bxe $$2, int $$3) {
      int $$4 = this.a($$0, $$2) - $$3;
      return a($$4, $$0, $$2) >= 1.0F && g($$0);
   }

   private static boolean a(bxe $$0, czd $$1) {
      List<czd> $$2 = a($$1, $$0.d($$1), $$0);
      if (!$$2.isEmpty()) {
         $$1.b(kj.P, dbh.a($$2));
         return true;
      } else {
         return false;
      }
   }

   public static boolean g(czd $$0) {
      dbh $$1 = $$0.a(kj.P, dbh.a);
      return !$$1.b();
   }

   @Override
   protected void a(bxe $$0, crx $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bxe $$6) {
      Vector3f $$11;
      if ($$6 != null) {
         double $$7 = $$6.dA() - $$0.dA();
         double $$8 = $$6.dG() - $$0.dG();
         double $$9 = Math.sqrt($$7 * $$7 + $$8 * $$8);
         double $$10 = $$6.e(0.3333333333333333) - $$1.dC() + $$9 * 0.2F;
         $$11 = a($$0, new feq($$7, $$10, $$8), $$5);
      } else {
         feq $$12 = $$0.m(1.0F);
         Quaternionf $$13 = new Quaternionf().setAngleAxis((double)($$5 * (float) (Math.PI / 180.0)), $$12.d, $$12.e, $$12.f);
         feq $$14 = $$0.h(1.0F);
         $$11 = $$14.k().rotate($$13);
      }

      $$1.c((double)$$11.x(), (double)$$11.y(), (double)$$11.z(), $$3, $$4);
      float $$16 = a($$0.dY(), $$2);
      $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awn.gR, $$0.dm(), 1.0F, $$16);
   }

   private static Vector3f a(bxe $$0, feq $$1, float $$2) {
      Vector3f $$3 = $$1.k().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         feq $$5 = $$0.m(1.0F);
         $$4 = new Vector3f($$3).cross($$5.k());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }

   @Override
   protected crx a(dja $$0, bxe $$1, czd $$2, czd $$3, boolean $$4) {
      if ($$3.a(czh.vE)) {
         return new crs($$0, $$3, $$1, $$1.dA(), $$1.dE() - 0.15F, $$1.dG(), true);
      } else {
         crx $$5 = super.a($$0, $$1, $$2, $$3, $$4);
         if ($$5 instanceof crk $$6) {
            $$6.b(awn.gK);
         }

         return $$5;
      }
   }

   @Override
   protected int h(czd $$0) {
      return $$0.a(czh.vE) ? 3 : 1;
   }

   public void a(dja $$0, bxe $$1, buc $$2, czd $$3, float $$4, float $$5, @Nullable bxe $$6) {
      if ($$0 instanceof arq $$7) {
         dbh $$9 = $$3.b(kj.P, dbh.a);
         if ($$9 != null && !$$9.b()) {
            this.a($$7, $$1, $$2, $$3, $$9.a(), $$4, $$5, $$1 instanceof crc, $$6);
            if ($$1 instanceof arr $$10) {
               ap.G.a($$10, $$3);
               $$10.b(awx.c.b($$3.h()));
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
   public void a(dja $$0, bxe $$1, czd $$2, int $$3) {
      if (!$$0.C) {
         cxw.b $$4 = this.i($$2);
         float $$5 = (float)($$2.a($$1) - $$3) / (float)b($$2, $$1);
         if ($$5 < 0.2F) {
            this.p = false;
            this.q = false;
         }

         if ($$5 >= 0.2F && !this.p) {
            this.p = true;
            $$4.a().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awm)$$2x.a(), awo.h, 0.5F, 1.0F));
         }

         if ($$5 >= 0.5F && !this.q) {
            this.q = true;
            $$4.b().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awm)$$2x.a(), awo.h, 0.5F, 1.0F));
         }

         if ($$5 >= 1.0F && !g($$2) && a($$1, $$2)) {
            $$4.c().ifPresent($$2x -> $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), (awm)$$2x.a(), $$1.dm(), 1.0F, 1.0F / ($$0.C_().i() * 0.5F + 1.0F) + 0.2F));
         }
      }
   }

   @Override
   public int a(czd $$0, bxe $$1) {
      return 72000;
   }

   public static int b(czd $$0, bxe $$1) {
      float $$2 = dfs.a($$0, $$1, 1.25F);
      return azm.d($$2 * 20.0F);
   }

   @Override
   public czf b(czd $$0) {
      return czf.g;
   }

   cxw.b i(czd $$0) {
      return dfs.b($$0, dfr.B).orElse(v);
   }

   private static float a(int $$0, czd $$1, bxe $$2) {
      float $$3 = (float)$$0 / (float)b($$1, $$2);
      if ($$3 > 1.0F) {
         $$3 = 1.0F;
      }

      return $$3;
   }

   @Override
   public boolean e_(czd $$0) {
      return $$0.a((cyz)this);
   }

   @Override
   public int b() {
      return 8;
   }

   public static enum a implements bak {
      a("none"),
      b("arrow"),
      c("rocket");

      public static final Codec<cxw.a> d = bak.a(cxw.a::values);
      private final String e;

      private a(final String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }

   public static record b(Optional<je<awm>> b, Optional<je<awm>> c, Optional<je<awm>> d) {
      public static final Codec<cxw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awm.b.optionalFieldOf("start").forGetter(cxw.b::a),
                  awm.b.optionalFieldOf("mid").forGetter(cxw.b::b),
                  awm.b.optionalFieldOf("end").forGetter(cxw.b::c)
               )
               .apply($$0, cxw.b::new)
      );

      public Optional<je<awm>> a() {
         return this.b;
      }

      public Optional<je<awm>> b() {
         return this.c;
      }

      public Optional<je<awm>> c() {
         return this.d;
      }
   }
}
