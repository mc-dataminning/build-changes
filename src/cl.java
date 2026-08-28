import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class cl implements ds<dae> {
   private final List<bp> a;

   protected cl(List<bp> $$0) {
      this.a = $$0;
   }

   public static <T extends cl> Codec<T> a(Function<List<bp>, T> $$0) {
      return bp.a.listOf().xmap($$0, cl::b);
   }

   protected List<bp> b() {
      return this.a;
   }

   public boolean a(cuo $$0, dae $$1) {
      for (bp $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static cl.a a(List<bp> $$0) {
      return new cl.a($$0);
   }

   public static cl.b b(List<bp> $$0) {
      return new cl.b($$0);
   }

   public static class a extends cl {
      public static final Codec<cl.a> a = a(cl.a::new);

      protected a(List<bp> $$0) {
         super($$0);
      }

      @Override
      public kl<dae> a() {
         return km.k;
      }
   }

   public static class b extends cl {
      public static final Codec<cl.b> a = a(cl.b::new);

      protected b(List<bp> $$0) {
         super($$0);
      }

      @Override
      public kl<dae> a() {
         return km.y;
      }
   }
}
