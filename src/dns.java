import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;

public class dns extends dmz {
   public static final MapCodec<dns> a = b(dns::new);
   private static final wp b = wp.c("container.grindstone_title");
   private final Function<dxq, fcr> d;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(e, jn.c).b(c, dyb.b));
      this.d = this.b();
   }

   private Function<dxq, fcr> b() {
      fcr $$0 = fco.a(dke.a(2.0, 6.0, 7.0, 4.0, 10.0, 16.0), dke.a(2.0, 5.0, 3.0, 4.0, 11.0, 9.0));
      fcr $$1 = fco.a($$0, h.z);
      fcr $$2 = fco.a(dke.a(8.0, 2.0, 14.0, 0.0, 12.0), $$0, $$1);
      Map<dyb, Map<jn, fcr>> $$3 = fco.e($$2);
      return this.a($$1x -> $$3.get($$1x.c(c)).get($$1x.c(e)));
   }

   private fcr o(dxq $$0) {
      return this.d.apply($$0);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.o($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.o($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return true;
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aD);
      }

      return bsy.a;
   }

   @Override
   protected bta b(dxq $$0, dgz $$1, ji $$2) {
      return new btg(($$2x, $$3, $$4) -> new ctw($$2x, $$3, ctj.a($$1, $$2)), b);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
