import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class esc implements erx {
   public static final MapCodec<esc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erz.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, esc::new)
   );
   public static final Codec<esc> b = erz.b.listOf().xmap(esc::new, $$0 -> $$0.c);
   private final List<erx> c;
   private final BiFunction<cur, eqk, cur> d;

   private esc(List<erx> $$0) {
      this.c = $$0;
      this.d = erz.a($$0);
   }

   public static esc a(List<erx> $$0) {
      return new esc(List.copyOf($$0));
   }

   public cur a(cur $$0, eqk $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eqq $$0) {
      erx.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public ery<esc> b() {
      return erz.I;
   }
}
