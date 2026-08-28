import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class esb implements erw {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ery.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, esb::new)
   );
   public static final Codec<esb> b = ery.b.listOf().xmap(esb::new, $$0 -> $$0.c);
   private final List<erw> c;
   private final BiFunction<cuq, eqj, cuq> d;

   private esb(List<erw> $$0) {
      this.c = $$0;
      this.d = ery.a($$0);
   }

   public static esb a(List<erw> $$0) {
      return new esb(List.copyOf($$0));
   }

   public cuq a(cuq $$0, eqj $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eqp $$0) {
      erw.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public erx<esb> b() {
      return ery.I;
   }
}
