import com.mojang.serialization.Codec;

public interface ctn<C extends bmv> {
   Codec<ctn<?>> h = ki.t.q().dispatch(ctn::ar_, ctr::a);
   xs<vf, ctn<?>> i = xq.a(kj.Y).b(ctn::ar_, ctr::b);

   boolean a(C var1, cwz var2);

   cqk a(C var1, iz var2);

   boolean a(int var1, int var2);

   cqk a(iz var1);

   default iu<cqk> a(C $$0) {
      iu<cqk> $$1 = iu.a($$0.b(), cqk.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cqf $$3 = $$0.a($$2).d();
         if ($$3.u()) {
            $$1.set($$2, new cqk($$3.t()));
         }
      }

      return $$1;
   }

   default iu<ctk> a() {
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

   default cqk g() {
      return new cqk(dac.cA);
   }

   ctr<?> ar_();

   cts<?> e();

   default boolean i() {
      iu<ctk> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
