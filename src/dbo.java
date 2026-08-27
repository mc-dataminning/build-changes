import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbo extends dcy {
   public static final MapCodec<dbo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ki.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dbo::new)
   );
   private final dac b;

   @Override
   public MapCodec<dbo> a() {
      return a;
   }

   public dbo(dac $$0, dna.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, dnb $$3, cfd $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dnb a(csu $$0) {
      cwh $$1 = $$0.q();
      ib $$2 = $$0.a();
      dnb $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cwh $$0, ib $$1, dnb $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cwh $$0, ib $$1) {
      boolean $$2 = false;
      ib.a $$3 = $$1.j();

      for (ih $$4 : ih.values()) {
         dnb $$5 = $$0.a_($$3);
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

   private static boolean n(dnb $$0) {
      return $$0.u().a(aus.a);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
