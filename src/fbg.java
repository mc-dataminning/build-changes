import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class fbg implements fbc {
   public static final MapCodec<fbg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbe.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, fbg::new)
   );
   public static final Codec<fbg> b = fbe.b.listOf().xmap(fbg::new, $$0 -> $$0.c);
   private final List<fbc> c;
   private final BiFunction<czk, ezo, czk> d;

   private fbg(List<fbc> $$0) {
      this.c = $$0;
      this.d = fbe.a($$0);
   }

   public static fbg a(List<fbc> $$0) {
      return new fbg(List.copyOf($$0));
   }

   public czk a(czk $$0, ezo $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ezu $$0) {
      fbc.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fbd<fbg> b() {
      return fbe.I;
   }
}
