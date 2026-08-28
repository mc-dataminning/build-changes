import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bsq extends bsj {
   public static final MapCodec<bsq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(brm.b(bsj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bsq::new)
   );
   private final brm<bsj> b;
   private final int f;
   private final int g;

   public bsq(brm<bsj> $$0) {
      this.b = $$0;
      List<bro.b<bsj>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bro.b<bsj> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(bam $$0) {
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
   public bsk<?> c() {
      return bsk.e;
   }
}
