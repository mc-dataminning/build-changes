import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dul extends duj {
   public static final Codec<dul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgj.b(-16, 16).fieldOf("xz_spread").forGetter($$0x -> $$0x.c), bgj.b(-16, 16).fieldOf("y_spread").forGetter($$0x -> $$0x.d))
            .apply($$0, dul::new)
   );
   private final bgj c;
   private final bgj d;

   public static dul a(bgj $$0, bgj $$1) {
      return new dul($$0, $$1);
   }

   public static dul a(bgj $$0) {
      return new dul(bgg.a(0), $$0);
   }

   public static dul b(bgj $$0) {
      return new dul($$0, bgg.a(0));
   }

   private dul(bgj $$0, bgj $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      int $$3 = $$2.u() + this.c.a($$1);
      int $$4 = $$2.v() + this.d.a($$1);
      int $$5 = $$2.w() + this.c.a($$1);
      return Stream.of(new gw($$3, $$4, $$5));
   }

   @Override
   public duk<?> b() {
      return duk.n;
   }
}
