import com.mojang.serialization.Codec;

public interface cyj<T extends cym> {
   Codec<cyj<?>> h = lq.r.r().dispatch(cyj::ap_, cyo::a);
   ys<wf, cyj<?>> i = yq.a(lr.ad).b(cyj::ap_, cyo::b);

   boolean a(T var1, dcg var2);

   cud a(T var1, jl.a var2);

   boolean a(int var1, int var2);

   cud a(jl.a var1);

   default js<cud> a(T $$0) {
      js<cud> $$1 = js.a($$0.a(), cud.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cty $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cud($$3.u()));
         }
      }

      return $$1;
   }

   default js<cyg> a() {
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

   default cud g() {
      return new cud(dfk.cA);
   }

   cyo<?> ap_();

   cyp<?> e();

   default boolean i() {
      js<cyg> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
