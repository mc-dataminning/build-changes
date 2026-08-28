import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eoe extends eon {
   public static final MapCodec<eoe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jj.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, eoe::new)
   );
   private final List<jj> c;

   public static eoe a(jj... $$0) {
      return new eoe(List.of($$0));
   }

   private eoe(List<jj> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jj> a_(eol $$0, azs $$1, jj $$2) {
      int $$3 = kl.a($$2.u());
      int $$4 = kl.a($$2.w());
      boolean $$5 = false;

      for (jj $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, jj $$2) {
      return $$0 == kl.a($$2.u()) && $$1 == kl.a($$2.w());
   }

   @Override
   public eoo<?> b() {
      return eoo.o;
   }
}
