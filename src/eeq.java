import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eeq extends eeo {
   public static final Codec<eeq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnf.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bnf.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eeq::new)
   );
   private final bnf c;
   private final bnf d;

   public static eeq a(bnf $$0, bnf $$1) {
      return new eeq($$0, $$1);
   }

   public static eeq a(bnf $$0) {
      return new eeq(bnc.a(0), $$0);
   }

   public static eeq b(bnf $$0) {
      return new eeq($$0, bnc.a(0));
   }

   private eeq(bnf $$0, bnf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ib($$3, $$4, $$5));
   }

   @Override
   public eep<?> b() {
      return eep.n;
   }
}
