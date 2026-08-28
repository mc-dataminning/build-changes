import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cse(Map<csd.a, Integer> b, int c, jm<avn> d, Supplier<cyu> e, List<cse.a> f, float g, float h) {
   public static final Codec<jm<cse>> a = lt.ap.s();

   public int a(csd.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<csd.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public jm<avn> c() {
      return this.d;
   }

   public Supplier<cyu> d() {
      return this.e;
   }

   public List<cse.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final akq a;
      private final String b;
      private final boolean c;
      private final akq d;
      private final akq e;

      public a(akq $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(akq $$0) {
         this($$0, "", false);
      }

      private akq b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public akq a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
