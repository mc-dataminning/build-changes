import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgk extends dhu {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), u()).apply($$0, dgk::new)
   );
   private final dey b;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   public dgk(dey $$0, dsa.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, dsb $$3, cjf $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.o(), 3);
      }
   }

   @Override
   public dsb a(cxz $$0) {
      dbd $$1 = $$0.q();
      iz $$2 = $$0.a();
      dsb $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.o() : super.a($$0);
   }

   private static boolean a(dbd $$0, iz $$1, dsb $$2) {
      return n($$2) || a($$0, $$1);
   }

   private static boolean a(dbd $$0, iz $$1) {
      boolean $$2 = false;
      iz.a $$3 = $$1.j();

      for (je $$4 : je.values()) {
         dsb $$5 = $$0.a_($$3);
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

   private static boolean n(dsb $$0) {
      return $$0.u().a(awu.a);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return a($$3, $$4) ? this.b.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
