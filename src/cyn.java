import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cyn(List<czn> d) {
   public static final Codec<cyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czn.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(cyn::a)).apply($$0, cyn::new)
   );
   public static final zg<wt, cyn> b = zg.a(czn.e.a(ze.a()), cyn::a, cyn::new);
   public static final cyn c = new cyn(List.of(new czm(), new czl(List.of(new btj(btl.j, 900, 1), new btj(btl.v, 100, 1), new btj(btl.l, 800, 0)))));

   public void a(cwb $$0, bva $$1) {
      for (czn $$2 : this.d) {
         $$2.a($$1.dX(), $$0, $$1);
      }
   }

   public List<czn> a() {
      return this.d;
   }
}
