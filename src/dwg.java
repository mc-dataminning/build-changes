import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dwg extends dwo {
   public static final Codec<dwg> a = RecordCodecBuilder.create($$0 -> $$0.group(dvo.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dwg::new));
   private final dvo c;

   private dwg(dvo $$0) {
      this.c = $$0;
   }

   public static dwg a(dvo $$0) {
      return new dwg($$0);
   }

   public static dwg a(dnl $$0, dnl $$1) {
      return a(dvr.a($$0, $$1));
   }

   public static dwg b(dnl $$0, dnl $$1) {
      return a(dvq.a($$0, $$1));
   }

   @Override
   public Stream<ht> a_(dwm $$0, ats $$1, ht $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dwp<?> b() {
      return dwp.l;
   }
}
