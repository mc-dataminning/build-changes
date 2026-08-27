import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eez(he<cnu> b, List<Float> c) implements efj {
   public static final Codec<eez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.g.r().fieldOf("enchantment").forGetter(eez::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eez::d)).apply($$0, eez::new)
   );

   @Override
   public efk b() {
      return efl.l;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.i);
   }

   public boolean a(eck $$0) {
      cjl $$1 = $$0.c(eev.i);
      int $$2 = $$1 != null ? cnw.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static efj.a a(cnu $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eez($$0.j(), $$2);
   }

   public he<cnu> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
