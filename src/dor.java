import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dor extends dqc {
   public static final MapCodec<dor> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dor::new)
   );
   private final dne b;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dne $$0, ebf.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, ebg $$3, cod $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public ebg a(ddt $$0) {
      djd $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebg $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(djd $$0, iw $$1, ebg $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(djd $$0, iw $$1) {
      boolean $$2 = false;
      iw.a $$3 = $$1.k();

      for (jc $$4 : jc.values()) {
         ebg $$5 = $$0.a_($$3);
         if ($$4 != jc.a || o($$5)) {
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

   private static boolean o(ebg $$0) {
      return $$0.y().a(axl.a);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
