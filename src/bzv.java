import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bzv extends bwo<cnt> {
   private long c;

   public bzv() {
      super(ImmutableMap.of(cdz.r, cea.a, cdz.h, cea.a), 350, 350);
   }

   protected boolean a(arm $$0, cnt $$1) {
      return this.a($$1);
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return $$2 <= this.c && this.a($$1);
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      btq $$3 = $$1.ed().c(cdz.r).get();
      bwq.a($$1, $$3, 0.5F, 2);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.ea().a(50);
      this.c = $$2 + (long)$$4;
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      cnt $$3 = (cnt)$$1.ed().c(cdz.r).get();
      if (!($$1.g($$3) > 5.0)) {
         bwq.a($$1, $$3, 0.5F, 2);
         if ($$2 >= this.c) {
            $$1.gL();
            $$3.gL();
            this.a($$0, $$1, $$3);
         } else if ($$1.ea().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(arm $$0, cnt $$1, cnt $$2) {
      Optional<jg> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cnt> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.y().b($$3.get());
            agr.c($$0, $$3.get());
         }
      }
   }

   protected void d(arm $$0, cnt $$1, long $$2) {
      $$1.ed().b(cdz.r);
   }

   private boolean a(cnt $$0) {
      bvx<cnt> $$1 = $$0.ed();
      Optional<btq> $$2 = $$1.c(cdz.r).filter($$0x -> $$0x.aq() == bug.bj);
      return $$2.isEmpty() ? false : bwq.a($$1, cdz.r, bug.bj) && $$0.ac_() && $$2.get().ac_();
   }

   private Optional<jg> b(arm $$0, cnt $$1) {
      return $$0.y().a($$0x -> $$0x.a(cgd.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dx(), 48);
   }

   private boolean a(cnt $$0, jg $$1, jp<cgc> $$2) {
      ers $$3 = $$0.P().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cnt> b(arm $$0, cnt $$1, cnt $$2) {
      cnt $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.dC(), $$1.dE(), $$1.dI(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(arm $$0, cnt $$1, jg $$2) {
      jo $$3 = jo.a($$0.ag(), $$2);
      $$1.ed().a(cdz.b, $$3);
   }
}
