import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwl extends dwt {
   public static final Codec<dwl> a = RecordCodecBuilder.create($$0 -> $$0.group(dvt.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dwl::new));
   private final dvt c;

   private dwl(dvt $$0) {
      this.c = $$0;
   }

   public static dwl a(dvt $$0) {
      return new dwl($$0);
   }

   public static dwl a(dnq $$0, dnq $$1) {
      return a(dvw.a($$0, $$1));
   }

   public static dwl b(dnq $$0, dnq $$1) {
      return a(dvv.a($$0, $$1));
   }

   @Override
   public Stream<hx> a_(dwr $$0, atw $$1, hx $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dwu<?> b() {
      return dwu.l;
   }
}
