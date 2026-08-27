import com.mojang.serialization.Codec;

public interface ctp<C extends bmw> {
   Codec<ctp<?>> h = ki.t.q().dispatch(ctp::ar_, ctt::a);
   xs<vf, ctp<?>> i = xq.a(kj.Y).b(ctp::ar_, ctt::b);

   boolean a(C var1, cxb var2);

   cqm a(C var1, iz var2);

   boolean a(int var1, int var2);

   cqm a(iz var1);

   default iu<cqm> a(C $$0) {
      iu<cqm> $$1 = iu.a($$0.b(), cqm.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cqh $$3 = $$0.a($$2).d();
         if ($$3.u()) {
            $$1.set($$2, new cqm($$3.t()));
         }
      }

      return $$1;
   }

   default iu<ctm> a() {
      return iu.a();
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

   default cqm g() {
      return new cqm(dae.cA);
   }

   ctt<?> ar_();

   ctu<?> e();

   default boolean i() {
      iu<ctm> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
