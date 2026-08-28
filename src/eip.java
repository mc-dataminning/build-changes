import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eip extends eiy {
   public static final MapCodec<eip> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jd.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, eip::new)
   );
   private final List<jd> c;

   public static eip a(jd... $$0) {
      return new eip(List.of($$0));
   }

   private eip(List<jd> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      int $$3 = kf.a($$2.u());
      int $$4 = kf.a($$2.w());
      boolean $$5 = false;

      for (jd $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, jd $$2) {
      return $$0 == kf.a($$2.u()) && $$1 == kf.a($$2.w());
   }

   @Override
   public eiz<?> b() {
      return eiz.p;
   }
}
