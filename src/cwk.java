import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cwk extends cwm {
   private final axf<cwj> a;

   public cwk(axf<cwj> $$0, cwm.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jr<cwj>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xd $$6 = $$5.get().a().d().f();
            ws.a($$6, xm.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwq a(cwm $$0, jr<cwj> $$1) {
      cwq $$2 = new cwq($$0);
      $$2.b(kv.Z, $$1);
      return $$2;
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      Optional<? extends jr<cwj>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cwj $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, ayz.d($$5.b() * 20.0F));
         $$1.b(awk.c.b(this));
         return bsl.c;
      } else {
         return bsl.d;
      }
   }

   @Override
   public int a(cwq $$0, bvi $$1) {
      Optional<jr<cwj>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> ayz.d(((cwj)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jr<cwj>> a(cwq $$0, jt.a $$1) {
      jr<cwj> $$2 = $$0.a(kv.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jv.c<cwj>> $$3 = $$1.d(mc.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jr<cwj>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cws b(cwq $$0) {
      return cws.i;
   }

   private static void a(dgj $$0, coy $$1, cwj $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(ebu.B, $$1.dt(), ebu.a.a($$1));
   }
}
