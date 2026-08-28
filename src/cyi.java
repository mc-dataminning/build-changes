import com.mojang.serialization.Codec;

public interface cyi<T extends cyl> {
   Codec<cyi<?>> h = lq.r.r().dispatch(cyi::ap_, cyn::a);
   ys<wf, cyi<?>> i = yq.a(lr.ad).b(cyi::ap_, cyn::b);

   boolean a(T var1, dcf var2);

   cuc a(T var1, jl.a var2);

   boolean a(int var1, int var2);

   cuc a(jl.a var1);

   default js<cuc> a(T $$0) {
      js<cuc> $$1 = js.a($$0.a(), cuc.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ctx $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cuc($$3.u()));
         }
      }

      return $$1;
   }

   default js<cyf> a() {
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

   default cuc g() {
      return new cuc(dfj.cA);
   }

   cyn<?> ap_();

   cyo<?> e();

   default boolean i() {
      js<cyf> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
