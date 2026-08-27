import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class boc extends bnv {
   public static final Codec<boc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bna.b(bnv.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, boc::new)
   );
   private final bna<bnv> b;
   private final int f;
   private final int g;

   public boc(bna<bnv> $$0) {
      this.b = $$0;
      List<bnc.b<bnv>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bnc.b<bnv> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(ayd $$0) {
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
   public bnw<?> c() {
      return bnw.e;
   }
}
