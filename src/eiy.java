import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eiy extends eiw {
   public static final MapCodec<eiy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bpw.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bpw.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eiy::new)
   );
   private final bpw c;
   private final bpw d;

   public static eiy a(bpw $$0, bpw $$1) {
      return new eiy($$0, $$1);
   }

   public static eiy a(bpw $$0) {
      return new eiy(bpt.a(0), $$0);
   }

   public static eiy b(bpw $$0) {
      return new eiy($$0, bpt.a(0));
   }

   private eiy(bpw $$0, bpw $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<jd> a_(eiu $$0, ayw $$1, jd $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new jd($$3, $$4, $$5));
   }

   @Override
   public eix<?> b() {
      return eix.n;
   }
}
