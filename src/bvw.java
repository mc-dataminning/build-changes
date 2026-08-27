import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bvw extends bwr {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bvw(bpf $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eov h() {
      float $$0 = this.b.dJ().z.i();
      if (this.b.dJ().z.i() < 0.3F) {
         return this.k();
      } else {
         eov $$1;
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
   private eov k() {
      return bzu.a(this.b, 10, 7);
   }

   @Nullable
   private eov l() {
      apa $$0 = (apa)this.b.dJ();
      List<chn> $$1 = $$0.a(bol.bh, this.b.cE().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         chn $$2 = $$1.get(this.b.dJ().z.a($$1.size()));
         eov $$3 = $$2.dh();
         return bzu.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eov m() {
      jd $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ib $$1 = this.a($$0);
         return $$1 == null ? null : bzu.a(this.b, 10, 7, eov.c($$1));
      }
   }

   @Nullable
   private jd n() {
      apa $$0 = (apa)this.b.dJ();
      List<jd> $$1 = jd.a(jd.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private ib a(jd $$0) {
      apa $$1 = (apa)this.b.dJ();
      caa $$2 = $$1.y();
      List<ib> $$3 = $$2.c($$0x -> true, $$0.q(), 8, caa.b.b).map(cab::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(chn $$0) {
      return $$0.a(this.b.dJ().X());
   }
}
