import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cxj extends cxl {
   private final ayk<cxi> a;

   public cxj(ayk<cxi> $$0, cxl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cxi>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            yj $$6 = $$5.get().a().d().f();
            xy.a($$6, ys.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cxp a(cxl $$0, jq<cxi> $$1) {
      cxp $$2 = new cxp($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public btj a(dhi $$0, cpx $$1, bti $$2) {
      cxp $$3 = $$1.b($$2);
      Optional<? extends jq<cxi>> $$4 = this.a($$3, $$1.dY());
      if ($$4.isPresent()) {
         cxi $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, bae.d($$5.b() * 20.0F));
         $$1.b(axp.c.b(this));
         return btj.c;
      } else {
         return btj.d;
      }
   }

   @Override
   public int a(cxp $$0, bwg $$1) {
      Optional<jq<cxi>> $$2 = this.a($$0, $$1.dY());
      return $$2.<Integer>map($$0x -> bae.d(((cxi)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cxi>> a(cxp $$0, js.a $$1) {
      jq<cxi> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cxi>> $$3 = $$1.d(mb.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cxi>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cxr b(cxp $$0) {
      return cxr.i;
   }

   private static void a(dhi $$0, cpx $$1, cxi $$2) {
      axe $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, axg.c, $$4, 1.0F);
      $$0.a(ecr.B, $$1.du(), ecr.a.a($$1));
   }
}
