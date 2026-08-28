import com.mojang.serialization.Codec;

public interface dba<T extends dbd> {
   Codec<dba<?>> h = lz.r.q().dispatch(dba::ap_, dbf::a);
   zh<wu, dba<?>> i = zf.a(ma.ae).b(dba::ap_, dbf::b);

   boolean a(T var1, dfm var2);

   cwm a(T var1, js.a var2);

   boolean a(int var1, int var2);

   cwm a(js.a var1);

   default jz<cwm> a(T $$0) {
      jz<cwm> $$1 = jz.a($$0.a(), cwm.k);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cwi $$3 = $$0.a($$2).h();
         if ($$3.l()) {
            $$1.set($$2, new cwm($$3.k()));
         }
      }

      return $$1;
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

   default cwm g() {
      return new cwm(dis.cA);
   }

   dbf<?> ap_();

   dbg<?> e();

   daz a();
}
