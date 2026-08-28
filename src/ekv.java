import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ekv extends ele {
   public static final MapCodec<ekv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jh.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, ekv::new)
   );
   private final List<jh> c;

   public static ekv a(jh... $$0) {
      return new ekv(List.of($$0));
   }

   private ekv(List<jh> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jh> a_(elc $$0, azs $$1, jh $$2) {
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
   public elf<?> b() {
      return elf.o;
   }
}
