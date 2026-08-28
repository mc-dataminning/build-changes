import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgm extends dhw {
   public static final MapCodec<dgm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dgm::new)
   );
   private final dfa b;

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dfa $$0, dsc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, dsd $$3, cjh $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dsd a(cyb $$0) {
      dbf $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsd $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(dbf $$0, iz $$1, dsd $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dbf $$0, iz $$1) {
      boolean $$2 = false;
      iz.a $$3 = $$1.j();

      for (je $$4 : je.values()) {
         dsd $$5 = $$0.a_($$3);
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

   private static boolean n(dsd $$0) {
      return $$0.u().a(awv.a);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dsd $$0, dbf $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
