import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public record cnz(Map<cny.a, Integer> b, int c, il<atx> d, Supplier<ctm> e, List<cnz.a> f, float g, float h) {
   public static final Codec<il<cnz>> a = ki.as.r();

   public int a(cny.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<cny.a, Integer> a() {
      return this.b;
   }

   public int b() {
      return this.c;
   }

   public il<atx> c() {
      return this.d;
   }

   public Supplier<ctm> d() {
      return this.e;
   }

   public List<cnz.a> e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public float g() {
      return this.h;
   }

   public static final class a {
      private final ajh a;
      private final String b;
      private final boolean c;
      private final ajh d;
      private final ajh e;

      public a(ajh $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(ajh $$0) {
         this($$0, "", false);
      }

      private ajh b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public ajh a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
