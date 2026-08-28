import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkw extends dmh {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dkw::new)
   );
   private final djk b;

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(djk $$0, dwu.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, dwv $$3, ckz $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dwv a(dae $$0) {
      dfl $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwv $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dfl $$0, ji $$1, dwv $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dfl $$0, ji $$1) {
      boolean $$2 = false;
      ji.a $$3 = $$1.k();

      for (jn $$4 : jn.values()) {
         dwv $$5 = $$0.a_($$3);
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

   private static boolean o(dwv $$0) {
      return $$0.y().a(awu.a);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
