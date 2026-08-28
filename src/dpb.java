import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpb extends dqm {
   public static final MapCodec<dpb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dpb::new)
   );
   private final dno b;

   @Override
   public MapCodec<dpb> a() {
      return a;
   }

   public dpb(dno $$0, ebp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, ebq $$3, com $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public ebq a(ded $$0) {
      djn $$1 = $$0.q();
      iw $$2 = $$0.a();
      ebq $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(djn $$0, iw $$1, ebq $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(djn $$0, iw $$1) {
      boolean $$2 = false;
      iw.a $$3 = $$1.k();

      for (jc $$4 : jc.values()) {
         ebq $$5 = $$0.a_($$3);
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

   private static boolean o(ebq $$0) {
      return $$0.y().a(axs.a);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
