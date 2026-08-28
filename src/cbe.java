import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cbe extends cbz {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cbe(bun $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eye h() {
      float $$0 = this.b.dS().z.i();
      if (this.b.dS().z.i() < 0.3F) {
         return this.k();
      } else {
         eye $$1;
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
   private eye k() {
      return cfc.a(this.b, 10, 7);
   }

   @Nullable
   private eye l() {
      arg $$0 = (arg)this.b.dS();
      List<cnc> $$1 = $$0.a(btq.bj, this.b.cO().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cnc $$2 = $$1.get(this.b.dS().z.a($$1.size()));
         eye $$3 = $$2.dq();
         return cfc.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eye m() {
      kg $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         je $$1 = this.a($$0);
         return $$1 == null ? null : cfc.a(this.b, 10, 7, eye.c($$1));
      }
   }

   @Nullable
   private kg n() {
      arg $$0 = (arg)this.b.dS();
      List<kg> $$1 = kg.a(kg.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private je a(kg $$0) {
      arg $$1 = (arg)this.b.dS();
      cfi $$2 = $$1.y();
      List<je> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cfi.b.b).map(cfj::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cnc $$0) {
      return $$0.a(this.b.dS().aa());
   }
}
