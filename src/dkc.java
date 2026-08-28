import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkc extends dll {
   public static final MapCodec<dkc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dkc::new)
   );
   private final diq b;

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   public dkc(diq $$0, dvu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, dvv $$3, clb $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dvv a(dad $$0) {
      der $$1 = $$0.q();
      jh $$2 = $$0.a();
      dvv $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(der $$0, jh $$1, dvv $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(der $$0, jh $$1) {
      boolean $$2 = false;
      jh.a $$3 = $$1.k();

      for (jm $$4 : jm.values()) {
         dvv $$5 = $$0.a_($$3);
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

   private static boolean o(dvv $$0) {
      return $$0.y().a(axi.a);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dvv $$0, der $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
