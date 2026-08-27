import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class ehe extends ehb {
   public static final Codec<ehe> a = a(ehe::new);

   ehe(List<ehi> $$0, List<ejo> $$1) {
      super($$0, $$1);
   }

   @Override
   public ehj a() {
      return ehg.i;
   }

   @Override
   protected eha a(List<? extends eha> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eha)$$0.get(0);
         case 2 -> {
            eha $$1 = $$0.get(0);
            eha $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eha $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static ehe.a a(ehi.a<?>... $$0) {
      return new ehe.a($$0);
   }

   public static class a extends ehi.a<ehe.a> {
      private final Builder<ehi> a = ImmutableList.builder();

      public a(ehi.a<?>... $$0) {
         for (ehi.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected ehe.a a() {
         return this;
      }

      @Override
      public ehe.a b(ehi.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public ehi b() {
         return new ehe(this.a.build(), this.f());
      }
   }
}
