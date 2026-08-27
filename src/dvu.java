import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dvu extends dwc {
   public static final Codec<dvu> a = RecordCodecBuilder.create($$0 -> $$0.group(dvc.c.fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dvu::new));
   private final dvc c;

   private dvu(dvc $$0) {
      this.c = $$0;
   }

   public static dvu a(dvc $$0) {
      return new dvu($$0);
   }

   public static dvu a(dmz $$0, dmz $$1) {
      return a(dvf.a($$0, $$1));
   }

   public static dvu b(dmz $$0, dmz $$1) {
      return a(dve.a($$0, $$1));
   }

   @Override
   public Stream<ht> a_(dwa $$0, ato $$1, ht $$2) {
      return Stream.of($$2.h(this.c.a($$1, $$0)));
   }

   @Override
   public dwd<?> b() {
      return dwd.l;
   }
}
