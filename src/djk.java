import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djk extends dkt {
   public static final MapCodec<djk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lx.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, djk::new)
   );
   private final dhy b;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   public djk(dhy $$0, dvc.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, dvd $$3, ckp $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dvd a(czm $$0) {
      dea $$1 = $$0.q();
      jg $$2 = $$0.a();
      dvd $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dea $$0, jg $$1, dvd $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dea $$0, jg $$1) {
      boolean $$2 = false;
      jg.a $$3 = $$1.k();

      for (jl $$4 : jl.values()) {
         dvd $$5 = $$0.a_($$3);
         if ($$4 != jl.a || o($$5)) {
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

   private static boolean o(dvd $$0) {
      return $$0.y().a(axf.a);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return a($$3, $$4) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public int b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
