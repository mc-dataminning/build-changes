import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cnd(Map<cnc.a, Integer> b, int c, il<ato> d, Supplier<csp> e, List<cnd.a> f, float g, float h) {
   public static final Codec<il<cnd>> a = kh.as.r();

   public int a(cnc.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<cnc.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public il<ato> c() {
      return this.d;
   }

   public Supplier<csp> d() {
      return this.e;
   }

   public List<cnd.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final ajc a;
      private final String b;
      private final boolean c;
      private final ajc d;
      private final ajc e;

      public a(ajc $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(ajc $$0) {
         this($$0, "", false);
      }

      private ajc b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public ajc a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
