import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class exh implements exd {
   public static final MapCodec<exh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exf.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, exh::new)
   );
   public static final Codec<exh> b = exf.b.listOf().xmap(exh::new, $$0 -> $$0.c);
   private final List<exd> c;
   private final BiFunction<cwn, evp, cwn> d;

   private exh(List<exd> $$0) {
      this.c = $$0;
      this.d = exf.a($$0);
   }

   public static exh a(List<exd> $$0) {
      return new exh(List.copyOf($$0));
   }

   public cwn a(cwn $$0, evp $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(evv $$0) {
      exd.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public exe<exh> b() {
      return exf.I;
   }
}
