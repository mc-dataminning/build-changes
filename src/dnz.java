import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnz extends dpk {
   public static final MapCodec<dnz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("concrete").forGetter($$0x -> $$0x.b), t()).apply($$0, dnz::new)
   );
   private final dmm b;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dmm $$0, ean.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, eao $$3, cnn $$4) {
      if (a($$0, $$1, $$3)) {
         $$0.a($$1, this.b.m(), 3);
      }
   }

   @Override
   public eao a(ddd $$0) {
      din $$1 = $$0.q();
      iv $$2 = $$0.a();
      eao $$3 = $$1.a_($$2);
      return a($$1, $$2, $$3) ? this.b.m() : super.a($$0);
   }

   private static boolean a(din $$0, iv $$1, eao $$2) {
      return o($$2) || a($$0, $$1);
   }

   private static boolean a(din $$0, iv $$1) {
      boolean $$2 = false;
      iv.a $$3 = $$1.k();

      for (jb $$4 : jb.values()) {
         eao $$5 = $$0.a_($$3);
         if ($$4 != jb.a || o($$5)) {
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

   private static boolean o(eao $$0) {
      return $$0.y().a(axh.a);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return a($$1, $$3) ? this.b.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public int b(eao $$0, din $$1, iv $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
