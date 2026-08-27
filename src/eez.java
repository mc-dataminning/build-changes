import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eez extends eex {
   public static final Codec<eez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnk.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bnk.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, eez::new)
   );
   private final bnk c;
   private final bnk d;

   public static eez a(bnk $$0, bnk $$1) {
      return new eez($$0, $$1);
   }

   public static eez a(bnk $$0) {
      return new eez(bnh.a(0), $$0);
   }

   public static eez b(bnk $$0) {
      return new eez($$0, bnh.a(0));
   }

   private eez(bnk $$0, bnk $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<id> a_(eev $$0, axt $$1, id $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new id($$3, $$4, $$5));
   }

   @Override
   public eey<?> b() {
      return eey.n;
   }
}
