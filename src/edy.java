import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class edy implements edu {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edw.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, edy::new)
   );
   public static final Codec<edy> b = edw.b.listOf().xmap(edy::new, $$0 -> $$0.c);
   private final List<edu> c;
   private final BiFunction<ciy, ech, ciy> d;

   private edy(List<edu> $$0) {
      this.c = $$0;
      this.d = edw.a($$0);
   }

   public static edy a(List<edu> $$0) {
      return new edy(List.copyOf($$0));
   }

   public ciy a(ciy $$0, ech $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ecq $$0) {
      edu.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public edv b() {
      return edw.C;
   }
}
