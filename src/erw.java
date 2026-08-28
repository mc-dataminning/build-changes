import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erw extends eru {
   public static final MapCodec<erw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(buh.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), buh.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, erw::new)
   );
   private final buh c;
   private final buh d;

   public static erw a(buh $$0, buh $$1) {
      return new erw($$0, $$1);
   }

   public static erw a(buh $$0) {
      return new erw(bue.a(0), $$0);
   }

   public static erw b(buh $$0) {
      return new erw($$0, bue.a(0));
   }

   private erw(buh $$0, buh $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new iw($$3, $$4, $$5));
   }

   @Override
   public erv<?> b() {
      return erv.n;
   }
}
