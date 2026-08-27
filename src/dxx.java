import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxx extends dxv {
   public static final Codec<dxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(biq.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), biq.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dxx::new)
   );
   private final biq c;
   private final biq d;

   public static dxx a(biq $$0, biq $$1) {
      return new dxx($$0, $$1);
   }

   public static dxx a(biq $$0) {
      return new dxx(bin.a(0), $$0);
   }

   public static dxx b(biq $$0) {
      return new dxx($$0, bin.a(0));
   }

   private dxx(biq $$0, biq $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new hv($$3, $$4, $$5));
   }

   @Override
   public dxw<?> b() {
      return dxw.n;
   }
}
