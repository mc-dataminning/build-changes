import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dcl(List<ddo> d) {
   public static final Codec<dcl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ddo.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(dcl::a)).apply($$0, dcl::new)
   );
   public static final za<wn, dcl> b = za.a(ddo.e.a(yy.a()), dcl::a, dcl::new);
   public static final dcl c = new dcl(List.of(new ddn(), new ddm(List.of(new bvz(bwb.j, 900, 1), new bvz(bwb.v, 100, 1), new bvz(bwb.l, 800, 0)))));

   public void a(daa $$0, bxw $$1) {
      for (ddo $$2 : this.d) {
         $$2.a($$1.dV(), $$0, $$1);
      }
   }

   public List<ddo> a() {
      return this.d;
   }
}
