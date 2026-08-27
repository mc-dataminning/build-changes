import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dux extends dus {
   public static final Codec<dux> a = RecordCodecBuilder.create(
      $$0 -> b($$0)
            .and(
               $$0.group(
                  biq.b(1, 512).fieldOf("foliage_height").forGetter($$0x -> $$0x.b),
                  Codec.intRange(0, 256).fieldOf("leaf_placement_attempts").forGetter($$0x -> $$0x.c)
               )
            )
            .apply($$0, dux::new)
   );
   private final biq b;
   private final int c;

   public dux(biq $$0, biq $$1, biq $$2, int $$3) {
      super($$0, $$1);
      this.b = $$2;
      this.c = $$3;
   }

   @Override
   protected dut<?> a() {
      return dut.j;
   }

   @Override
   protected void a(cte $$0, dus.b $$1, auf $$2, duc $$3, int $$4, dus.a $$5, int $$6, int $$7, int $$8) {
      hv $$9 = $$5.a();
      hv.a $$10 = $$9.j();

      for (int $$11 = 0; $$11 < this.c; $$11++) {
         $$10.a($$9, $$2.a($$7) - $$2.a($$7), $$2.a($$6) - $$2.a($$6), $$2.a($$7) - $$2.a($$7));
         a($$0, $$1, $$2, $$3, $$10);
      }
   }

   @Override
   public int a(auf $$0, int $$1, duc $$2) {
      return this.b.a($$0);
   }

   @Override
   protected boolean a(auf $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return false;
   }
}
