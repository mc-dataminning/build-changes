import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class btn extends btg {
   public static final MapCodec<btn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bsm.b(btg.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, btn::new)
   );
   private final bsm<btg> b;
   private final int f;
   private final int g;

   public btn(bsm<btg> $$0) {
      this.b = $$0;
      int $$1 = Integer.MAX_VALUE;
      int $$2 = Integer.MIN_VALUE;

      for (bsl<btg> $$3 : $$0.d()) {
         int $$4 = $$3.a().a();
         int $$5 = $$3.a().b();
         $$1 = Math.min($$1, $$4);
         $$2 = Math.max($$2, $$5);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(azv $$0) {
      return this.b.b($$0).a($$0);
   }

   @Override
   public int a() {
      return this.f;
   }

   @Override
   public int b() {
      return this.g;
   }

   @Override
   public bth<?> c() {
      return bth.e;
   }
}
