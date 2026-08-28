import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class caq extends cbl {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public caq(btz $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected evs h() {
      float $$0 = this.b.dP().z.i();
      if (this.b.dP().z.i() < 0.3F) {
         return this.k();
      } else {
         evs $$1;
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
   private evs k() {
      return ceo.a(this.b, 10, 7);
   }

   @Nullable
   private evs l() {
      arf $$0 = (arf)this.b.dP();
      List<cml> $$1 = $$0.a(btb.bj, this.b.cK().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cml $$2 = $$1.get(this.b.dP().z.a($$1.size()));
         evs $$3 = $$2.dn();
         return ceo.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private evs m() {
      kb $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iz $$1 = this.a($$0);
         return $$1 == null ? null : ceo.a(this.b, 10, 7, evs.c($$1));
      }
   }

   @Nullable
   private kb n() {
      arf $$0 = (arf)this.b.dP();
      List<kb> $$1 = kb.a(kb.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private iz a(kb $$0) {
      arf $$1 = (arf)this.b.dP();
      ceu $$2 = $$1.y();
      List<iz> $$3 = $$2.c($$0x -> true, $$0.q(), 8, ceu.b.b).map(cev::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cml $$0) {
      return $$0.a(this.b.dP().Z());
   }
}
