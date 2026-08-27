import com.mojang.serialization.Codec;

public interface cpl<C extends bje> {
   Codec<cpl<?>> h = kb.t.q().dispatch(cpl::ar_, cpp::a);

   boolean a(C var1, csy var2);

   cmh a(C var1, is var2);

   boolean a(int var1, int var2);

   cmh a(is var1);

   default io<cmh> a(C $$0) {
      io<cmh> $$1 = io.a($$0.b(), cmh.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmc $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cmh($$3.s()));
         }
      }

      return $$1;
   }

   default io<cpi> a() {
      return io.a();
   }

   default boolean aq_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cmh g() {
      return new cmh(cwb.cA);
   }

   cpp<?> ar_();

   cpq<?> e();

   default boolean i() {
      io<cpi> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
