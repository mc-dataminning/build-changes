import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record csg(Map<csf.a, Integer> b, int c, ji<avz> d, Supplier<cyt> e, List<csg.a> f, float g, float h) {
   public static final Codec<ji<csg>> a = lp.ar.r();

   public int a(csf.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<csf.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public ji<avz> c() {
      return this.d;
   }

   public Supplier<cyt> d() {
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
      private final alf a;
      private final String b;
      private final boolean c;
      private final alf d;
      private final alf e;

      public a(alf $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(alf $$0) {
         this($$0, "", false);
      }

      private alf b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public alf a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
