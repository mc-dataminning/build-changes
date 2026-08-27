import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cpi(Map<cph.a, Integer> b, int c, in<aun> d, Supplier<cvp> e, List<cpi.a> f, float g, float h) {
   public static final Codec<in<cpi>> a = kt.ar.r();

   public int a(cph.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<cph.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public in<aun> c() {
      return this.d;
   }

   public Supplier<cvp> d() {
      return this.e;
   }

   public List<cpi.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final ajv a;
      private final String b;
      private final boolean c;
      private final ajv d;
      private final ajv e;

      public a(ajv $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(ajv $$0) {
         this($$0, "", false);
      }

      private ajv b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public ajv a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
