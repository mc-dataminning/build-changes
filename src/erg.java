import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record erg(iw<cyg> b, List<Float> c) implements erq {
   public static final Codec<erg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ld.f.r().fieldOf("enchantment").forGetter(erg::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(erg::d)).apply($$0, erg::new)
   );

   @Override
   public err b() {
      return ers.m;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.i);
   }

   public boolean a(eol $$0) {
      csz $$1 = $$0.c(erc.i);
      int $$2 = $$1 != null ? cyh.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static erq.a a(cyg $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new erg($$0.l(), $$2);
   }

   public iw<cyg> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
