import com.mojang.serialization.Codec;

public interface dne<T extends dnd> {
   dne<dmv> a = a("block", new dmv.a());
   dne<dmx> b = a("entity", new dmx.a());

   T b(ue var1);

   void a(ue var1, T var2);

   Codec<T> a();

   static <S extends dne<T>, T extends dnd> S a(String $$0, S $$1) {
      return ir.a(kb.v, $$0, $$1);
   }

   static dnd c(ue $$0) {
      dne<?> $$1 = $$0.a(kb.v);
      if ($$1 == null) {
         throw new IllegalArgumentException("Unknown position source type");
      } else {
         return $$1.b($$0);
      }
   }

   static <T extends dnd> void a(T $$0, ue $$1) {
      $$1.a(kb.v, $$0.a());
      ((dne<T>)$$0.a()).a($$1, $$0);
   }
}
