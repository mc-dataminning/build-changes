import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class far implements fan {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fap.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, far::new)
   );
   public static final Codec<far> b = fap.b.listOf().xmap(far::new, $$0 -> $$0.c);
   private final List<fan> c;
   private final BiFunction<cyy, eyz, cyy> d;

   private far(List<fan> $$0) {
      this.c = $$0;
      this.d = fap.a($$0);
   }

   public static far a(List<fan> $$0) {
      return new far(List.copyOf($$0));
   }

   public cyy a(cyy $$0, eyz $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ezf $$0) {
      fan.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fao<far> b() {
      return fap.I;
   }
}
