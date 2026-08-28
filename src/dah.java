import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dah(List<dbi> d) {
   public static final Codec<dah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dbi.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dah::a)).apply($$0, dah::new)
   );
   public static final yt<wg, dah> b = yt.a(dbi.e.a(yr.a()), dah::a, dah::new);
   public static final dah c = new dah(List.of(new dbh(), new dbg(List.of(new buw(buy.j, 900, 1), new buw(buy.v, 100, 1), new buw(buy.l, 800, 0)))));

   public void a(cxy $$0, bwr $$1) {
      for (dbi $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dbi> a() {
      return this.d;
   }
}
