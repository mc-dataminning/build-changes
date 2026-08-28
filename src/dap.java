import com.mojang.serialization.Codec;

public interface dap<T extends das> {
   Codec<dap<?>> h = ly.r.q().dispatch(dap::aq_, dau::a);
   zg<wt, dap<?>> i = ze.a(lz.ae).b(dap::aq_, dau::b);

   boolean a(T var1, dfb var2);

   cwb a(T var1, js.a var2);

   boolean a(int var1, int var2);

   cwb a(js.a var1);

   default jz<cwb> a(T $$0) {
      jz<cwb> $$1 = jz.a($$0.a(), cwb.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cvx $$3 = $$0.a($$2).h();
         if ($$3.l()) {
            $$1.set($$2, new cwb($$3.k()));
         }
      }

      return $$1;
   }

   default boolean ap_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cwb g() {
      return new cwb(dig.cA);
   }

   dau<?> aq_();

   dav<?> e();

   dao a();
}
