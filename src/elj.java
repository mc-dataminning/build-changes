import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class elj extends elg {
   public static final Codec<elj> a = a(elj::new);

   elj(List<eln> $$0, List<ent> $$1) {
      super($$0, $$1);
   }

   @Override
   public elo a() {
      return ell.i;
   }

   @Override
   protected elf a(List<? extends elf> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (elf)$$0.get(0);
         case 2 -> {
            elf $$1 = $$0.get(0);
            elf $$2 = $$0.get(1);
            yield ($$2x, $$3) -> {
               $$1.expand($$2x, $$3);
               $$2.expand($$2x, $$3);
               return true;
            };
         }
         default -> ($$1x, $$2x) -> {
         for (elf $$3 : $$0) {
            $$3.expand($$1x, $$2x);
         }

         return true;
      };
      };
   }

   public static elj.a a(eln.a<?>... $$0) {
      return new elj.a($$0);
   }

   public static class a extends eln.a<elj.a> {
      private final Builder<eln> a = ImmutableList.builder();

      public a(eln.a<?>... $$0) {
         for (eln.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected elj.a a() {
         return this;
      }

      @Override
      public elj.a b(eln.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eln b() {
         return new elj(this.a.build(), this.f());
      }
   }
}
