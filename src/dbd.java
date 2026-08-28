import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dbd(List<dcg> d) {
   public static final Codec<dbd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcg.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dbd::a)).apply($$0, dbd::new)
   );
   public static final yu<wh, dbd> b = yu.a(dcg.e.a(ys.a()), dbd::a, dbd::new);
   public static final dbd c = new dbd(List.of(new dcf(), new dce(List.of(new bve(bvg.j, 900, 1), new bve(bvg.v, 100, 1), new bve(bvg.l, 800, 0)))));

   public void a(cys $$0, bwz $$1) {
      for (dcg $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dcg> a() {
      return this.d;
   }
}
