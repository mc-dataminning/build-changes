import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxv extends czf {
   public static final MapCodec<cxv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, cxv::new)
   );
   private final cwj b;

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   public cxv(cwj $$0, diz.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, dja $$3, cbn $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dja a(cpa $$0) {
      cso $$1 = $$0.q();
      hx $$2 = $$0.a();
      dja $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cso $$0, hx $$1, dja $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cso $$0, hx $$1) {
      boolean $$2 = false;
      hx.a $$3 = $$1.j();

      for (ic $$4 : ic.values()) {
         dja $$5 = $$0.a_($$3);
         if ($$4 != ic.a || n($$5)) {
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

   private static boolean n(dja $$0) {
      return $$0.u().a(asg.a);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
