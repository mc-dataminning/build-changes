import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwq extends dwo {
   public static final Codec<dwq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bic.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bic.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dwq::new)
   );
   private final bic c;
   private final bic d;

   public static dwq a(bic $$0, bic $$1) {
      return new dwq($$0, $$1);
   }

   public static dwq a(bic $$0) {
      return new dwq(bhz.a(0), $$0);
   }

   public static dwq b(bic $$0) {
      return new dwq($$0, bhz.a(0));
   }

   private dwq(bic $$0, bic $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ht> a_(dwm $$0, ats $$1, ht $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ht($$3, $$4, $$5));
   }

   @Override
   public dwp<?> b() {
      return dwp.n;
   }
}
