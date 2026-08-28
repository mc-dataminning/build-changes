import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class etd implements esz {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etb.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, etd::new)
   );
   public static final Codec<etd> b = etb.b.listOf().xmap(etd::new, $$0 -> $$0.c);
   private final List<esz> c;
   private final BiFunction<cuo, erl, cuo> d;

   private etd(List<esz> $$0) {
      this.c = $$0;
      this.d = etb.a($$0);
   }

   public static etd a(List<esz> $$0) {
      return new etd(List.copyOf($$0));
   }

   public cuo a(cuo $$0, erl $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(err $$0) {
      esz.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eta<etd> b() {
      return etb.I;
   }
}
