import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class co implements dy<dbs> {
   private final List<bq> a;

   protected co(List<bq> $$0) {
      this.a = $$0;
   }

   public static <T extends co> Codec<T> a(Function<List<bq>, T> $$0) {
      return bq.a.listOf().xmap($$0, co::b);
   }

   protected List<bq> b() {
      return this.a;
   }

   public boolean a(cvx $$0, dbs $$1) {
      for (bq $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static co.a a(List<bq> $$0) {
      return new co.a($$0);
   }

   public static co.b b(List<bq> $$0) {
      return new co.b($$0);
   }

   public static class a extends co {
      public static final Codec<co.a> a = a(co.a::new);

      protected a(List<bq> $$0) {
         super($$0);
      }

      @Override
      public ks<dbs> a() {
         return kt.l;
      }
   }

   public static class b extends co {
      public static final Codec<co.b> a = a(co.b::new);

      protected b(List<bq> $$0) {
         super($$0);
      }

      @Override
      public ks<dbs> a() {
         return kt.H;
      }
   }
}
