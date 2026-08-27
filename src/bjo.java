import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bjo extends bjh {
   public static final Codec<bjo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bim.b(bjh.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bjo::new)
   );
   private final bim<bjh> b;
   private final int f;
   private final int g;

   public bjo(bim<bjh> $$0) {
      this.b = $$0;
      List<bio.b<bjh>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bio.b<bjh> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(auw $$0) {
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
   public bji<?> c() {
      return bji.e;
   }
}
