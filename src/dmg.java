import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmg extends dnr {
   public static final MapCodec<dmg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dmg::new)
   );
   private final dku b;

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   public dmg(dku $$0, dyl.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, dym $$3, cmm $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dym a(dbn $$0) {
      dgv $$1 = $$0.q();
      jj $$2 = $$0.a();
      dym $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dgv $$0, jj $$1, dym $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dgv $$0, jj $$1) {
      boolean $$2 = false;
      jj.a $$3 = $$1.k();

      for (jo $$4 : jo.values()) {
         dym $$5 = $$0.a_($$3);
         if ($$4 != jo.a || o($$5)) {
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

   private static boolean o(dym $$0) {
      return $$0.y().a(axf.a);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
