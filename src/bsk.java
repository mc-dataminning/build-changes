import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bsk extends bsd {
   public static final MapCodec<bsk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brj.b(bsd.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bsk::new)
   );
   private final brj<bsd> b;
   private final int f;
   private final int g;

   public bsk(brj<bsd> $$0) {
      this.b = $$0;
      int $$1 = Integer.MAX_VALUE;
      int $$2 = Integer.MIN_VALUE;

      for (bri<bsd> $$3 : $$0.d()) {
         int $$4 = $$3.a().a();
         int $$5 = $$3.a().b();
         $$1 = Math.min($$1, $$4);
         $$2 = Math.max($$2, $$5);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(azh $$0) {
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
   public bse<?> c() {
      return bse.e;
   }
}
