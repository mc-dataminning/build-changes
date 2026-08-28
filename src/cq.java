import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Function;

public abstract class cq implements ea<ddf> {
   private final List<bs> a;

   protected cq(List<bs> $$0) {
      this.a = $$0;
   }

   public static <T extends cq> Codec<T> a(Function<List<bs>, T> $$0) {
      return bs.a.listOf().xmap($$0, cq::b);
   }

   protected List<bs> b() {
      return this.a;
   }

   public boolean a(cwp $$0, ddf $$1) {
      for (bs $$2 : this.a) {
         if (!$$2.a($$1)) {
            return false;
         }
      }

      return true;
   }

   public static cq.a a(List<bs> $$0) {
      return new cq.a($$0);
   }

   public static cq.b b(List<bs> $$0) {
      return new cq.b($$0);
   }

   public static class a extends cq {
      public static final Codec<cq.a> a = a(cq.a::new);

      protected a(List<bs> $$0) {
         super($$0);
      }

      @Override
      public ku<ddf> a() {
         return kv.l;
      }
   }

   public static class b extends cq {
      public static final Codec<cq.b> a = a(cq.b::new);

      protected b(List<bs> $$0) {
         super($$0);
      }

      @Override
      public ku<ddf> a() {
         return kv.I;
      }
   }
}
