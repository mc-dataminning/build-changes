import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgt extends did {
   public static final MapCodec<dgt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lq.e.r().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dgt::new)
   );
   private final dfh b;

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   public dgt(dfh $$0, dsj.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, dsk $$3, cit $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dsk a(cxm $$0) {
      dbl $$1 = $$0.q();
      ja $$2 = $$0.a();
      dsk $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(dbl $$0, ja $$1, dsk $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dbl $$0, ja $$1) {
      boolean $$2 = false;
      ja.a $$3 = $$1.j();

      for (jf $$4 : jf.values()) {
         dsk $$5 = $$0.a_($$3);
         if ($$4 != jf.a || n($$5)) {
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

   private static boolean n(dsk $$0) {
      return $$0.u().a(awc.a);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
