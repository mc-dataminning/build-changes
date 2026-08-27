import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bnm extends bnf {
   public static final Codec<bnm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmk.b(bnf.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bnm::new)
   );
   private final bmk<bnf> b;
   private final int f;
   private final int g;

   public bnm(bmk<bnf> $$0) {
      this.b = $$0;
      List<bmm.b<bnf>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bmm.b<bnf> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(axr $$0) {
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
   public bng<?> c() {
      return bng.e;
   }
}
