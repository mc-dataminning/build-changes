import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public record ctm(Map<ctl.a, Integer> b, jo<awf> c, Predicate<cvs> d, List<ctm.a> e, float f, float g) {
   public static final Codec<jo<ctm>> a = lv.ao.r();

   public int a(ctl.a $$0) {
      return this.b.getOrDefault($$0, 0);
   }

   public Map<ctl.a, Integer> a() {
      return this.b;
   }

   public jo<awf> b() {
      return this.c;
   }

   public Predicate<cvs> c() {
      return this.d;
   }

   public List<ctm.a> d() {
      return this.e;
   }

   public float e() {
      return this.f;
   }

   public float f() {
      return this.g;
   }

   public static final class a {
      private final ale a;
      private final String b;
      private final boolean c;
      private final ale d;
      private final ale e;

      public a(ale $$0, String $$1, boolean $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = this.b(true);
         this.e = this.b(false);
      }

      public a(ale $$0) {
         this($$0, "", false);
      }

      private ale b(boolean $$0) {
         return this.a.a((UnaryOperator<String>)($$1 -> "textures/models/armor/" + this.a.a() + "_layer_" + ($$0 ? 2 : 1) + this.b + ".png"));
      }

      public ale a(boolean $$0) {
         return $$0 ? this.d : this.e;
      }

      public boolean a() {
         return this.c;
      }
   }
}
