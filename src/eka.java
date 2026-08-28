import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eka extends ekj {
   public static final MapCodec<eka> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(je.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, eka::new)
   );
   private final List<je> c;

   public static eka a(je... $$0) {
      return new eka(List.of($$0));
   }

   private eka(List<je> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<je> a_(ekh $$0, azl $$1, je $$2) {
      int $$3 = kg.a($$2.u());
      int $$4 = kg.a($$2.w());
      boolean $$5 = false;

      for (je $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, je $$2) {
      return $$0 == kg.a($$2.u()) && $$1 == kg.a($$2.w());
   }

   @Override
   public ekk<?> b() {
      return ekk.o;
   }
}
