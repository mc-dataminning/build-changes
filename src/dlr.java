import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlr extends dnb {
   public static final MapCodec<dlr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dlr::new)
   );
   private final dke b;

   @Override
   public MapCodec<dlr> a() {
      return a;
   }

   public dlr(dke $$0, dxm.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, dxn $$3, clv $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dxn a(dbb $$0) {
      dgf $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxn $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dgf $$0, jh $$1, dxn $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dgf $$0, jh $$1) {
      boolean $$2 = false;
      jh.a $$3 = $$1.k();

      for (jm $$4 : jm.values()) {
         dxn $$5 = $$0.a_($$3);
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

   private static boolean o(dxn $$0) {
      return $$0.y().a(aya.a);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
