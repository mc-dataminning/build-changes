import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class ce implements de<cxu> {
   private final List<bm> a;

   protected ce(List<bm> $$0) {
      this.a = $$0;
   }

   public static <T extends ce> Codec<T> a(Function<List<bm>, T> $$0) {
      return bm.a.listOf().xmap($$0, ce::b);
   }

   protected List<bm> b() {
      return this.a;
   }

   public boolean a(csd $$0, cxu $$1) {
      for (bm $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static ce.a a(List<bm> $$0) {
      return new ce.a($$0);
   }

   public static ce.b b(List<bm> $$0) {
      return new ce.b($$0);
   }

   public static class a extends ce {
      public static final Codec<ce.a> a = a(ce.a::new);

      protected a(List<bm> $$0) {
         super($$0);
      }

      @Override
      public jy<cxu> a() {
         return jz.f;
      }
   }

   public static class b extends ce {
      public static final Codec<ce.b> a = a(ce.b::new);

      protected b(List<bm> $$0) {
         super($$0);
      }

      @Override
      public jy<cxu> a() {
         return jz.p;
      }
   }
}
