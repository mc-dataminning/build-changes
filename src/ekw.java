import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ekw extends ele {
   public static final MapCodec<ekw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eke.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ekw::new));
   private final eke c;

   private ekw(eke $$0) {
      this.c = $$0;
   }

   public static ekw a(eke $$0) {
      return new ekw($$0);
   }

   public static ekw a(ebz $$0, ebz $$1) {
      return a(ekh.a($$0, $$1));
   }

   public static ekw b(ebz $$0, ebz $$1) {
      return a(ekg.a($$0, $$1));
   }

   @Override
   public Stream<jh> a_(elc $$0, azs $$1, jh $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public elf<?> b() {
      return elf.l;
   }
}
