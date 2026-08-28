import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erc extends erk {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqk.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, erc::new));
   private final eqk c;

   private erc(eqk $$0) {
      this.c = $$0;
   }

   public static erc a(eqk $$0) {
      return new erc($$0);
   }

   public static erc a(ehz $$0, ehz $$1) {
      return a(eqn.a($$0, $$1));
   }

   public static erc b(ehz $$0, ehz $$1) {
      return a(eqm.a($$0, $$1));
   }

   @Override
   public Stream<iw> a_(eri $$0, azz $$1, iw $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public erl<?> b() {
      return erl.l;
   }
}
