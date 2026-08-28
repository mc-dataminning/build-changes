import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class cvz extends cwb {
   private final axt<cvy> a;

   public cvz(axt<cvy> $$0, cwb.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      super.a($$0, $$1, $$2, $$3);
      js.a $$4 = $$1.a();
      if ($$4 != null) {
         Optional<jq<cvy>> $$5 = this.a($$0, $$4);
         if ($$5.isPresent()) {
            xz $$6 = $$5.get().a().d().f();
            xo.a($$6, yi.a.a(n.h));
            $$2.add($$6);
         }
      }
   }

   public static cwf a(cwb $$0, jq<cvy> $$1) {
      cwf $$2 = new cwf($$0);
      $$2.b(ku.Z, $$1);
      return $$2;
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      Optional<? extends jq<cvy>> $$4 = this.a($$3, $$1.ea());
      if ($$4.isPresent()) {
         cvy $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gH().a($$3, azn.d($$5.b() * 20.0F));
         $$1.b(awy.c.b(this));
         return bsh.c;
      } else {
         return bsh.d;
      }
   }

   @Override
   public int a(cwf $$0, bve $$1) {
      Optional<jq<cvy>> $$2 = this.a($$0, $$1.ea());
      return $$2.<Integer>map($$0x -> azn.d(((cvy)$$0x.a()).b() * 20.0F)).orElse(0);
   }

   private Optional<jq<cvy>> a(cwf $$0, js.a $$1) {
      jq<cvy> $$2 = $$0.a(ku.Z);
      if ($$2 != null) {
         return Optional.of($$2);
      } else {
         Optional<ju.c<cvy>> $$3 = $$1.d(ma.I).a(this.a);
         if ($$3.isPresent()) {
            Iterator<jq<cvy>> $$4 = $$3.get().iterator();
            if ($$4.hasNext()) {
               return Optional.of($$4.next());
            }
         }

         return Optional.empty();
      }
   }

   @Override
   public cwh b(cwf $$0) {
      return cwh.i;
   }

   private static void a(dff $$0, cor $$1, cvy $$2) {
      awn $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, awp.c, $$4, 1.0F);
      $$0.a(eak.B, $$1.dw(), eak.a.a($$1));
   }
}
