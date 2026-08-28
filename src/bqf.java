import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bqf extends bpy {
   public static final MapCodec<bqf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpd.b(bpy.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bqf::new)
   );
   private final bpd<bpy> b;
   private final int f;
   private final int g;

   public bqf(bpd<bpy> $$0) {
      this.b = $$0;
      List<bpf.b<bpy>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bpf.b<bpy> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(azg $$0) {
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
   public bpz<?> c() {
      return bpz.e;
   }
}
