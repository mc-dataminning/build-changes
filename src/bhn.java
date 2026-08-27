import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bhn extends bhg {
   public static final Codec<bhn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgl.b(bhg.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bhn::new)
   );
   private final bgl<bhg> b;
   private final int f;
   private final int g;

   public bhn(bgl<bhg> $$0) {
      this.b = $$0;
      List<bgn.b<bhg>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bgn.b<bhg> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(ate $$0) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0);
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
   public bhh<?> c() {
      return bhh.e;
   }
}
