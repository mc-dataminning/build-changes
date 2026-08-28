import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public record ctj(Map<cti.a, Integer> b, jn<awd> c, Predicate<cvp> d, List<ctj.a> e, float f, float g) {
   public static final Codec<jn<ctj>> a = lu.ao.r();

   public int a(cti.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<cti.a, Integer> a() {
      return this.b;
   }

   public jn<awd> b() {
      return this.c;
   }

   public Predicate<cvp> c() {
      return this.d;
   }

   public List<ctj.a> d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public static final class a {
      private final alc a;
      private final String b;
      private final boolean c;
      private final alc d;
      private final alc e;

      public a(alc $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(alc $$0) {
         this($$0, "", false);
      }

      private alc b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public alc a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
