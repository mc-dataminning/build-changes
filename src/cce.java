import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cce extends ccz {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public cce(bvm $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected ezr h() {
      float $$0 = this.b.dY().A.i();
      if (this.b.dY().A.i() < 0.3F) {
         return this.k();
      } else {
         ezr $$1;
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
   private ezr k() {
      return cgc.a(this.b, 10, 7);
   }

   @Nullable
   private ezr l() {
      arq $$0 = (arq)this.b.dY();
      List<coc> $$1 = $$0.a(bup.bj, this.b.cT().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         coc $$2 = $$1.get(this.b.dY().A.a($$1.size()));
         ezr $$3 = $$2.dw();
         return cgc.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private ezr m() {
      kj $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         jh $$1 = this.a($$0);
         return $$1 == null ? null : cgc.a(this.b, 10, 7, ezr.c($$1));
      }
   }

   @Nullable
   private kj n() {
      arq $$0 = (arq)this.b.dY();
      List<kj> $$1 = kj.a(kj.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.A.a($$1.size()));
   }

   @Nullable
   private jh a(kj $$0) {
      arq $$1 = (arq)this.b.dY();
      cgi $$2 = $$1.y();
      List<jh> $$3 = $$2.c($$0x -> true, $$0.k(), 8, cgi.b.b).map(cgj::g).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.A.a($$3.size()));
   }

   private boolean a(coc $$0) {
      return $$0.a(this.b.dY().aa());
   }
}
