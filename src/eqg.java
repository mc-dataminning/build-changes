import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Stream;

public class eqg extends eqp {
   public static final MapCodec<eqg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iv.a.listOf().fieldOf("positions").forGetter($$0x -> $$0x.c)).apply($$0, eqg::new)
   );
   private final List<iv> c;

   public static eqg a(iv... $$0) {
      return new eqg(List.of($$0));
   }

   private eqg(List<iv> $$0) {
      this.c = $$0;
   }

   @Override
   public Stream<iv> a_(eqn $$0, azv $$1, iv $$2) {
      int $$3 = jy.a($$2.u());
      int $$4 = jy.a($$2.w());
      boolean $$5 = false;

      for (iv $$6 : this.c) {
         if (a($$3, $$4, $$6)) {
            $$5 = true;
            break;
         }
      }

      return !$$5 ? Stream.empty() : this.c.stream().filter($$2x -> a($$3, $$4, $$2x));
   }

   private static boolean a(int $$0, int $$1, iv $$2) {
      return $$0 == jy.a($$2.u()) && $$1 == jy.a($$2.w());
   }

   @Override
   public eqq<?> b() {
      return eqq.o;
   }
}
