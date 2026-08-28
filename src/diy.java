import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diy extends dki {
   public static final MapCodec<diy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lv.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, diy::new)
   );
   private final dhm b;

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(dhm $$0, dur.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, dus $$3, ckg $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.n(), 3);
      }
   }

   @Override
   public dus a(czn $$0) {
      ddo $$1 = $$0.q();
      jf $$2 = $$0.a();
      dus $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.n() : super.a($$0);
   }

   private static boolean a(ddo $$0, jf $$1, dus $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(ddo $$0, jf $$1) {
      boolean $$2 = false;
      jf.a $$3 = $$1.k();

      for (jk $$4 : jk.values()) {
         dus $$5 = $$0.a_($$3);
         if ($$4 != jk.a || o($$5)) {
            $$3.a($$1, $$4);
            $$5 = $$0.a_($$3);
            if (o($$5) && !$$5.c($$0, $$1, $$4.g())) {
               $$2 = true;
               break;
            }
         }
      }

      return $$2;
   }

   private static boolean o(dus $$0) {
      return $$0.y().a(axb.a);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return a($$3, $$4) ? this.b.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
