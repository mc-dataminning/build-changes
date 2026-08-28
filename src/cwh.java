import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cwh extends cwj {
   private final axe<cwg> a;

   public cwh(axe<cwg> $$0, cwj.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jr<cwg>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xc $$6 = $$5.get().a().d().f();
            wr.a($$6, xl.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwn a(cwj $$0, jr<cwg> $$1) {
      cwn $$2 = new cwn($$0);
      $$2.b(kv.Z, $$1);
      return $$2;
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      Optional<? extends jr<cwg>> $$4 = this.a($$3, $$1.dY());
      if ($$4.isPresent()) {
         cwg $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, ayy.d($$5.b() * 20.0F));
         $$1.b(awj.c.b(this));
         return bsi.c;
      } else {
         return bsi.d;
      }
   }

   @Override
   public int a(cwn $$0, bvf $$1) {
      Optional<jr<cwg>> $$2 = this.a($$0, $$1.dY());
      return $$2.<Integer>map($$0x -> ayy.d(((cwg)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jr<cwg>> a(cwn $$0, jt.a $$1) {
      jr<cwg> $$2 = $$0.a(kv.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jv.c<cwg>> $$3 = $$1.d(mc.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jr<cwg>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cwp b(cwn $$0) {
      return cwp.i;
   }

   private static void a(dgg $$0, cov $$1, cwg $$2) {
      avy $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awa.c, $$4, 1.0F);
      $$0.a(ebr.B, $$1.du(), ebr.a.a($$1));
   }
}
