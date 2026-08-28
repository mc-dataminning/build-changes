import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ena extends enj {
   public static final MapCodec<ena> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jh.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, ena::new)
   );
   private final List<jh> c;

   public static ena a(jh... $$0) {
      return new ena(List.of($$0));
   }

   private ena(List<jh> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jh> a_(enh $$0, bam $$1, jh $$2) {
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      boolean $$5 = false;

      for (jh $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, jh $$2) {
      return $$0 == kj.a($$2.u()) && $$1 == kj.a($$2.w());
   }

   @Override
   public enk<?> b() {
      return enk.o;
   }
}
