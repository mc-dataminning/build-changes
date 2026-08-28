import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cwj extends cwl {
   private final axf<cwi> a;

   public cwj(axf<cwi> $$0, cwl.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      jt.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jr<cwi>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xd $$6 = $$5.get().a().d().f();
            ws.a($$6, xm.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwp a(cwl $$0, jr<cwi> $$1) {
      cwp $$2 = new cwp($$0);
      $$2.b(kv.Z, $$1);
      return $$2;
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      Optional<? extends jr<cwi>> $$4 = this.a($$3, $$1.dX());
      if ($$4.isPresent()) {
         cwi $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gE().a($$3, ayz.d($$5.b() * 20.0F));
         $$1.b(awk.c.b(this));
         return bsk.c;
      } else {
         return bsk.d;
      }
   }

   @Override
   public int a(cwp $$0, bvh $$1) {
      Optional<jr<cwi>> $$2 = this.a($$0, $$1.dX());
      return $$2.<Integer>map($$0x -> ayz.d(((cwi)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jr<cwi>> a(cwp $$0, jt.a $$1) {
      jr<cwi> $$2 = $$0.a(kv.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<jv.c<cwi>> $$3 = $$1.d(mc.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jr<cwi>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cwr b(cwp $$0) {
      return cwr.i;
   }

   private static void a(dgi $$0, cox $$1, cwi $$2) {
      avz $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awb.c, $$4, 1.0F);
      $$0.a(ebt.B, $$1.dt(), ebt.a.a($$1));
   }
}
