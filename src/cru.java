import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cru(Map<crt.a, Integer> b, int c, jj<avg> d, Supplier<cyg> e, List<cru.a> f, float g, float h) {
   public static final Codec<jj<cru>> a = lq.ap.s();

   public int a(crt.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<crt.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public jj<avg> c() {
      return this.d;
   }

   public Supplier<cyg> d() {
      return this.e;
   }

   public List<cru.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final akk a;
      private final String b;
      private final boolean c;
      private final akk d;
      private final akk e;

      public a(akk $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(akk $$0) {
         this($$0, "", false);
      }

      private akk b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public akk a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
