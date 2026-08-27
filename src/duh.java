import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class duh extends dup {
   public static final Codec<duh> a = RecordCodecBuilder.create($$0 -> $$0.group(dtp.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, duh::new));
   private final dtp c;

   private duh(dtp $$0) {
      this.c = $$0;
   }

   public static duh a(dtp $$0) {
      return new duh($$0);
   }

   public static duh a(dlm $$0, dlm $$1) {
      return a(dts.a($$0, $$1));
   }

   public static duh b(dlm $$0, dlm $$1) {
      return a(dtr.a($$0, $$1));
   }

   @Override
   public Stream<gw> a_(dun $$0, asc $$1, gw $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public duq<?> b() {
      return duq.l;
   }
}
