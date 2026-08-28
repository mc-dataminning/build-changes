import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class esg implements esc {
   public static final MapCodec<esg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ese.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, esg::new)
   );
   public static final Codec<esg> b = ese.b.listOf().xmap(esg::new, $$0 -> $$0.c);
   private final List<esc> c;
   private final BiFunction<cua, eqo, cua> d;

   private esg(List<esc> $$0) {
      this.c = $$0;
      this.d = ese.a($$0);
   }

   public static esg a(List<esc> $$0) {
      return new esg(List.copyOf($$0));
   }

   public cua a(cua $$0, eqo $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(equ $$0) {
      esc.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public esd<esg> b() {
      return ese.I;
   }
}
