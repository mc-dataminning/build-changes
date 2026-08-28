import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class euz implements euv {
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eux.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, euz::new)
   );
   public static final Codec<euz> b = eux.b.listOf().xmap(euz::new, $$0 -> $$0.c);
   private final List<euv> c;
   private final BiFunction<cvp, eth, cvp> d;

   private euz(List<euv> $$0) {
      this.c = $$0;
      this.d = eux.a($$0);
   }

   public static euz a(List<euv> $$0) {
      return new euz(List.copyOf($$0));
   }

   public cvp a(cvp $$0, eth $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(etn $$0) {
      euv.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public euw<euz> b() {
      return eux.I;
   }
}
