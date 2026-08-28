import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cxa extends cxc {
   private final aya<cwz> a;

   public cxa(aya<cwz> $$0, cxc.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cwz>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xy $$6 = $$5.get().a().d().f();
            xn.a($$6, yh.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cxg a(cxc $$0, jq<cwz> $$1) {
      cxg $$2 = new cxg($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public bta a(dgz $$0, cpo $$1, bsz $$2) {
      cxg $$3 = $$1.b($$2);
      Optional<? extends jq<cwz>> $$4 = this.a($$3, $$1.dY());
      if ($$4.isPresent()) {
         cwz $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, azu.d($$5.b() * 20.0F));
         $$1.b(axf.c.b(this));
         return bta.c;
      } else {
         return bta.d;
      }
   }

   @Override
   public int a(cxg $$0, bvx $$1) {
      Optional<jq<cwz>> $$2 = this.a($$0, $$1.dY());
      return $$2.<Integer>map($$0x -> azu.d(((cwz)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cwz>> a(cxg $$0, js.a $$1) {
      jq<cwz> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cwz>> $$3 = $$1.d(mb.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cwz>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cxi b(cxg $$0) {
      return cxi.i;
   }

   private static void a(dgz $$0, cpo $$1, cwz $$2) {
      awu $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aww.c, $$4, 1.0F);
      $$0.a(eck.B, $$1.du(), eck.a.a($$1));
   }
}
