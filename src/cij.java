import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cij extends cja {
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

   public cij(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgy a(clp $$0) {
      cpv $$1 = $$0.q();
      if (!$$1.B) {
         cjf $$2 = $$0.n();
         ehn $$3 = $$0.l();
         ha $$4 = $$0.k();
         cch $$5 = new cch($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bgy.a($$1.B);
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      if ($$1.fv()) {
         cjf $$3 = $$1.b($$2);
         if (!$$0.B) {
            cch $$4 = new cch($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fS().d) {
               $$3.h(1);
            }

            $$1.b(apn.c.b(this));
         }

         return bgz.a($$1.b($$2), $$0.w_());
      } else {
         return bgz.c($$1.b($$2));
      }
   }

   @Override
   public void a(cjf $$0, @Nullable cpv $$1, List<tl> $$2, ckw $$3) {
      qw $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(tl.c("item.minecraft.firework_rocket.flight").b(tk.u).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         rc $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               qw $$7 = $$5.a($$6);
               List<tl> $$8 = Lists.newArrayList();
               cik.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, tl.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(cjf $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public cjf ai_() {
      cjf $$0 = new cjf(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cij.a> f = aqr.a(cij.a::a, values(), aqr.a.a);
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

      public static cij.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
