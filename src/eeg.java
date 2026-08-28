import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeg extends eem {
   public static final MapCodec<eeg> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eeg::new));

   public eeg(bpx $$0, bpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected een<?> a() {
      return een.d;
   }

   @Override
   protected void a(dcc $$0, eem.b $$1, azf $$2, edw $$3, int $$4, eem.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      iz $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(azf $$0, int $$1, edw $$2) {
      return 0;
   }

   @Override
   protected boolean a(azf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
