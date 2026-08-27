import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class cf implements dg<czg> {
   private final List<bm> a;

   protected cf(List<bm> $$0) {
      this.a = $$0;
   }

   public static <T extends cf> Codec<T> a(Function<List<bm>, T> $$0) {
      return bm.a.listOf().xmap($$0, cf::b);
   }

   protected List<bm> b() {
      return this.a;
   }

   public boolean a(ctq $$0, czg $$1) {
      for (bm $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static cf.a a(List<bm> $$0) {
      return new cf.a($$0);
   }

   public static cf.b b(List<bm> $$0) {
      return new cf.b($$0);
   }

   public static class a extends cf {
      public static final Codec<cf.a> a = a(cf.a::new);

      protected a(List<bm> $$0) {
         super($$0);
      }

      @Override
      public ka<czg> a() {
         return kb.j;
      }
   }

   public static class b extends cf {
      public static final Codec<cf.b> a = a(cf.b::new);

      protected b(List<bm> $$0) {
         super($$0);
      }

      @Override
      public ka<czg> a() {
         return kb.x;
      }
   }
}
