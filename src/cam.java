import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cam extends cbh {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cam(btu $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eww h() {
      float $$0 = this.b.dQ().z.i();
      if (this.b.dQ().z.i() < 0.3F) {
         return this.k();
      } else {
         eww $$1;
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
   private eww k() {
      return cek.a(this.b, 10, 7);
   }

   @Nullable
   private eww l() {
      aqt $$0 = (aqt)this.b.dQ();
      List<cmi> $$1 = $$0.a(bsw.bj, this.b.cL().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cmi $$2 = $$1.get(this.b.dQ().z.a($$1.size()));
         eww $$3 = $$2.do();
         return cek.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eww m() {
      kf $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jd $$1 = this.a($$0);
         return $$1 == null ? null : cek.a(this.b, 10, 7, eww.c($$1));
      }
   }

   @Nullable
   private kf n() {
      aqt $$0 = (aqt)this.b.dQ();
      List<kf> $$1 = kf.a(kf.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private jd a(kf $$0) {
      aqt $$1 = (aqt)this.b.dQ();
      ceq $$2 = $$1.y();
      List<jd> $$3 = $$2.c($$0x -> true, $$0.q(), 8, ceq.b.b).map(cer::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cmi $$0) {
      return $$0.a(this.b.dQ().Z());
   }
}
