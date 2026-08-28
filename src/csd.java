import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record csd(Map<csc.a, Integer> b, int c, ji<avy> d, Supplier<cyq> e, List<csd.a> f, float g, float h) {
   public static final Codec<ji<csd>> a = lp.ar.r();

   public int a(csc.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<csc.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public ji<avy> c() {
      return this.d;
   }

   public Supplier<cyq> d() {
      return this.e;
   }

   public List<csd.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final ale a;
      private final String b;
      private final boolean c;
      private final ale d;
      private final ale e;

      public a(ale $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(ale $$0) {
         this($$0, "", false);
      }

      private ale b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public ale a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
