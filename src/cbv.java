import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cbv extends ccq {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cbv(bvd $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ezh h() {
      float $$0 = this.b.dX().A.i();
      if (this.b.dX().A.i() < 0.3F) {
         return this.k();
      } else {
         ezh $$1;
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
   private ezh k() {
      return cft.a(this.b, 10, 7);
   }

   @Nullable
   private ezh l() {
      arm $$0 = (arm)this.b.dX();
      List<cnt> $$1 = $$0.a(bug.bj, this.b.cS().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cnt $$2 = $$1.get(this.b.dX().A.a($$1.size()));
         ezh $$3 = $$2.dv();
         return cft.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ezh m() {
      ki $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jg $$1 = this.a($$0);
         return $$1 == null ? null : cft.a(this.b, 10, 7, ezh.c($$1));
      }
   }

   @Nullable
   private ki n() {
      arm $$0 = (arm)this.b.dX();
      List<ki> $$1 = ki.a(ki.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jg a(ki $$0) {
      arm $$1 = (arm)this.b.dX();
      cfz $$2 = $$1.y();
      List<jg> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cfz.b.b).map(cga::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(cnt $$0) {
      return $$0.b(this.b.dX().aa());
   }
}
