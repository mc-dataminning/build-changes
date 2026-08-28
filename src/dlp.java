import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlp extends dna {
   public static final MapCodec<dlp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dlp::new)
   );
   private final dkd b;

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dkd $$0, dxn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, dxo $$3, clr $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dxo a(dax $$0) {
      dge $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxo $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dge $$0, jh $$1, dxo $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dge $$0, jh $$1) {
      boolean $$2 = false;
      jh.a $$3 = $$1.k();

      for (jm $$4 : jm.values()) {
         dxo $$5 = $$0.a_($$3);
         if ($$4 != jm.a || o($$5)) {
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

   private static boolean o(dxo $$0) {
      return $$0.y().a(axq.a);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
