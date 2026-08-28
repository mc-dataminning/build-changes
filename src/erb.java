import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class erb extends erk {
   public static final MapCodec<erb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iw.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, erb::new)
   );
   private final List<iw> c;

   public static erb a(iw... $$0) {
      return new erb(List.of($$0));
   }

   private erb(List<iw> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<iw> a_(eri $$0, azz $$1, iw $$2) {
      int $$3 = jz.a($$2.u());
      int $$4 = jz.a($$2.w());
      boolean $$5 = false;

      for (iw $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, iw $$2) {
      return $$0 == jz.a($$2.u()) && $$1 == jz.a($$2.w());
   }

   @Override
   public erl<?> b() {
      return erl.o;
   }
}
