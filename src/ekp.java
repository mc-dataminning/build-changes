import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class ekp extends eky {
   public static final MapCodec<ekp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jg.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, ekp::new)
   );
   private final List<jg> c;

   public static ekp a(jg... $$0) {
      return new ekp(List.of($$0));
   }

   private ekp(List<jg> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jg> a_(ekw $$0, azr $$1, jg $$2) {
      int $$3 = ki.a($$2.u());
      int $$4 = ki.a($$2.w());
      boolean $$5 = false;

      for (jg $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, jg $$2) {
      return $$0 == ki.a($$2.u()) && $$1 == ki.a($$2.w());
   }

   @Override
   public ekz<?> b() {
      return ekz.o;
   }
}
