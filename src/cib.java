import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cib extends cis {
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

   public cib(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgq a(clh $$0) {
      cpl $$1 = $$0.q();
      if (!$$1.B) {
         cix $$2 = $$0.n();
         ehd $$3 = $$0.l();
         ha $$4 = $$0.k();
         cbz $$5 = new cbz($$1, $$0.o(), $$3.c + (double)$$4.j() * 0.15, $$3.d + (double)$$4.k() * 0.15, $$3.e + (double)$$4.l() * 0.15, $$2);
         $$1.b($$5);
         $$2.h(1);
      }

      return bgq.a($$1.B);
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      if ($$1.fu()) {
         cix $$3 = $$1.b($$2);
         if (!$$0.B) {
            cbz $$4 = new cbz($$0, $$3, $$1);
            $$0.b($$4);
            if (!$$1.fR().d) {
               $$3.h(1);
            }

            $$1.b(apg.c.b(this));
         }

         return bgr.a($$1.b($$2), $$0.r_());
      } else {
         return bgr.c($$1.b($$2));
      }
   }

   @Override
   public void a(cix $$0, @Nullable cpl $$1, List<tf> $$2, cko $$3) {
      qr $$4 = $$0.b("Fireworks");
      if ($$4 != null) {
         if ($$4.b("Flight", 99)) {
            $$2.add(tf.c("item.minecraft.firework_rocket.flight").b(te.u).f(String.valueOf($$4.f("Flight"))).a(n.h));
         }

         qx $$5 = $$4.c("Explosions", 10);
         if (!$$5.isEmpty()) {
            for (int $$6 = 0; $$6 < $$5.size(); $$6++) {
               qr $$7 = $$5.a($$6);
               List<tf> $$8 = Lists.newArrayList();
               cic.a($$7, $$8);
               if (!$$8.isEmpty()) {
                  for (int $$9 = 1; $$9 < $$8.size(); $$9++) {
                     $$8.set($$9, tf.b("  ").b($$8.get($$9)).a(n.h));
                  }

                  $$2.addAll($$8);
               }
            }
         }
      }
   }

   public static void a(cix $$0, byte $$1) {
      $$0.a("Fireworks").a("Flight", $$1);
   }

   @Override
   public cix ad_() {
      cix $$0 = new cix(this);
      a($$0, (byte)1);
      return $$0;
   }

   public static enum a {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cib.a> f = aqk.a(cib.a::a, values(), aqk.a.a);
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

      public static cib.a a(int $$0) {
         return f.apply($$0);
      }
   }
}
