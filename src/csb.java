import javax.annotation.Nullable;

public interface csb {
   bro k();

   default iw<avb> ap_() {
      return avc.as;
   }

   default bpn<csz> a(csu $$0, dad $$1, clh $$2, bpl $$3) {
      csz $$4 = $$2.b($$3);
      bro $$5 = bsc.h($$4);
      if (!$$2.c($$5)) {
         return bpn.c($$4);
      } else {
         csz $$6 = $$2.d($$5);
         if ((!cyh.f($$6) || $$2.f()) && !csz.a($$4, $$6)) {
            if (!$$1.x_()) {
               $$2.b(avm.c.b($$0));
            }

            csz $$7 = $$6.d() ? $$4 : $$6.e();
            csz $$8 = $$2.f() ? $$4.r() : $$4.e();
            $$2.a($$5, $$8);
            return bpn.a($$7, $$1.x_());
         } else {
            return bpn.d($$4);
         }
      }
   }

   @Nullable
   static csb c_(csz $$0) {
      csu $$3 = $$0.f();
      if ($$3 instanceof csb) {
         return (csb)$$3;
      } else {
         if ($$0.f() instanceof cqx $$2) {
            dde var6 = $$2.d();
            if (var6 instanceof csb) {
               return (csb)var6;
            }
         }

         return null;
      }
   }
}
