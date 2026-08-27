import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record crg(Map<crf.a, Integer> b, int c, ix<avh> d, Supplier<cxt> e, List<crg.a> f, float g, float h) {
   public static final Codec<ix<crg>> a = le.ar.r();

   public int a(crf.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<crf.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public ix<avh> c() {
      return this.d;
   }

   public Supplier<cxt> d() {
      return this.e;
   }

   public List<crg.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final akn a;
      private final String b;
      private final boolean c;
      private final akn d;
      private final akn e;

      public a(akn $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(akn $$0) {
         this($$0, "", false);
      }

      private akn b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public akn a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
