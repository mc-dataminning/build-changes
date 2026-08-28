import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ejm extends ejv {
   public static final MapCodec<ejm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(je.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, ejm::new)
   );
   private final List<je> c;

   public static ejm a(je... $$0) {
      return new ejm(List.of($$0));
   }

   private ejm(List<je> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<je> a_(ejt $$0, azk $$1, je $$2) {
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
   public ejw<?> b() {
      return ejw.o;
   }
}
