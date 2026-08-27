import com.mojang.serialization.Codec;

public interface cxd<C extends bpf> {
   Codec<cxd<?>> h = ld.t.q().dispatch(cxd::ao_, cxh::a);
   ys<wf, cxd<?>> i = yq.a(le.Z).b(cxd::ao_, cxh::b);

   boolean a(C var1, dad var2);

   csz a(C var1, iy.a var2);

   boolean a(int var1, int var2);

   csz a(iy.a var1);

   default jf<csz> a(C $$0) {
      jf<csz> $$1 = jf.a($$0.b(), csz.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         csu $$3 = $$0.a($$2).f();
         if ($$3.u()) {
            $$1.set($$2, new csz($$3.t()));
         }
      }

      return $$1;
   }

   default jf<cxa> a() {
      return jf.a();
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

   default csz g() {
      return new csz(ddg.cA);
   }

   cxh<?> ao_();

   cxi<?> e();

   default boolean i() {
      jf<cxa> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
