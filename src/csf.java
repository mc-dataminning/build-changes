import com.mojang.serialization.Codec;

public interface csf<C extends blp> {
   Codec<csf<?>> h = kf.t.q().dispatch(csf::at_, csj::a);
   xo<vb, csf<?>> i = xm.a(kg.Y).b(csf::at_, csj::b);

   boolean a(C var1, cvr var2);

   cpd a(C var1, iw var2);

   boolean a(int var1, int var2);

   cpd a(iw var1);

   default is<cpd> a(C $$0) {
      is<cpd> $$1 = is.a($$0.b(), cpd.h);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         coy $$3 = $$0.a($$2).d();
         if ($$3.s()) {
            $$1.set($$2, new cpd($$3.r()));
         }
      }

      return $$1;
   }

   default is<csc> a() {
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

   default cpd g() {
      return new cpd(cyu.cA);
   }

   csj<?> at_();

   csk<?> e();

   default boolean i() {
      is<csc> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
