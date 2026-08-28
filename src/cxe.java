import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cxe extends cxg {
   private final ayk<cxd> a;

   public cxe(ayk<cxd> $$0, cxg.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cxd>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            yj $$6 = $$5.get().a().d().f();
            xy.a($$6, ys.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cxk a(cxg $$0, jq<cxd> $$1) {
      cxk $$2 = new cxk($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      cxk $$3 = $$1.b($$2);
      Optional<? extends jq<cxd>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cxd $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gC().a($$3, bae.d($$5.b() * 20.0F));
         $$1.b(axp.c.b(this));
         return bte.c;
      } else {
         return bte.d;
      }
   }

   @Override
   public int a(cxk $$0, bwb $$1) {
      Optional<jq<cxd>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> bae.d(((cxd)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cxd>> a(cxk $$0, js.a $$1) {
      jq<cxd> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cxd>> $$3 = $$1.d(mb.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cxd>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cxm b(cxk $$0) {
      return cxm.i;
   }

   private static void a(dha $$0, cps $$1, cxd $$2) {
      axe $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, axg.c, $$4, 1.0F);
      $$0.a(ecj.B, $$1.dt(), ecj.a.a($$1));
   }
}
