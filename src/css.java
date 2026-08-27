import javax.annotation.Nullable;

public interface css {
   bsd m();

   default ix<avh> aq_() {
      return avi.as;
   }

   default bpx<ctq> a(ctl $$0, daz $$1, cly $$2, bpv $$3) {
      ctq $$4 = $$2.b($$3);
      bsd $$5 = bss.h($$4);
      if (!$$2.d($$5)) {
         return bpx.c($$4);
      } else {
         ctq $$6 = $$2.a($$5);
         if ((!czc.f($$6) || $$2.f()) && !ctq.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avs.c.b($$0));
            }

            ctq $$7 = $$6.e() ? $$4 : $$6.f();
            ctq $$8 = $$2.f() ? $$4.s() : $$4.f();
            $$2.a($$5, $$8);
            return bpx.a($$7, $$1.x_());
         } else {
            return bpx.d($$4);
         }
      }
   }

   @Nullable
   static css c_(ctq $$0) {
      ctl $$3 = $$0.g();
      if ($$3 instanceof css) {
         return (css)$$3;
      } else {
         if ($$0.g() instanceof cro $$2) {
            dea var6 = $$2.d();
            if (var6 instanceof css) {
               return (css)var6;
            }
         }

         return null;
      }
   }
}
