import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eez implements eev {
   public static final Codec<eez> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eex.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eez::new)
   );
   public static final Codec<eez> b = eex.b.listOf().xmap(eez::new, $$0 -> $$0.c);
   private final List<eev> c;
   private final BiFunction<ckj, edi, ckj> d;

   private eez(List<eev> $$0) {
      this.c = $$0;
      this.d = eex.a($$0);
   }

   public static eez a(List<eev> $$0) {
      return new eez(List.copyOf($$0));
   }

   public ckj a(ckj $$0, edi $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(edr $$0) {
      eev.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eew b() {
      return eex.C;
   }
}
