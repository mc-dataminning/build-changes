import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkz extends dmk {
   public static final MapCodec<dkz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dkz::new)
   );
   private final djn b;

   @Override
   public MapCodec<dkz> a() {
      return a;
   }

   public dkz(djn $$0, dwx.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, dwy $$3, clc $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public dwy a(dah $$0) {
      dfo $$1 = $$0.q();
      ji $$2 = $$0.a();
      dwy $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(dfo $$0, ji $$1, dwy $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(dfo $$0, ji $$1) {
      boolean $$2 = false;
      ji.a $$3 = $$1.k();

      for (jn $$4 : jn.values()) {
         dwy $$5 = $$0.a_($$3);
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

   private static boolean o(dwy $$0) {
      return $$0.y().a(awv.a);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
