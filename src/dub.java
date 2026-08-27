import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dub extends duj {
   public static final Codec<dub> a = RecordCodecBuilder.create($$0 -> $$0.group(dtj.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dub::new));
   private final dtj c;

   private dub(dtj $$0) {
      this.c = $$0;
   }

   public static dub a(dtj $$0) {
      return new dub($$0);
   }

   public static dub a(dlg $$0, dlg $$1) {
      return a(dtm.a($$0, $$1));
   }

   public static dub b(dlg $$0, dlg $$1) {
      return a(dtl.a($$0, $$1));
   }

   @Override
   public Stream<gw> a_(duh $$0, ash $$1, gw $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public duk<?> b() {
      return duk.l;
   }
}
