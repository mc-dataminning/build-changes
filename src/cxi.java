import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cxi extends cxk {
   private final ayk<cxh> a;

   public cxi(ayk<cxh> $$0, cxk.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cxh>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            yj $$6 = $$5.get().a().d().f();
            xy.a($$6, ys.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cxo a(cxk $$0, jq<cxh> $$1) {
      cxo $$2 = new cxo($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public bti a(dhh $$0, cpw $$1, bth $$2) {
      cxo $$3 = $$1.b($$2);
      Optional<? extends jq<cxh>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cxh $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gC().a($$3, bae.d($$5.b() * 20.0F));
         $$1.b(axp.c.b(this));
         return bti.c;
      } else {
         return bti.d;
      }
   }

   @Override
   public int a(cxo $$0, bwf $$1) {
      Optional<jq<cxh>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> bae.d(((cxh)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cxh>> a(cxo $$0, js.a $$1) {
      jq<cxh> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cxh>> $$3 = $$1.d(mb.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cxh>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cxq b(cxo $$0) {
      return cxq.i;
   }

   private static void a(dhh $$0, cpw $$1, cxh $$2) {
      axe $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, axg.c, $$4, 1.0F);
      $$0.a(ecq.B, $$1.dt(), ecq.a.a($$1));
   }
}
