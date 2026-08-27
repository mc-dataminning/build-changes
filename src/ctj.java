import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class ctj extends ctl {
   private final awm<cti> a;

   public ctj(ctl.a $$0, awm<cti> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<akm<cti>> $$4 = this.j($$0).flatMap(ix::e);
      if ($$4.isPresent()) {
         xl $$5 = wx.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static ctq a(ctl $$0, ix<cti> $$1) {
      ctq $$2 = new ctq($$0);
      $$2.b(kb.O, $$1);
      return $$2;
   }

   public static void a(ctq $$0, awm<cti> $$1, aym $$2) {
      Optional<ix<cti>> $$3 = le.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(kb.O, $$1x));
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      Optional<? extends ix<cti>> $$4 = this.j($$3);
      if ($$4.isPresent()) {
         cti $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gx().a(this, $$5.b());
         $$1.b(avs.c.b(this));
         return bpx.b($$3);
      } else {
         return bpx.d($$3);
      }
   }

   @Override
   public int b(ctq $$0) {
      Optional<ix<cti>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((cti)$$0x.a()).b()).orElse(0);
   }

   private Optional<ix<cti>> j(ctq $$0) {
      ix<cti> $$1 = $$0.a(kb.O);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ix<cti>> $$2 = le.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cvl c(ctq $$0) {
      return cvl.i;
   }

   private static void a(daz $$0, cly $$1, cti $$2) {
      avh $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avj.c, $$4, 1.0F);
      $$0.a(dvw.B, $$1.dn(), dvw.a.a($$1));
   }
}
