import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class exj implements exf {
   public static final MapCodec<exj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exh.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, exj::new)
   );
   public static final Codec<exj> b = exh.b.listOf().xmap(exj::new, $$0 -> $$0.c);
   private final List<exf> c;
   private final BiFunction<cwp, evr, cwp> d;

   private exj(List<exf> $$0) {
      this.c = $$0;
      this.d = exh.a($$0);
   }

   public static exj a(List<exf> $$0) {
      return new exj(List.copyOf($$0));
   }

   public cwp a(cwp $$0, evr $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(evx $$0) {
      exf.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public exg<exj> b() {
      return exh.I;
   }
}
