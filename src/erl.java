import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class erl extends eru {
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iw.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, erl::new)
   );
   private final List<iw> c;

   public static erl a(iw... $$0) {
      return new erl(List.of($$0));
   }

   private erl(List<iw> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
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
   public erv<?> b() {
      return erv.o;
   }
}
