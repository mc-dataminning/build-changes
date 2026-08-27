import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddk extends deu {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kr.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, ddk::new)
   );
   private final dby b;

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddk(dby $$0, doy.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, doz $$3, cgc $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public doz a(cuo $$0) {
      cyd $$1 = $$0.q();
      ib $$2 = $$0.a();
      doz $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(cyd $$0, ib $$1, doz $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cyd $$0, ib $$1) {
      boolean $$2 = false;
      ib.a $$3 = $$1.j();

      for (ih $$4 : ih.values()) {
         doz $$5 = $$0.a_($$3);
         if ($$4 != ih.a || n($$5)) {
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

   private static boolean n(doz $$0) {
      return $$0.u().a(avh.a);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(doz $$0, cyd $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
