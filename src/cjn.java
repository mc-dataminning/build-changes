import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjn extends cke {
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

   public cjn(cke.a $$0) {
      super($$0);
   }

   @Override
   public bib a(cmt $$0) {
      cqz $$1 = $$0.q();
      if (!$$1.B) {
         ckj $$2 = $$0.n();
         eif $$3 = $$0.l();
         hx $$4 = $$0.k();
         cdk $$5 = new cdk($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bib.a($$1.B);
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      if ($$1.fw()) {
         ckj $$3 = $$1.b($$2);
         if (!$$0.B) {
            cdk $$4 = new cdk($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fT().d) {
               $$3.h(1);
            }

            $$1.b(aqn.c.b(this));
         }

         return bic.a($$1.b($$2), $$0.x_());
      } else {
         return bic.c($$1.b($$2));
      }
   }

   @Override
   public void a(ckj $$0, @Nullable cqz $$1, List<ui> $$2, cma $$3) {
      rt $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(ui.c("item.minecraft.firework_rocket.flight").b(uh.u).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         rz $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               rt $$7 = $$5.a($$6);
               List<ui> $$8 = Lists.newArrayList();
               cjo.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, ui.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(ckj $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public ckj al_() {
      ckj $$0 = new ckj(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cjn.a> f = arr.a(cjn.a::a, values(), arr.a.a);
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

      public static cjn.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
