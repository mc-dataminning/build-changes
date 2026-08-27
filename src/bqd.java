import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqd extends bmx<cdh> {
   private static final int c = 5;
   private static final float d = 0.5F;
   private long e;

   public bqd() {
      super(ImmutableMap.of(buh.r, bui.a, buh.h, bui.a), 350, 350);
   }

   protected boolean a(ame $$0, cdh $$1) {
      return this.a($$1);
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return $$2 <= this.e && this.a($$1);
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      bkl $$3 = $$1.dP().c(buh.r).get();
      bmz.a($$1, $$3, 0.5F);
      $$0.a($$3, (byte)18);
      $$0.a($$1, (byte)18);
      int $$4 = 275 + $$1.eh().a(50);
      this.e = $$2 + (long)$$4;
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      cdh $$3 = (cdh)$$1.dP().c(buh.r).get();
      if (!($$1.f($$3) > 5.0)) {
         bmz.a($$1, $$3, 0.5F);
         if ($$2 >= this.e) {
            $$1.gw();
            $$3.gw();
            this.a($$0, $$1, $$3);
         } else if ($$1.eh().a(35) == 0) {
            $$0.a($$3, (byte)12);
            $$0.a($$1, (byte)12);
         }
      }
   }

   private void a(ame $$0, cdh $$1, cdh $$2) {
      Optional<ht> $$3 = this.b($$0, $$1);
      if ($$3.isEmpty()) {
         $$0.a($$2, (byte)13);
         $$0.a($$1, (byte)13);
      } else {
         Optional<cdh> $$4 = this.b($$0, $$1, $$2);
         if ($$4.isPresent()) {
            this.a($$0, $$4.get(), $$3.get());
         } else {
            $$0.x().b($$3.get());
            ack.c($$0, $$3.get());
         }
      }
   }

   protected void d(ame $$0, cdh $$1, long $$2) {
      $$1.dP().b(buh.r);
   }

   private boolean a(cdh $$0) {
      bmg<cdh> $$1 = $$0.dP();
      Optional<bkl> $$2 = $$1.c(buh.r).filter($$0x -> $$0x.ai() == bku.bf);
      return $$2.isEmpty() ? false : bmz.a($$1, buh.r, bku.bf) && $$0.X_() && $$2.get().X_();
   }

   private Optional<ht> b(ame $$0, cdh $$1) {
      return $$0.x().a($$0x -> $$0x.a(bwj.n), ($$1x, $$2) -> this.a($$1, $$2, $$1x), $$1.dn(), 48);
   }

   private boolean a(cdh $$0, ht $$1, ib<bwi> $$2) {
      edh $$3 = $$0.N().a($$1, $$2.a().c());
      return $$3 != null && $$3.j();
   }

   private Optional<cdh> b(ame $$0, cdh $$1, cdh $$2) {
      cdh $$3 = $$1.b($$0, $$2);
      if ($$3 == null) {
         return Optional.empty();
      } else {
         $$1.c_(6000);
         $$2.c_(6000);
         $$3.c_(-24000);
         $$3.b($$1.ds(), $$1.du(), $$1.dy(), 0.0F, 0.0F);
         $$0.a_($$3);
         $$0.a($$3, (byte)12);
         return Optional.of($$3);
      }
   }

   private void a(ame $$0, cdh $$1, ht $$2) {
      ia $$3 = ia.a($$0.ad(), $$2);
      $$1.dP().a(buh.b, $$3);
   }
}
