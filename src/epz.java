import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class epz extends eqi {
   public static final MapCodec<epz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iu.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, epz::new)
   );
   private final List<iu> c;

   public static epz a(iu... $$0) {
      return new epz(List.of($$0));
   }

   private epz(List<iu> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<iu> a_(eqg $$0, azv $$1, iu $$2) {
      int $$3 = jx.a($$2.u());
      int $$4 = jx.a($$2.w());
      boolean $$5 = false;

      for (iu $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, iu $$2) {
      return $$0 == jx.a($$2.u()) && $$1 == jx.a($$2.w());
   }

   @Override
   public eqj<?> b() {
      return eqj.o;
   }
}
