import com.mojang.serialization.Codec;

public interface cxw<C extends bpp> {
   Codec<cxw<?>> h = le.t.q().dispatch(cxw::ap_, cya::a);
   yv<wi, cxw<?>> i = yt.a(lf.Z).b(cxw::ap_, cya::b);

   boolean a(C var1, daz var2);

   ctq a(C var1, iz.a var2);

   boolean a(int var1, int var2);

   ctq a(iz.a var1);

   default jg<ctq> a(C $$0) {
      jg<ctq> $$1 = jg.a($$0.b(), ctq.i);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         ctl $$3 = $$0.a($$2).g();
         if ($$3.v()) {
            $$1.set($$2, new ctq($$3.u()));
         }
      }

      return $$1;
   }

   default jg<cxt> a() {
      return jg.a();
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

   default ctq g() {
      return new ctq(dec.cA);
   }

   cya<?> ap_();

   cyb<?> e();

   default boolean i() {
      jg<cxt> $$0 = this.a();
      return $$0.isEmpty() || $$0.stream().anyMatch($$0x -> $$0x.a().length == 0);
   }
}
