import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqk extends eqi {
   public static final MapCodec<eqk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bti.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bti.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eqk::new)
   );
   private final bti c;
   private final bti d;

   public static eqk a(bti $$0, bti $$1) {
      return new eqk($$0, $$1);
   }

   public static eqk a(bti $$0) {
      return new eqk(btf.a(0), $$0);
   }

   public static eqk b(bti $$0) {
      return new eqk($$0, btf.a(0));
   }

   private eqk(bti $$0, bti $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iu($$3, $$4, $$5));
   }

   @Override
   public eqj<?> b() {
      return eqj.n;
   }
}
