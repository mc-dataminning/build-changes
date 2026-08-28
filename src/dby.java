import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dby(List<ddb> d) {
   public static final Codec<dby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddb.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dby::a)).apply($$0, dby::new)
   );
   public static final yw<wj, dby> b = yw.a(ddb.e.a(yu.a()), dby::a, dby::new);
   public static final dby c = new dby(List.of(new dda(), new dcz(List.of(new bvm(bvo.j, 900, 1), new bvm(bvo.v, 100, 1), new bvm(bvo.l, 800, 0)))));

   public void a(czn $$0, bxj $$1) {
      for (ddb $$2 : this.d) {
         $$2.a($$1.dU(), $$0, $$1);
      }
   }

   public List<ddb> a() {
      return this.d;
   }
}
