import javax.annotation.Nullable;

public class esi {
   @Nullable
   public static esm a(dev $$0, @Nullable jl $$1, @Nullable jl $$2) {
      if ($$0.J().b(crc.d)) {
         esm $$3 = esm.a($$0.A).a(esm.a.a);
         if ($$2 != null) {
            $$3 = $$3.a($$2);
         }

         if ($$1 != null) {
            $$3 = $$3.b($$1);
         }

         return $$3;
      } else {
         return null;
      }
   }

   @Nullable
   public static esm a(@Nullable esm $$0, jl $$1) {
      return $$0 == null ? null : $$0.b($$1);
   }
}
