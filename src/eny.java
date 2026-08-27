import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import java.util.List;

public class eny extends enn {
   public static final Codec<eny> a = a(eny::new);

   eny(List<enu> $$0, List<eqc> $$1) {
      super($$0, $$1);
   }

   @Override
   public env a() {
      return ens.h;
   }

   @Override
   protected enm a(List<? extends enm> $$0) {
      return switch ($$0.size()) {
         case 0 -> c;
         case 1 -> (enm)$$0.get(0);
         case 2 -> $$0.get(0).and($$0.get(1));
         default -> ($$1, $$2) -> {
         for (enm $$3 : $$0) {
            if (!$$3.expand($$1, $$2)) {
               return false;
            }
         }

         return true;
      };
      };
   }

   public static eny.a a(enu.a<?>... $$0) {
      return new eny.a($$0);
   }

   public static class a extends enu.a<eny.a> {
      private final Builder<enu> a = ImmutableList.builder();

      public a(enu.a<?>... $$0) {
         for (enu.a<?> $$1 : $$0) {
            this.a.add($$1.b());
         }
      }

      protected eny.a a() {
         return this;
      }

      @Override
      public eny.a c(enu.a<?> $$0) {
         this.a.add($$0.b());
         return this;
      }

      @Override
      public enu b() {
         return new eny(this.a.build(), this.f());
      }
   }
}
