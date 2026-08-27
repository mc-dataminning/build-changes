import com.mojang.serialization.Codec;

public interface cqk<C extends bjv> {
   Codec<cqk<?>> h = kd.t.q().dispatch(cqk::at_, cqo::a);

   boolean a(C var1, ctx var2);

   cng a(C var1, iu var2);

   boolean a(int var1, int var2);

   cng a(iu var1);

   default iq<cng> a(C $$0) {
      iq<cng> $$1 = iq.a($$0.b(), cng.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cnb $$3 = $$0.a($$2).d();
         if ($$3.s()) {
            $$1.set($$2, new cng($$3.r()));
         }
      }

      return $$1;
   }

   default iq<cqh> a() {
      return iq.a();
   }

   default boolean as_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cng g() {
      return new cng(cxa.cA);
   }

   cqo<?> at_();

   cqp<?> e();

   default boolean i() {
      iq<cqh> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
