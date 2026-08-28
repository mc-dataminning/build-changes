import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class esa implements erv {
   public static final MapCodec<esa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erx.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, esa::new)
   );
   public static final Codec<esa> b = erx.b.listOf().xmap(esa::new, $$0 -> $$0.c);
   private final List<erv> c;
   private final BiFunction<cup, eqi, cup> d;

   private esa(List<erv> $$0) {
      this.c = $$0;
      this.d = erx.a($$0);
   }

   public static esa a(List<erv> $$0) {
      return new esa(List.copyOf($$0));
   }

   public cup a(cup $$0, eqi $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eqo $$0) {
      erv.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public erw<esa> b() {
      return erx.I;
   }
}
