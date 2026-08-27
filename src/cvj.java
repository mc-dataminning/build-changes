import com.mojang.serialization.Codec;

public interface cvj<C extends bnt> {
   Codec<cvj<?>> h = kr.t.q().dispatch(cvj::ap_, cvn::a);
   ye<vr, cvj<?>> i = yc.a(ks.Y).b(cvj::ap_, cvn::b);

   boolean a(C var1, cyx var2);

   crj a(C var1, iz var2);

   boolean a(int var1, int var2);

   crj a(iz var1);

   default iu<crj> a(C $$0) {
      iu<crj> $$1 = iu.a($$0.b(), crj.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cre $$3 = $$0.a($$2).f();
         if ($$3.w()) {
            $$1.set($$2, new crj($$3.v()));
         }
      }

      return $$1;
   }

   default iu<cvg> a() {
      return iu.a();
   }

   default boolean ao_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default crj g() {
      return new crj(dca.cA);
   }

   cvn<?> ap_();

   cvo<?> e();

   default boolean i() {
      iu<cvg> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
