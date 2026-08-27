import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cod extends cou {
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

   public cod(cou.a $$0) {
      super($$0);
   }

   @Override
   public blu a(cri $$0) {
      cvn $$1 = $$0.q();
      if (!$$1.B) {
         coz $$2 = $$0.n();
         ens $$3 = $$0.l();
         ie $$4 = $$0.k();
         chu $$5 = new chu($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return blu.a($$1.B);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      if ($$1.fw()) {
         coz $$3 = $$1.b($$2);
         if (!$$0.B) {
            chu $$4 = new chu($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fU().d) {
               $$3.h(1);
            }

            $$1.b(atu.c.b(this));
         }

         return blv.a($$1.b($$2), $$0.y_());
      } else {
         return blv.c($$1.b($$2));
      }
   }

   @Override
   public void a(coz $$0, @Nullable cvn $$1, List<vq> $$2, cqq $$3) {
      sw $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(vq.c("item.minecraft.firework_rocket.flight").b(vp.v).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         tc $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               sw $$7 = $$5.a($$6);
               List<vq> $$8 = Lists.newArrayList();
               coe.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, vq.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(coz $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public coz ao_() {
      coz $$0 = new coz(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cod.a> f = auz.a(cod.a::a, values(), auz.a.a);
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

      public static cod.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
