import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cak extends cbf {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cak(btt $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected evm h() {
      float $$0 = this.b.dP().z.i();
      if (this.b.dP().z.i() < 0.3F) {
         return this.k();
      } else {
         evm $$1;
         if ($$0 < 0.7F) {
            $$1 = this.l();
            if ($$1 == null) {
               $$1 = this.m();
            }
         } else {
            $$1 = this.m();
            if ($$1 == null) {
               $$1 = this.l();
            }
         }

         return $$1 == null ? this.k() : $$1;
      }
   }

   @Nullable
   private evm k() {
      return cei.a(this.b, 10, 7);
   }

   @Nullable
   private evm l() {
      arb $$0 = (arb)this.b.dP();
      List<cmf> $$1 = $$0.a(bsv.bj, this.b.cK().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cmf $$2 = $$1.get(this.b.dP().z.a($$1.size()));
         evm $$3 = $$2.dn();
         return cei.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private evm m() {
      kb $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iz $$1 = this.a($$0);
         return $$1 == null ? null : cei.a(this.b, 10, 7, evm.c($$1));
      }
   }

   @Nullable
   private kb n() {
      arb $$0 = (arb)this.b.dP();
      List<kb> $$1 = kb.a(kb.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private iz a(kb $$0) {
      arb $$1 = (arb)this.b.dP();
      ceo $$2 = $$1.y();
      List<iz> $$3 = $$2.c($$0x -> true, $$0.q(), 8, ceo.b.b).map(cep::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cmf $$0) {
      return $$0.a(this.b.dP().Z());
   }
}
