import com.mojang.serialization.Codec;

public interface cyg<T extends cyj> {
   Codec<cyg<?>> h = lq.r.r().dispatch(cyg::ap_, cyl::a);
   ys<wf, cyg<?>> i = yq.a(lr.ad).b(cyg::ap_, cyl::b);

   boolean a(T var1, dcd var2);

   cua a(T var1, jl.a var2);

   boolean a(int var1, int var2);

   cua a(jl.a var1);

   default js<cua> a(T $$0) {
      js<cua> $$1 = js.a($$0.a(), cua.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ctv $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cua($$3.u()));
         }
      }

      return $$1;
   }

   default js<cyd> a() {
      return js.a();
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

   default cua g() {
      return new cua(dfh.cA);
   }

   cyl<?> ap_();

   cym<?> e();

   default boolean i() {
      js<cyd> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
