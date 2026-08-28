import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cyr(List<czr> d) {
   public static final Codec<cyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(czr.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(cyr::a)).apply($$0, cyr::new)
   );
   public static final zj<ww, cyr> b = zj.a(czr.e.a(zh.a()), cyr::a, cyr::new);
   public static final cyr c = new cyr(List.of(new czq(), new czp(List.of(new btn(btp.j, 900, 1), new btn(btp.v, 100, 1), new btn(btp.l, 800, 0)))));

   public void a(cwf $$0, bve $$1) {
      for (czr $$2 : this.d) {
         $$2.a($$1.dY(), $$0, $$1);
      }
   }

   public List<czr> a() {
      return this.d;
   }
}
