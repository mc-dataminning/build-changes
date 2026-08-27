import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ead extends eal {
   public static final Codec<ead> a = RecordCodecBuilder.create($$0 -> $$0.group(dzl.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ead::new));
   private final dzl c;

   private ead(dzl $$0) {
      this.c = $$0;
   }

   public static ead a(dzl $$0) {
      return new ead($$0);
   }

   public static ead a(dri $$0, dri $$1) {
      return a(dzo.a($$0, $$1));
   }

   public static ead b(dri $$0, dri $$1) {
      return a(dzn.a($$0, $$1));
   }

   @Override
   public Stream<hz> a_(eaj $$0, awo $$1, hz $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public eam<?> b() {
      return eam.l;
   }
}
