import com.mojang.serialization.Codec;

public interface cyz<T extends czc> {
   Codec<cyz<?>> h = lt.r.r().dispatch(cyz::at_, cze::a);
   yx<wk, cyz<?>> i = yv.a(lu.ae).b(cyz::at_, cze::b);

   boolean a(T var1, dcw var2);

   cuq a(T var1, jo.a var2);

   boolean a(int var1, int var2);

   cuq a(jo.a var1);

   default jv<cuq> a(T $$0) {
      jv<cuq> $$1 = jv.a($$0.a(), cuq.l);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cul $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new cuq($$3.u()));
         }
      }

      return $$1;
   }

   default jv<cyw> a() {
      return jv.a();
   }

   default boolean as_() {
      return false;
   }

   default boolean h() {
      return true;
   }

   default String c() {
      return "";
   }

   default cuq g() {
      return new cuq(dga.cA);
   }

   cze<?> at_();

   czf<?> e();

   default boolean i() {
      jv<cyw> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
