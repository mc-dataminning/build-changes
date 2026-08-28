import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class erz implements eru {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erw.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, erz::new)
   );
   public static final Codec<erz> b = erw.b.listOf().xmap(erz::new, $$0 -> $$0.c);
   private final List<eru> c;
   private final BiFunction<cuo, eqh, cuo> d;

   private erz(List<eru> $$0) {
      this.c = $$0;
      this.d = erw.a($$0);
   }

   public static erz a(List<eru> $$0) {
      return new erz(List.copyOf($$0));
   }

   public cuo a(cuo $$0, eqh $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eqn $$0) {
      eru.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public erv<erz> b() {
      return erw.I;
   }
}
