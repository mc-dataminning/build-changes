import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewp extends evp {
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czi.d.fieldOf("pages").forGetter($$0x -> $$0x.b), evo.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ewp::new)
   );
   private final List<asf<String>> b;
   private final evo c;

   protected ewp(List<exn> $$0, List<asf<String>> $$1, evo $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwb a(cwb $$0, euc $$1) {
      $$0.a(ku.S, czi.a, this::a);
      return $$0;
   }

   public czi a(czi $$0) {
      List<asf<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public evr<ewp> b() {
      return evs.O;
   }
}
