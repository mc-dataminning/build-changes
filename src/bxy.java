import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bxy extends bur<clu> {
   private long c;

   public bxy() {
      super(ImmutableMap.of(ccc.r, ccd.a, ccc.h, ccd.a), 350, 350);
   }

   protected boolean a(aqk $$0, clu $$1) {
      return this.a($$1);
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      brx $$3 = $$1.dT().c(ccc.r).get();
      but.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.dS().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      clu $$3 = (clu)$$1.dT().c(ccc.r).get();
      if (!($$1.g($$3) > 5.0)) {
         but.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gE();
            $$3.gE();
            this.a($$0, $$1, $$3);
         } else if ($$1.dS().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(aqk $$0, clu $$1, clu $$2) {
      Optional<ja> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<clu> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            afy.c($$0, $$3.get());
         }
      }
   }

   protected void d(aqk $$0, clu $$1, long $$2) {
      $$1.dT().b(ccc.r);
   }

   private boolean a(clu $$0) {
      bua<clu> $$1 = $$0.dT();
      Optional<brx> $$2 = $$1.c(ccc.r).filter($$0x -> $$0x.ak() == bsj.bj);
      return $$2.isEmpty() ? false : but.a($$1, ccc.r, bsj.bj) && $$0.X_() && $$2.get().X_();
   }

   private Optional<ja> b(aqk $$0, clu $$1) {
      return $$0.y().a($$0x -> $$0x.a(ceg.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dp(), 48);
   }

   private boolean a(clu $$0, ja $$1, jj<cef> $$2) {
      eop $$3 = $$0.K().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<clu> b(aqk $$0, clu $$1, clu $$2) {
      clu $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.du(), $$1.dw(), $$1.dA(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(aqk $$0, clu $$1, ja $$2) {
      ji $$3 = ji.a($$0.af(), $$2);
      $$1.dT().a(ccc.b, $$3);
   }
}
