import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwm extends cxw {
   public static final MapCodec<cwm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, cwm::new)
   );
   private final cva b;

   @Override
   public MapCodec<cwm> a() {
      return a;
   }

   public cwm(cva $$0, dhh.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, dhi $$3, cam $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dhi a(cnr $$0) {
      crg $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(crg $$0, ht $$1, dhi $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(crg $$0, ht $$1) {
      boolean $$2 = false;
      ht.a $$3 = $$1.j();

      for (hx $$4 : hx.values()) {
         dhi $$5 = $$0.a_($$3);
         if ($$4 != hx.a || n($$5)) {
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

   private static boolean n(dhi $$0) {
      return $$0.u().a(arl.a);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
