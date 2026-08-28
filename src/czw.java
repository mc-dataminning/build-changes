import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czw(List<daw> d) {
   public static final Codec<czw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(daw.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(czw::a)).apply($$0, czw::new)
   );
   public static final zt<xg, czw> b = zt.a(daw.e.a(zr.a()), czw::a, czw::new);
   public static final czw c = new czw(List.of(new dav(), new dau(List.of(new buk(bum.j, 900, 1), new buk(bum.v, 100, 1), new buk(bum.l, 800, 0)))));

   public void a(cxk $$0, bwb $$1) {
      for (daw $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<daw> a() {
      return this.d;
   }
}
