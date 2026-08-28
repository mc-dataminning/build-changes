import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class epg extends epp {
   public static final MapCodec<epg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iu.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, epg::new)
   );
   private final List<iu> c;

   public static epg a(iu... $$0) {
      return new epg(List.of($$0));
   }

   private epg(List<iu> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<iu> a_(epn $$0, azt $$1, iu $$2) {
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
   public epq<?> b() {
      return epq.o;
   }
}
