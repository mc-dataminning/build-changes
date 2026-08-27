import com.mojang.serialization.Codec;

public interface cxu<C extends bpn> {
   Codec<cxu<?>> h = le.t.q().dispatch(cxu::ao_, cxy::a);
   yv<wi, cxu<?>> i = yt.a(lf.Z).b(cxu::ao_, cxy::b);

   boolean a(C var1, dax var2);

   cto a(C var1, iz.a var2);

   boolean a(int var1, int var2);

   cto a(iz.a var1);

   default jg<cto> a(C $$0) {
      jg<cto> $$1 = jg.a($$0.b(), cto.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ctj $$3 = $$0.a($$2).g();
         if ($$3.u()) {
            $$1.set($$2, new cto($$3.t()));
         }
      }

      return $$1;
   }

   default jg<cxr> a() {
      return jg.a();
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

   default cto g() {
      return new cto(dea.cA);
   }

   cxy<?> ao_();

   cxz<?> e();

   default boolean i() {
      jg<cxr> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
