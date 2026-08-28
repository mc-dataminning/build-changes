import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eke extends ekn {
   public static final MapCodec<eke> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jf.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, eke::new)
   );
   private final List<jf> c;

   public static eke a(jf... $$0) {
      return new eke(List.of($$0));
   }

   private eke(List<jf> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jf> a_(ekl $$0, azn $$1, jf $$2) {
      int $$3 = kh.a($$2.u());
      int $$4 = kh.a($$2.w());
      boolean $$5 = false;

      for (jf $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, jf $$2) {
      return $$0 == kh.a($$2.u()) && $$1 == kh.a($$2.w());
   }

   @Override
   public eko<?> b() {
      return eko.o;
   }
}
