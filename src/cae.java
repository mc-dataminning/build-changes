import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cae extends bwx<coc> {
   private long c;

   public cae() {
      super(ImmutableMap.of(cei.r, cej.a, cei.h, cej.a), 350, 350);
   }

   protected boolean a(arq $$0, coc $$1) {
      return this.a($$1);
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      btz $$3 = $$1.ee().c(cei.r).get();
      bwz.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eb().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      coc $$3 = (coc)$$1.ee().c(cei.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bwz.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gL();
            $$3.gL();
            this.a($$0, $$1, $$3);
         } else if ($$1.eb().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arq $$0, coc $$1, coc $$2) {
      Optional<jh> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<coc> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agv.c($$0, $$3.get());
         }
      }
   }

   protected void d(arq $$0, coc $$1, long $$2) {
      $$1.ee().b(cei.r);
   }

   private boolean a(coc $$0) {
      bwg<coc> $$1 = $$0.ee();
      Optional<btz> $$2 = $$1.c(cei.r).filter($$0x -> $$0x.ar() == bup.bj);
      return $$2.isEmpty() ? false : bwz.a($$1, cei.r, bup.bj) && $$0.ac_() && $$2.get().ac_();
   }

   private Optional<jh> b(arq $$0, coc $$1) {
      return $$0.y().a($$0x -> $$0x.a(cgm.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dy(), 48);
   }

   private boolean a(coc $$0, jh $$1, jq<cgl> $$2) {
      esc $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<coc> b(arq $$0, coc $$1, coc $$2) {
      coc $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dD(), $$1.dF(), $$1.dJ(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arq $$0, coc $$1, jh $$2) {
      jp $$3 = jp.a($$0.ag(), $$2);
      $$1.ee().a(cei.b, $$3);
   }
}
