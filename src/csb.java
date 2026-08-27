import com.mojang.serialization.Codec;

public interface csb<C extends bln> {
   Codec<csb<?>> h = kf.t.q().dispatch(csb::at_, csf::a);
   xo<vb, csb<?>> i = xm.a(kg.Y).b(csb::at_, csf::b);

   boolean a(C var1, cvn var2);

   coz a(C var1, iw var2);

   boolean a(int var1, int var2);

   coz a(iw var1);

   default is<coz> a(C $$0) {
      is<coz> $$1 = is.a($$0.b(), coz.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cou $$3 = $$0.a($$2).d();
         if ($$3.s()) {
            $$1.set($$2, new coz($$3.r()));
         }
      }

      return $$1;
   }

   default is<cry> a() {
      return is.a();
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

   default coz g() {
      return new coz(cyq.cA);
   }

   csf<?> at_();

   csg<?> e();

   default boolean i() {
      is<cry> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
