import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cbm extends cch {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cbm(buv $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eyw h() {
      float $$0 = this.b.dS().z.i();
      if (this.b.dS().z.i() < 0.3F) {
         return this.k();
      } else {
         eyw $$1;
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
   private eyw k() {
      return cfk.a(this.b, 10, 7);
   }

   @Nullable
   private eyw l() {
      arj $$0 = (arj)this.b.dS();
      List<cnk> $$1 = $$0.a(bty.bj, this.b.cO().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cnk $$2 = $$1.get(this.b.dS().z.a($$1.size()));
         eyw $$3 = $$2.dq();
         return cfk.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eyw m() {
      kh $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jf $$1 = this.a($$0);
         return $$1 == null ? null : cfk.a(this.b, 10, 7, eyw.c($$1));
      }
   }

   @Nullable
   private kh n() {
      arj $$0 = (arj)this.b.dS();
      List<kh> $$1 = kh.a(kh.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private jf a(kh $$0) {
      arj $$1 = (arj)this.b.dS();
      cfq $$2 = $$1.y();
      List<jf> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cfq.b.b).map(cfr::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cnk $$0) {
      return $$0.a(this.b.dS().aa());
   }
}
