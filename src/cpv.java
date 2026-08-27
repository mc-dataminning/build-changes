import com.mojang.serialization.Codec;

public interface cpv<C extends bjo> {
   Codec<cpv<?>> h = kd.t.q().dispatch(cpv::ar_, cpz::a);

   boolean a(C var1, cti var2);

   cmr a(C var1, iu var2);

   boolean a(int var1, int var2);

   cmr a(iu var1);

   default iq<cmr> a(C $$0) {
      iq<cmr> $$1 = iq.a($$0.b(), cmr.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmm $$3 = $$0.a($$2).d();
         if ($$3.t()) {
            $$1.set($$2, new cmr($$3.s()));
         }
      }

      return $$1;
   }

   default iq<cps> a() {
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

   default cmr g() {
      return new cmr(cwl.cA);
   }

   cpz<?> ar_();

   cqa<?> e();

   default boolean i() {
      iq<cps> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
