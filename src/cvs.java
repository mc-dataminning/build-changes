import com.mojang.serialization.Codec;

public interface cvs<C extends bny> {
   Codec<cvs<?>> h = kt.t.q().dispatch(cvs::ao_, cvw::a);
   yg<vt, cvs<?>> i = ye.a(ku.Z).b(cvs::ao_, cvw::b);

   boolean a(C var1, czg var2);

   crs a(C var1, jb var2);

   boolean a(int var1, int var2);

   crs a(jb var1);

   default iw<crs> a(C $$0) {
      iw<crs> $$1 = iw.a($$0.b(), crs.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         crn $$3 = $$0.a($$2).f();
         if ($$3.w()) {
            $$1.set($$2, new crs($$3.v()));
         }
      }

      return $$1;
   }

   default iw<cvp> a() {
      return iw.a();
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

   default crs g() {
      return new crs(dcj.cA);
   }

   cvw<?> ao_();

   cvx<?> e();

   default boolean i() {
      iw<cvp> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
