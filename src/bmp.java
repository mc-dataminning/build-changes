import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bmp extends bmi {
   public static final Codec<bmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bln.b(bmi.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bmp::new)
   );
   private final bln<bmi> b;
   private final int f;
   private final int g;

   public bmp(bln<bmi> $$0) {
      this.b = $$0;
      List<blp.b<bmi>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (blp.b<bmi> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(axd $$0) {
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
   public bmj<?> c() {
      return bmj.e;
   }
}
