import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwe extends dwc {
   public static final Codec<dwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bhv.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bhv.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dwe::new)
   );
   private final bhv c;
   private final bhv d;

   public static dwe a(bhv $$0, bhv $$1) {
      return new dwe($$0, $$1);
   }

   public static dwe a(bhv $$0) {
      return new dwe(bhs.a(0), $$0);
   }

   public static dwe b(bhv $$0) {
      return new dwe($$0, bhs.a(0));
   }

   private dwe(bhv $$0, bhv $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new ht($$3, $$4, $$5));
   }

   @Override
   public dwd<?> b() {
      return dwd.n;
   }
}
