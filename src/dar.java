import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dar extends dcb {
   public static final MapCodec<dar> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dar::new)
   );
   private final czf b;

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   public dar(czf $$0, dmd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, dme $$3, cek $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dme a(crx $$0) {
      cvk $$1 = $$0.q();
      ib $$2 = $$0.a();
      dme $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cvk $$0, ib $$1, dme $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cvk $$0, ib $$1) {
      boolean $$2 = false;
      ib.a $$3 = $$1.j();

      for (ih $$4 : ih.values()) {
         dme $$5 = $$0.a_($$3);
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

   private static boolean n(dme $$0) {
      return $$0.u().a(auj.a);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dme $$0, cvk $$1, ib $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
