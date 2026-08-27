import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eqx implements eqt {
   public static final MapCodec<eqx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqv.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eqx::new)
   );
   public static final Codec<eqx> b = eqv.b.listOf().xmap(eqx::new, $$0 -> $$0.c);
   private final List<eqt> c;
   private final BiFunction<ctq, eph, ctq> d;

   private eqx(List<eqt> $$0) {
      this.c = $$0;
      this.d = eqv.a($$0);
   }

   public static eqx a(List<eqt> $$0) {
      return new eqx(List.copyOf($$0));
   }

   public ctq a(ctq $$0, eph $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(epn $$0) {
      eqt.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public equ b() {
      return eqv.F;
   }
}
