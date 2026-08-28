import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class brk extends brd {
   public static final MapCodec<brk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bqg.b(brd.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, brk::new)
   );
   private final bqg<brd> b;
   private final int f;
   private final int g;

   public brk(bqg<brd> $$0) {
      this.b = $$0;
      List<bqi.b<brd>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bqi.b<brd> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(azr $$0) {
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
   public bre<?> c() {
      return bre.e;
   }
}
