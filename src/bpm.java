import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bpm extends bpf {
   public static final Codec<bpm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bok.b(bpf.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bpm::new)
   );
   private final bok<bpf> b;
   private final int f;
   private final int g;

   public bpm(bok<bpf> $$0) {
      this.b = $$0;
      List<bom.b<bpf>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bom.b<bpf> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(ayt $$0) {
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
   public bpg<?> c() {
      return bpg.e;
   }
}
