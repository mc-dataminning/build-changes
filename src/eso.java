import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eso implements esk {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esm.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eso::new)
   );
   public static final Codec<eso> b = esm.b.listOf().xmap(eso::new, $$0 -> $$0.c);
   private final List<esk> c;
   private final BiFunction<cud, eqw, cud> d;

   private eso(List<esk> $$0) {
      this.c = $$0;
      this.d = esm.a($$0);
   }

   public static eso a(List<esk> $$0) {
      return new eso(List.copyOf($$0));
   }

   public cud a(cud $$0, eqw $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(erc $$0) {
      esk.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public esl<eso> b() {
      return esm.I;
   }
}
