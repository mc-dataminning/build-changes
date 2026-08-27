import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cpt(Map<cps.a, Integer> b, int c, iv<auy> d, Supplier<cwd> e, List<cpt.a> f, float g, float h) {
   public static final Codec<iv<cpt>> a = lc.ar.r();

   public int a(cps.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<cps.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public iv<auy> c() {
      return this.d;
   }

   public Supplier<cwd> d() {
      return this.e;
   }

   public List<cpt.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final akf a;
      private final String b;
      private final boolean c;
      private final akf d;
      private final akf e;

      public a(akf $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(akf $$0) {
         this($$0, "", false);
      }

      private akf b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public akf a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
