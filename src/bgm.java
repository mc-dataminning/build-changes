import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class bgm extends bgf {
   public static final Codec<bgm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfk.b(bgf.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, bgm::new)
   );
   private final bfk<bgf> b;
   private final int f;
   private final int g;

   public bgm(bfk<bgf> $$0) {
      this.b = $$0;
      List<bfm.b<bgf>> $$1 = $$0.e();
      int $$2 = Integer.MAX_VALUE;
      int $$3 = Integer.MIN_VALUE;

      for (bfm.b<bgf> $$4 : $$1) {
         int $$5 = $$4.b().a();
         int $$6 = $$4.b().b();
         $$2 = Math.min($$2, $$5);
         $$3 = Math.max($$3, $$6);
      }

      this.f = $$2;
      this.g = $$3;
   }

   @Override
   public int a(ase $$0) {
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
   public bgg<?> c() {
      return bgg.e;
   }
}
