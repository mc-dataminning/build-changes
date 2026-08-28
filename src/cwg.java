import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cwg extends cwi {
   private final axs<cwf> a;

   public cwg(axs<cwf> $$0, cwi.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cwf>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xx $$6 = $$5.get().a().d().f();
            xm.a($$6, yg.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwm a(cwi $$0, jq<cwf> $$1) {
      cwm $$2 = new cwm($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public bsk a(dfm $$0, cou $$1, bsj $$2) {
      cwm $$3 = $$1.b($$2);
      Optional<? extends jq<cwf>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cwf $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gC().a($$3, azm.d($$5.b() * 20.0F));
         $$1.b(awx.c.b(this));
         return bsk.c;
      } else {
         return bsk.d;
      }
   }

   @Override
   public int a(cwm $$0, bvh $$1) {
      Optional<jq<cwf>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> azm.d(((cwf)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cwf>> a(cwm $$0, js.a $$1) {
      jq<cwf> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cwf>> $$3 = $$1.d(ma.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cwf>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cwo b(cwm $$0) {
      return cwo.i;
   }

   private static void a(dfm $$0, cou $$1, cwf $$2) {
      awm $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awo.c, $$4, 1.0F);
      $$0.a(ear.B, $$1.dt(), ear.a.a($$1));
   }
}
