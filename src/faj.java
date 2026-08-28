import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record faj(js<deh> b, List<Float> c) implements fau {
   public static final MapCodec<faj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deh.c.fieldOf("enchantment").forGetter(faj::c), ays.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(faj::d)).apply($$0, faj::new)
   );

   @Override
   public fav b() {
      return faw.k;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.i);
   }

   public boolean a(exl $$0) {
      cxy $$1 = $$0.c(faf.i);
      int $$2 = $$1 != null ? dej.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fau.a a(js<deh> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new faj($$0, $$2);
   }

   public js<deh> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
