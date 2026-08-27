import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxl extends cyv {
   public static final MapCodec<cxl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, cxl::new)
   );
   private final cvz b;

   @Override
   public MapCodec<cxl> a() {
      return a;
   }

   public cxl(cvz $$0, dio.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, dip $$3, cbd $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dip a(coq $$0) {
      cse $$1 = $$0.q();
      hv $$2 = $$0.a();
      dip $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(cse $$0, hv $$1, dip $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(cse $$0, hv $$1) {
      boolean $$2 = false;
      hv.a $$3 = $$1.j();

      for (ia $$4 : ia.values()) {
         dip $$5 = $$0.a_($$3);
         if ($$4 != ia.a || n($$5)) {
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

   private static boolean n(dip $$0) {
      return $$0.u().a(arw.a);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
