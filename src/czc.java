import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czc(List<dac> d) {
   public static final Codec<czc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dac.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(czc::a)).apply($$0, czc::new)
   );
   public static final yn<wa, czc> b = yn.a(dac.e.a(yl.a()), czc::a, czc::new);
   public static final czc c = new czc(List.of(new dab(), new daa(List.of(new btr(btt.j, 900, 1), new btr(btt.v, 100, 1), new btr(btt.l, 800, 0)))));

   public void a(cwq $$0, bvi $$1) {
      for (dac $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dac> a() {
      return this.d;
   }
}
