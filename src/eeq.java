import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeq extends eem {
   public static final MapCodec<eeq> a = RecordCodecBuilder.mapCodec(
      $$0 -> b($$0).and(bpx.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, eeq::new)
   );
   private final bpx b;

   public eeq(bpx $$0, bpx $$1, bpx $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected een<?> a() {
      return een.c;
   }

   @Override
   protected void a(dcc $$0, eem.b $$1, azf $$2, edw $$3, int $$4, eem.a $$5, int $$6, int $$7, int $$8) {
      int $$9 = 0;

      for (int $$10 = $$8; $$10 >= $$8 - $$6; $$10--) {
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$9, $$10, $$5.c());
         if ($$9 >= 1 && $$10 == $$8 - $$6 + 1) {
            $$9--;
         } else if ($$9 < $$7 + $$5.b()) {
            $$9++;
         }
      }
   }

   @Override
   public int a(azf $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(azf $$0, int $$1, edw $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(azf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
