import com.mojang.serialization.Codec;

public interface cqb<C extends bjt> {
   Codec<cqb<?>> h = kd.t.q().dispatch(cqb::ar_, cqf::a);

   boolean a(C var1, cto var2);

   cmx a(C var1, iu var2);

   boolean a(int var1, int var2);

   cmx a(iu var1);

   default iq<cmx> a(C $$0) {
      iq<cmx> $$1 = iq.a($$0.b(), cmx.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cms $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cmx($$3.s()));
         }
      }

      return $$1;
   }

   default iq<cpy> a() {
      return iq.a();
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

   default cmx g() {
      return new cmx(cwr.cA);
   }

   cqf<?> ar_();

   cqg<?> e();

   default boolean i() {
      iq<cpy> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
