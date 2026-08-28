import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejz extends ekf {
   public static final MapCodec<ejz> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ejz::new));

   public ejz(bsf $$0, bsf $$1) {
      super($$0, $$1);
   }

   @Override
   protected ekg<?> a() {
      return ekg.d;
   }

   @Override
   protected void a(dhf $$0, ekf.b $$1, bac $$2, ejp $$3, int $$4, ekf.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jh $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(bac $$0, int $$1, ejp $$2) {
      return 0;
   }

   @Override
   protected boolean a(bac $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
