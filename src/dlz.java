import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlz extends dnj {
   public static final MapCodec<dlz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dlz::new)
   );
   private final dkm b;

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   public dlz(dkm $$0, dxu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, dxv $$3, cma $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dxv a(dbg $$0) {
      dgn $$1 = $$0.q();
      jh $$2 = $$0.a();
      dxv $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dgn $$0, jh $$1, dxv $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dgn $$0, jh $$1) {
      boolean $$2 = false;
      jh.a $$3 = $$1.k();

      for (jm $$4 : jm.values()) {
         dxv $$5 = $$0.a_($$3);
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

   private static boolean o(dxv $$0) {
      return $$0.y().a(aya.a);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
