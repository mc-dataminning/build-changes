import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dae extends dbo {
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dae::new)
   );
   private final cys b;

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   public dae(cys $$0, dli.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, dlj $$3, cdv $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dlj a(crk $$0) {
      cux $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlj $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cux $$0, hz $$1, dlj $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cux $$0, hz $$1) {
      boolean $$2 = false;
      hz.a $$3 = $$1.j();

      for (ie $$4 : ie.values()) {
         dlj $$5 = $$0.a_($$3);
         if ($$4 != ie.a || n($$5)) {
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

   private static boolean n(dlj $$0) {
      return $$0.u().a(auf.a);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dlj $$0, cux $$1, hz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
