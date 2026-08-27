import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ego implements egk {
   public static final Codec<ego> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egm.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ego::new)
   );
   public static final Codec<ego> b = egm.b.listOf().xmap(ego::new, $$0 -> $$0.c);
   private final List<egk> c;
   private final BiFunction<clj, eex, clj> d;

   private ego(List<egk> $$0) {
      this.c = $$0;
      this.d = egm.a($$0);
   }

   public static ego a(List<egk> $$0) {
      return new ego(List.copyOf($$0));
   }

   public clj a(clj $$0, eex $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(efg $$0) {
      egk.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.b(".function[" + $$1 + "]"));
      }
   }

   @Override
   public egl b() {
      return egm.C;
   }
}
