import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djv extends dle {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, djv::new)
   );
   private final dij b;

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djv(dij $$0, dvn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dff $$0, jh $$1, dvo $$2, dvo $$3, cky $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dvo a(czw $$0) {
      dek $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvo $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dek $$0, jh $$1, dvo $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dek $$0, jh $$1) {
      boolean $$2 = false;
      jh.a $$3 = $$1.k();

      for (jm $$4 : jm.values()) {
         dvo $$5 = $$0.a_($$3);
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

   private static boolean o(dvo $$0) {
      return $$0.y().a(axj.a);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
