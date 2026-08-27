import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cll extends cmc {
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

   public cll(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjl a(cos $$0) {
      csy $$1 = $$0.q();
      if (!$$1.B) {
         cmh $$2 = $$0.n();
         elb $$3 = $$0.l();
         ia $$4 = $$0.k();
         cfe $$5 = new cfe($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bjl.a($$1.B);
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      if ($$1.fw()) {
         cmh $$3 = $$1.b($$2);
         if (!$$0.B) {
            cfe $$4 = new cfe($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fT().d) {
               $$3.h(1);
            }

            $$1.b(arm.c.b(this));
         }

         return bjm.a($$1.b($$2), $$0.y_());
      } else {
         return bjm.c($$1.b($$2));
      }
   }

   @Override
   public void a(cmh $$0, @Nullable csy $$1, List<vb> $$2, cny $$3) {
      sj $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(vb.c("item.minecraft.firework_rocket.flight").b(va.u).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         sp $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               sj $$7 = $$5.a($$6);
               List<vb> $$8 = Lists.newArrayList();
               clm.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, vb.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(cmh $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public cmh am_() {
      cmh $$0 = new cmh(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cll.a> f = asq.a(cll.a::a, values(), asq.a.a);
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

      public static cll.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
