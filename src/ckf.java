import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckf extends ckw {
   public static final byte[] a = new byte[]{1, 2, 3};
   public static final String b = "Fireworks";
   public static final String c = "Explosion";
   public static final String d = "Explosions";
   public static final String e = "Flight";
   public static final String f = "Type";
   public static final String g = "Trail";
   public static final String h = "Flicker";
   public static final String i = "Colors";
   public static final String j = "FadeColors";
   public static final double k = 0.15;

   public ckf(ckw.a $$0) {
      super($$0);
   }

   @Override
   public biq a(cnl $$0) {
      crs $$1 = $$0.q();
      if (!$$1.B) {
         clb $$2 = $$0.n();
         eji $$3 = $$0.l();
         hx $$4 = $$0.k();
         cdz $$5 = new cdz($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return biq.a($$1.B);
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      if ($$1.fw()) {
         clb $$3 = $$1.b($$2);
         if (!$$0.B) {
            cdz $$4 = new cdz($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fT().d) {
               $$3.h(1);
            }

            $$1.b(aqx.c.b(this));
         }

         return bir.a($$1.b($$2), $$0.x_());
      } else {
         return bir.c($$1.b($$2));
      }
   }

   @Override
   public void a(clb $$0, @Nullable crs $$1, List<ur> $$2, cms $$3) {
      rz $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(ur.c("item.minecraft.firework_rocket.flight").b(uq.u).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         sf $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               rz $$7 = $$5.a($$6);
               List<ur> $$8 = Lists.newArrayList();
               ckg.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, ur.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(clb $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public clb al_() {
      clb $$0 = new clb(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<ckf.a> f = asb.a(ckf.a::a, values(), asb.a.a);
      private final int g;
      private final String h;

      private a(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public String b() {
         return this.h;
      }

      public static ckf.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
