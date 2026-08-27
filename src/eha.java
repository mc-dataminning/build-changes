import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eha(ib<cpm> b, List<Float> c) implements ehk {
   public static final Codec<eha> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.g.r().fieldOf("enchantment").forGetter(eha::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eha::d)).apply($$0, eha::new)
   );

   @Override
   public ehl b() {
      return ehm.l;
   }

   @Override
   public Set<egt<?>> a() {
      return ImmutableSet.of(egw.i);
   }

   public boolean a(eel $$0) {
      clb $$1 = $$0.c(egw.i);
      int $$2 = $$1 != null ? cpo.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ehk.a a(cpm $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eha($$0.j(), $$2);
   }

   public ib<cpm> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
