import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgn extends dhx {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dgn::new)
   );
   private final dfb b;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public dgn(dfb $$0, dsd.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, dse $$3, cji $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dse a(cyc $$0) {
      dbg $$1 = $$0.q();
      iz $$2 = $$0.a();
      dse $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(dbg $$0, iz $$1, dse $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dbg $$0, iz $$1) {
      boolean $$2 = false;
      iz.a $$3 = $$1.j();

      for (je $$4 : je.values()) {
         dse $$5 = $$0.a_($$3);
         if ($$4 != je.a || n($$5)) {
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

   private static boolean n(dse $$0) {
      return $$0.u().a(awv.a);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dse $$0, dbg $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
