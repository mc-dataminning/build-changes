import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwr extends cyb {
   public static final MapCodec<cwr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.f.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, cwr::new)
   );
   private final cvf b;

   @Override
   public MapCodec<cwr> a() {
      return a;
   }

   public cwr(cvf $$0, dhm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, dhn $$3, car $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dhn a(cnw $$0) {
      crl $$1 = $$0.q();
      hx $$2 = $$0.a();
      dhn $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(crl $$0, hx $$1, dhn $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(crl $$0, hx $$1) {
      boolean $$2 = false;
      hx.a $$3 = $$1.j();

      for (ib $$4 : ib.values()) {
         dhn $$5 = $$0.a_($$3);
         if ($$4 != ib.a || n($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (n($$5) && !$$5.d($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean n(dhn $$0) {
      return $$0.u().a(arp.a);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
