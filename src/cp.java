import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class cp implements dz<def> {
   private final List<br> a;

   protected cp(List<br> $$0) {
      this.a = $$0;
   }

   public static <T extends cp> Codec<T> a(Function<List<br>, T> $$0) {
      return br.a.listOf().xmap($$0, cp::b);
   }

   protected List<br> b() {
      return this.a;
   }

   public boolean a(cxp $$0, def $$1) {
      for (br $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static cp.a a(List<br> $$0) {
      return new cp.a($$0);
   }

   public static cp.b b(List<br> $$0) {
      return new cp.b($$0);
   }

   public static class a extends cp {
      public static final Codec<cp.a> a = a(cp.a::new);

      protected a(List<br> $$0) {
         super($$0);
      }

      @Override
      public kt<def> a() {
         return ku.l;
      }
   }

   public static class b extends cp {
      public static final Codec<cp.b> a = a(cp.b::new);

      protected b(List<br> $$0) {
         super($$0);
      }

      @Override
      public kt<def> a() {
         return ku.I;
      }
   }
}
