import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwm extends dwt {
   public static final Codec<dwm> a = RecordCodecBuilder.create($$0 -> $$0.group(dmw.a.g.fieldOf("heightmap").forGetter($$0x -> $$0x.c)).apply($$0, dwm::new));
   private final dmw.a c;

   private dwm(dmw.a $$0) {
      this.c = $$0;
   }

   public static dwm a(dmw.a $$0) {
      return new dwm($$0);
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      int $$3 = $$2.u();
      int $$4 = $$2.w();
      int $$5 = $$0.a(this.c, $$3, $$4);
      return $$5 > $$0.c() ? Stream.of(new hx($$3, $$5, $$4)) : Stream.of();
   }

   @Override
   public dwu<?> b() {
      return dwu.k;
   }
}
