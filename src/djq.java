import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djq extends dkz {
   public static final MapCodec<djq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ly.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, djq::new)
   );
   private final die b;

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   public djq(die $$0, dvi.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, dvj $$3, cku $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dvj a(czs $$0) {
      deg $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvj $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(deg $$0, jh $$1, dvj $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(deg $$0, jh $$1) {
      boolean $$2 = false;
      jh.a $$3 = $$1.k();

      for (jm $$4 : jm.values()) {
         dvj $$5 = $$0.a_($$3);
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

   private static boolean o(dvj $$0) {
      return $$0.y().a(axg.a);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return a($$3, $$4) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
