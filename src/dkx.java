import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkx extends dmi {
   public static final MapCodec<dkx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dkx::new)
   );
   private final djl b;

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(djl $$0, dwv.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, dww $$3, cla $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dww a(daf $$0) {
      dfm $$1 = $$0.q();
      ji $$2 = $$0.a();
      dww $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dfm $$0, ji $$1, dww $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dfm $$0, ji $$1) {
      boolean $$2 = false;
      ji.a $$3 = $$1.k();

      for (jn $$4 : jn.values()) {
         dww $$5 = $$0.a_($$3);
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

   private static boolean o(dww $$0) {
      return $$0.y().a(awv.a);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
