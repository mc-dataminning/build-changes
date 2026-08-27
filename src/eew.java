import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eew(he<cnf> b, List<Float> c) implements efg {
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.g.r().fieldOf("enchantment").forGetter(eew::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eew::d)).apply($$0, eew::new)
   );

   @Override
   public efh b() {
      return efi.l;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.i);
   }

   public boolean a(ech $$0) {
      ciy $$1 = $$0.c(ees.i);
      int $$2 = $$1 != null ? cnh.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static efg.a a(cnf $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eew($$0.j(), $$2);
   }

   public he<cnf> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
