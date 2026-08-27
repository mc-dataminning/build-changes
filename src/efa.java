import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class efa extends eex {
   public static final Codec<efa> a = a(efa::new);

   efa(List<efe> $$0, List<ehk> $$1) {
      super($$0, $$1);
   }

   @Override
   public eff a() {
      return efc.i;
   }

   @Override
   protected eew a(List<? extends eew> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (eew)$$0.get(0);
         case 2 -> {
            eew $$1 = $$0.get(0);
            eew $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (eew $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static efa.a a(efe.a<?>... $$0) {
      return new efa.a($$0);
   }

   public static class a extends efe.a<efa.a> {
      private final Builder<efe> a = ImmutableList.builder();

      public a(efe.a<?>... $$0) {
         for (efe.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected efa.a a() {
         return this;
      }

      @Override
      public efa.a b(efe.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public efe b() {
         return new efa(this.a.build(), this.f());
      }
   }
}
