import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record coz(Map<coy.a, Integer> b, int c, il<aul> d, Supplier<cvg> e, List<coz.a> f, float g, float h) {
   public static final Codec<il<coz>> a = kr.as.r();

   public int a(coy.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<coy.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public il<aul> c() {
      return this.d;
   }

   public Supplier<cvg> d() {
      return this.e;
   }

   public List<coz.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final ajt a;
      private final String b;
      private final boolean c;
      private final ajt d;
      private final ajt e;

      public a(ajt $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(ajt $$0) {
         this($$0, "", false);
      }

      private ajt b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public ajt a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
