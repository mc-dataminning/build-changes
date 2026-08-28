import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class buo extends buh {
   public static final MapCodec<buo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btm.b(buh.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, buo::new)
   );
   private final btm<buh> b;
   private final int f;
   private final int g;

   public buo(btm<buh> $$0) {
      this.b = $$0;
      int $$1 = Integer.MAX_VALUE;
      int $$2 = Integer.MIN_VALUE;

      for (btl<buh> $$3 : $$0.d()) {
         int $$4 = $$3.a().a();
         int $$5 = $$3.a().b();
         $$1 = Math.min($$1, $$4);
         $$2 = Math.max($$2, $$5);
      }

      this.f = $$1;
      this.g = $$2;
   }

   @Override
   public int a(bai $$0) {
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
   public bui<?> c() {
      return bui.e;
   }
}
