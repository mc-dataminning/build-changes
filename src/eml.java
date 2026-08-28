import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eml extends emu {
   public static final MapCodec<eml> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ji.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, eml::new)
   );
   private final List<ji> c;

   public static eml a(ji... $$0) {
      return new eml(List.of($$0));
   }

   private eml(List<ji> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<ji> a_(ems $$0, azh $$1, ji $$2) {
      int $$3 = kk.a($$2.u());
      int $$4 = kk.a($$2.w());
      boolean $$5 = false;

      for (ji $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, ji $$2) {
      return $$0 == kk.a($$2.u()) && $$1 == kk.a($$2.w());
   }

   @Override
   public emv<?> b() {
      return emv.o;
   }
}
