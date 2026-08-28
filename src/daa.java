import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record daa(List<dba> d) {
   public static final Codec<daa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dba.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(daa::a)).apply($$0, daa::new)
   );
   public static final zt<xg, daa> b = zt.a(dba.e.a(zr.a()), daa::a, daa::new);
   public static final daa c = new daa(List.of(new daz(), new day(List.of(new buo(buq.j, 900, 1), new buo(buq.v, 100, 1), new buo(buq.l, 800, 0)))));

   public void a(cxo $$0, bwf $$1) {
      for (dba $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<dba> a() {
      return this.d;
   }
}
