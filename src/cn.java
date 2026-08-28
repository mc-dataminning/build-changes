import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class cn implements dw<dbc> {
   private final List<bq> a;

   protected cn(List<bq> $$0) {
      this.a = $$0;
   }

   public static <T extends cn> Codec<T> a(Function<List<bq>, T> $$0) {
      return bq.a.listOf().xmap($$0, cn::b);
   }

   protected List<bq> b() {
      return this.a;
   }

   public boolean a(cvl $$0, dbc $$1) {
      for (bq $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static cn.a a(List<bq> $$0) {
      return new cn.a($$0);
   }

   public static cn.b b(List<bq> $$0) {
      return new cn.b($$0);
   }

   public static class a extends cn {
      public static final Codec<cn.a> a = a(cn.a::new);

      protected a(List<bq> $$0) {
         super($$0);
      }

      @Override
      public kq<dbc> a() {
         return kr.k;
      }
   }

   public static class b extends cn {
      public static final Codec<cn.b> a = a(cn.b::new);

      protected b(List<bq> $$0) {
         super($$0);
      }

      @Override
      public kq<dbc> a() {
         return kr.A;
      }
   }
}
