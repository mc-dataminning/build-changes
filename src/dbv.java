import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dbv(List<dcy> d) {
   public static final Codec<dbv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dcy.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dbv::a)).apply($$0, dbv::new)
   );
   public static final yw<wj, dbv> b = yw.a(dcy.e.a(yu.a()), dbv::a, dbv::new);
   public static final dbv c = new dbv(List.of(new dcx(), new dcw(List.of(new bvm(bvo.j, 900, 1), new bvm(bvo.v, 100, 1), new bvm(bvo.l, 800, 0)))));

   public void a(czk $$0, bxj $$1) {
      for (dcy $$2 : this.d) {
         $$2.a($$1.dU(), $$0, $$1);
      }
   }

   public List<dcy> a() {
      return this.d;
   }
}
