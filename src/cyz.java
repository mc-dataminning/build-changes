import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cyz(List<czz> d) {
   public static final Codec<cyz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czz.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(cyz::a)).apply($$0, cyz::new)
   );
   public static final ym<vz, cyz> b = ym.a(czz.e.a(yk.a()), cyz::a, cyz::new);
   public static final cyz c = new cyz(List.of(new czy(), new czx(List.of(new bto(btq.j, 900, 1), new bto(btq.v, 100, 1), new bto(btq.l, 800, 0)))));

   public void a(cwn $$0, bvf $$1) {
      for (czz $$2 : this.d) {
         $$2.a($$1.dW(), $$0, $$1);
      }
   }

   public List<czz> a() {
      return this.d;
   }
}
