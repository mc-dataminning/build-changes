import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record csg(Map<csf.a, Integer> b, int c, jm<avo> d, Supplier<cyw> e, List<csg.a> f, float g, float h) {
   public static final Codec<jm<csg>> a = lt.ap.s();

   public int a(csf.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<csf.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public jm<avo> c() {
      return this.d;
   }

   public Supplier<cyw> d() {
      return this.e;
   }

   public List<csg.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final akr a;
      private final String b;
      private final boolean c;
      private final akr d;
      private final akr e;

      public a(akr $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(akr $$0) {
         this($$0, "", false);
      }

      private akr b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public akr a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
