import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cqp(Map<cqo.a, Integer> b, int c, iw<avb> d, Supplier<cxa> e, List<cqp.a> f, float g, float h) {
   public static final Codec<iw<cqp>> a = ld.ar.r();

   public int a(cqo.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<cqo.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public iw<avb> c() {
      return this.d;
   }

   public Supplier<cxa> d() {
      return this.e;
   }

   public List<cqp.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final akh a;
      private final String b;
      private final boolean c;
      private final akh d;
      private final akh e;

      public a(akh $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(akh $$0) {
         this($$0, "", false);
      }

      private akh b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public akh a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
