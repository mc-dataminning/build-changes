import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlq extends dnb {
   public static final MapCodec<dlq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dlq::new)
   );
   private final dke b;

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   public dlq(dke $$0, dxp.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, dxq $$3, clv $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dxq a(dax $$0) {
      dgf $$1 = $$0.q();
      ji $$2 = $$0.a();
      dxq $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dgf $$0, ji $$1, dxq $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dgf $$0, ji $$1) {
      boolean $$2 = false;
      ji.a $$3 = $$1.k();

      for (jn $$4 : jn.values()) {
         dxq $$5 = $$0.a_($$3);
         if ($$4 != jn.a || o($$5)) {
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

   private static boolean o(dxq $$0) {
      return $$0.y().a(awv.a);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
