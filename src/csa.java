import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record csa(Map<crz.a, Integer> b, int c, ji<avv> d, Supplier<cyn> e, List<csa.a> f, float g, float h) {
   public static final Codec<ji<csa>> a = lp.ar.r();

   public int a(crz.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<crz.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public ji<avv> c() {
      return this.d;
   }

   public Supplier<cyn> d() {
      return this.e;
   }

   public List<csa.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final alb a;
      private final String b;
      private final boolean c;
      private final alb d;
      private final alb e;

      public a(alb $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(alb $$0) {
         this($$0, "", false);
      }

      private alb b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public alb a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
