import com.mojang.serialization.Codec;

public interface cwg<C extends boj> {
   Codec<cwg<?>> h = lc.t.q().dispatch(cwg::ao_, cwk::a);
   yq<wd, cwg<?>> i = yo.a(ld.Z).b(cwg::ao_, cwk::b);

   boolean a(C var1, czu var2);

   csd a(C var1, jj var2);

   boolean a(int var1, int var2);

   csd a(jj var1);

   default je<csd> a(C $$0) {
      je<csd> $$1 = je.a($$0.b(), csd.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cry $$3 = $$0.a($$2).f();
         if ($$3.w()) {
            $$1.set($$2, new csd($$3.v()));
         }
      }

      return $$1;
   }

   default je<cwd> a() {
      return je.a();
   }

   default boolean an_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default csd g() {
      return new csd(dcx.cA);
   }

   cwk<?> ao_();

   cwl<?> e();

   default boolean i() {
      je<cwd> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
