import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class brb extends bqu {
   public static final MapCodec<brb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpz.b(bqu.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, brb::new)
   );
   private final bpz<bqu> b;
   private final int f;
   private final int g;

   public brb(bpz<bqu> $$0) {
      this.b = $$0;
      List<bqb.b<bqu>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bqb.b<bqu> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(azl $$0) {
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
   public bqv<?> c() {
      return bqv.e;
   }
}
