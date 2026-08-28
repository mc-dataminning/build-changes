import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class exx extends exu {
   public static final MapCodec<exx> a = a(exx::new);

   exx(List<eyb> $$0, List<fau> $$1) {
      super($$0, $$1);
   }

   @Override
   public eyc a() {
      return exz.i;
   }

   @Override
   protected ext a(List<? extends ext> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (ext)$$0.get(0);
         case 2 -> {
            ext $$1 = $$0.get(0);
            ext $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (ext $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static exx.a a(eyb.a<?>... $$0) {
      return new exx.a($$0);
   }

   public static class a extends eyb.a<exx.a> {
      private final Builder<eyb> a = ImmutableList.builder();

      public a(eyb.a<?>... $$0) {
         for (eyb.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected exx.a a() {
         return this;
      }

      @Override
      public exx.a b(eyb.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eyb b() {
         return new exx(this.a.build(), this.f());
      }
   }
}
