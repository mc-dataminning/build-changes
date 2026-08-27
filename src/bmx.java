import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bmx extends bns {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bmx(bgi $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eei h() {
      float $$0 = this.b.dI().z.i();
      if (this.b.dI().z.i() < 0.3F) {
         return this.k();
      } else {
         eei $$1;
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
   private eei k() {
      return bqt.a(this.b, 10, 7);
   }

   @Nullable
   private eei l() {
      aif $$0 = (aif)this.b.dI();
      List<byb> $$1 = $$0.a(bfn.bf, this.b.cE().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         byb $$2 = $$1.get(this.b.dI().z.a($$1.size()));
         eei $$3 = $$2.dg();
         return bqt.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eei m() {
      hx $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         gu $$1 = this.a($$0);
         return $$1 == null ? null : bqt.a(this.b, 10, 7, eei.c($$1));
      }
   }

   @Nullable
   private hx n() {
      aif $$0 = (aif)this.b.dI();
      List<hx> $$1 = hx.a(hx.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private gu a(hx $$0) {
      aif $$1 = (aif)this.b.dI();
      bqz $$2 = $$1.w();
      List<gu> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bqz.b.b).map(bra::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(byb $$0) {
      return $$0.a(this.b.dI().V());
   }
}
