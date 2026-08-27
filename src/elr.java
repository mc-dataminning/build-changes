import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class elr extends elg {
   public static final Codec<elr> a = a(elr::new);

   elr(List<eln> $$0, List<ent> $$1) {
      super($$0, $$1);
   }

   @Override
   public elo a() {
      return ell.h;
   }

   @Override
   protected elf a(List<? extends elf> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (elf)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (elf $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static elr.a a(eln.a<?>... $$0) {
      return new elr.a($$0);
   }

   public static class a extends eln.a<elr.a> {
      private final Builder<eln> a = ImmutableList.builder();

      public a(eln.a<?>... $$0) {
         for (eln.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected elr.a a() {
         return this;
      }

      @Override
      public elr.a c(eln.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public eln b() {
         return new elr(this.a.build(), this.f());
      }
   }
}
