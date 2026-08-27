import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ega extends efw {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> b($$0).and(bpf.b(0, 24).fieldOf("height").forGetter($$0x -> $$0x.b)).apply($$0, ega::new)
   );
   private final bpf b;

   public ega(bpf $$0, bpf $$1, bpf $$2) {
      super($$0, $$1);
      this.b = $$2;
   }

   @Override
   protected efx<?> a() {
      return efx.c;
   }

   @Override
   protected void a(dcg $$0, efw.b $$1, ayt $$2, efg $$3, int $$4, efw.a $$5, int $$6, int $$7, int $$8) {
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
   public int a(ayt $$0, int $$1) {
      return super.a($$0, $$1) + $$0.a(Math.max($$1 + 1, 1));
   }

   @Override
   public int a(ayt $$0, int $$1, efg $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
