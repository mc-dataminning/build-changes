import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egb extends efw {
   public static final Codec<egb> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  bpf.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, egb::new)
   );
   private final bpf b;
   private final int c;

   public egb(bpf $$0, bpf $$1, bpf $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected efx<?> a() {
      return efx.j;
   }

   @Override
   protected void a(dcg $$0, efw.b $$1, ayt $$2, efg $$3, int $$4, efw.a $$5, int $$6, int $$7, int $$8) {
      ir $$9 = $$5.a();
      ir.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(ayt $$0, int $$1, efg $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(ayt $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
