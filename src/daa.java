import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class daa extends dbk {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, daa::new)
   );
   private final cyo b;

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public daa(cyo $$0, dle.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(cvn $$0, hz $$1, dlf $$2, dlf $$3, cdr $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dlf a(crg $$0) {
      cut $$1 = $$0.q();
      hz $$2 = $$0.a();
      dlf $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cut $$0, hz $$1, dlf $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cut $$0, hz $$1) {
      boolean $$2 = false;
      hz.a $$3 = $$1.j();

      for (ie $$4 : ie.values()) {
         dlf $$5 = $$0.a_($$3);
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

   private static boolean n(dlf $$0) {
      return $$0.u().a(aue.a);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dlf $$0, cut $$1, hz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
