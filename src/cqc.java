import com.mojang.serialization.Codec;

public interface cqc<C extends bju> {
   Codec<cqc<?>> h = kd.t.q().dispatch(cqc::ar_, cqg::a);

   boolean a(C var1, ctp var2);

   cmy a(C var1, iu var2);

   boolean a(int var1, int var2);

   cmy a(iu var1);

   default iq<cmy> a(C $$0) {
      iq<cmy> $$1 = iq.a($$0.b(), cmy.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmt $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cmy($$3.s()));
         }
      }

      return $$1;
   }

   default iq<cpz> a() {
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

   default cmy g() {
      return new cmy(cws.cA);
   }

   cqg<?> ar_();

   cqh<?> e();

   default boolean i() {
      iq<cpz> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
