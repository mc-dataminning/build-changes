import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class bsd extends bsy {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public bsd(blp $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected eju h() {
      float $$0 = this.b.dN().z.i();
      if (this.b.dN().z.i() < 0.3F) {
         return this.k();
      } else {
         eju $$1;
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
   private eju k() {
      return bvz.a(this.b, 10, 7);
   }

   @Nullable
   private eju l() {
      ame $$0 = (ame)this.b.dN();
      List<cdh> $$1 = $$0.a(bku.bf, this.b.cH().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cdh $$2 = $$1.get(this.b.dN().z.a($$1.size()));
         eju $$3 = $$2.dl();
         return bvz.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private eju m() {
      iu $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         ht $$1 = this.a($$0);
         return $$1 == null ? null : bvz.a(this.b, 10, 7, eju.c($$1));
      }
   }

   @Nullable
   private iu n() {
      ame $$0 = (ame)this.b.dN();
      List<iu> $$1 = iu.a(iu.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private ht a(iu $$0) {
      ame $$1 = (ame)this.b.dN();
      bwf $$2 = $$1.x();
      List<ht> $$3 = $$2.c($$0x -> true, $$0.q(), 8, bwf.b.b).map(bwg::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cdh $$0) {
      return $$0.a(this.b.dN().W());
   }
}
