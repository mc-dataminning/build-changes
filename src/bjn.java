import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bjn extends bjg {
   public static final Codec<bjn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bil.b(bjg.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bjn::new)
   );
   private final bil<bjg> b;
   private final int f;
   private final int g;

   public bjn(bil<bjg> $$0) {
      this.b = $$0;
      List<bin.b<bjg>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bin.b<bjg> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(auv $$0) {
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
   public bjh<?> c() {
      return bjh.e;
   }
}
