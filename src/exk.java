import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class exk implements exg {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exi.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, exk::new)
   );
   public static final Codec<exk> b = exi.b.listOf().xmap(exk::new, $$0 -> $$0.c);
   private final List<exg> c;
   private final BiFunction<cwq, evs, cwq> d;

   private exk(List<exg> $$0) {
      this.c = $$0;
      this.d = exi.a($$0);
   }

   public static exk a(List<exg> $$0) {
      return new exk(List.copyOf($$0));
   }

   public cwq a(cwq $$0, evs $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(evy $$0) {
      exg.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public exh<exk> b() {
      return exi.I;
   }
}
