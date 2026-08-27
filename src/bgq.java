import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bgq extends bgj {
   public static final Codec<bgq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfo.b(bgj.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bgq::new)
   );
   private final bfo<bgj> b;
   private final int f;
   private final int g;

   public bgq(bfo<bgj> $$0) {
      this.b = $$0;
      List<bfq.b<bgj>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bfq.b<bgj> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(ash $$0) {
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
   public bgk<?> c() {
      return bgk.e;
   }
}
