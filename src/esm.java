import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class esm implements esi {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esk.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, esm::new)
   );
   public static final Codec<esm> b = esk.b.listOf().xmap(esm::new, $$0 -> $$0.c);
   private final List<esi> c;
   private final BiFunction<cuc, equ, cuc> d;

   private esm(List<esi> $$0) {
      this.c = $$0;
      this.d = esk.a($$0);
   }

   public static esm a(List<esi> $$0) {
      return new esm(List.copyOf($$0));
   }

   public cuc a(cuc $$0, equ $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(era $$0) {
      esi.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public esj<esm> b() {
      return esk.I;
   }
}
