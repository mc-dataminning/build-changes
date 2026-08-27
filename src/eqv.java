import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eqv implements eqr {
   public static final MapCodec<eqv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqt.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eqv::new)
   );
   public static final Codec<eqv> b = eqt.b.listOf().xmap(eqv::new, $$0 -> $$0.c);
   private final List<eqr> c;
   private final BiFunction<cto, epf, cto> d;

   private eqv(List<eqr> $$0) {
      this.c = $$0;
      this.d = eqt.a($$0);
   }

   public static eqv a(List<eqr> $$0) {
      return new eqv(List.copyOf($$0));
   }

   public cto a(cto $$0, epf $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(epl $$0) {
      eqr.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eqs b() {
      return eqt.F;
   }
}
