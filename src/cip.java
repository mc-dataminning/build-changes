import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cip extends cjg {
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

   public cip(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhe a(clv $$0) {
      cqb $$1 = $$0.q();
      if (!$$1.B) {
         cjl $$2 = $$0.n();
         ehh $$3 = $$0.l();
         ha $$4 = $$0.k();
         ccn $$5 = new ccn($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bhe.a($$1.B);
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      if ($$1.fw()) {
         cjl $$3 = $$1.b($$2);
         if (!$$0.B) {
            ccn $$4 = new ccn($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fT().d) {
               $$3.h(1);
            }

            $$1.b(apq.c.b(this));
         }

         return bhf.a($$1.b($$2), $$0.w_());
      } else {
         return bhf.c($$1.b($$2));
      }
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
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
               ciq.a($$7, $$8);
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

   public static void a(cjl $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public cjl ai_() {
      cjl $$0 = new cjl(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cip.a> f = aqu.a(cip.a::a, values(), aqu.a.a);
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

      public static cip.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
