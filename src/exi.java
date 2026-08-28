import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class exi implements exe {
   public static final MapCodec<exi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exg.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, exi::new)
   );
   public static final Codec<exi> b = exg.b.listOf().xmap(exi::new, $$0 -> $$0.c);
   private final List<exe> c;
   private final BiFunction<cwo, evq, cwo> d;

   private exi(List<exe> $$0) {
      this.c = $$0;
      this.d = exg.a($$0);
   }

   public static exi a(List<exe> $$0) {
      return new exi(List.copyOf($$0));
   }

   public cwo a(cwo $$0, evq $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(evw $$0) {
      exe.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public exf<exi> b() {
      return exg.I;
   }
}
