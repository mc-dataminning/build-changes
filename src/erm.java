import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erm extends eru {
   public static final MapCodec<erm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(equ.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, erm::new));
   private final equ c;

   private erm(equ $$0) {
      this.c = $$0;
   }

   public static erm a(equ $$0) {
      return new erm($$0);
   }

   public static erm a(eij $$0, eij $$1) {
      return a(eqx.a($$0, $$1));
   }

   public static erm b(eij $$0, eij $$1) {
      return a(eqw.a($$0, $$1));
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public erv<?> b() {
      return erv.l;
   }
}
