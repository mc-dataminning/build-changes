import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czr(List<das> d) {
   public static final Codec<czr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(das.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(czr::a)).apply($$0, czr::new)
   );
   public static final yn<wa, czr> b = yn.a(das.e.a(yl.a()), czr::a, czr::new);
   public static final czr c = new czr(List.of(new dar(), new daq(List.of(new bue(bug.j, 900, 1), new bue(bug.v, 100, 1), new bue(bug.l, 800, 0)))));

   public void a(cxh $$0, bvy $$1) {
      for (das $$2 : this.d) {
         $$2.a($$1.dU(), $$0, $$1);
      }
   }

   public List<das> a() {
      return this.d;
   }
}
