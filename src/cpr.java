import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cpr extends cqh {
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

   public cpr(cqh.a $$0) {
      super($$0);
   }

   @Override
   public bnd a(csw $$0) {
      cxb $$1 = $$0.q();
      if (!$$1.B) {
         cqm $$2 = $$0.n();
         ept $$3 = $$0.l();
         ih $$4 = $$0.k();
         cjh $$5 = new cjh($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bnd.a($$1.B);
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      if ($$1.fB()) {
         cqm $$3 = $$1.b($$2);
         if (!$$0.B) {
            cjh $$4 = new cjh($$0, $$3, $$1);
            $$0.b($$4);
            $$3.a(1, $$1);
            $$1.b(aui.c.b(this));
         }

         return bne.a($$1.b($$2), $$0.x_());
      } else {
         return bne.c($$1.b($$2));
      }
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      ta $$4 = $$0.c("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(vu.c("item.minecraft.firework_rocket.flight").b(vt.v).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         tg $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               ta $$7 = $$5.a($$6);
               List<vu> $$8 = Lists.newArrayList();
               cps.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, vu.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(cqm $$0, byte $$1) {
      $$0.b("Fireworks").a("Flight", $$1);
   }

   @Override
   public cqm am_() {
      cqm $$0 = new cqm(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cpr.a> f = avn.a(cpr.a::a, values(), avn.a.a);
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

      public static cpr.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
