import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class evd implements euz {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evb.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, evd::new)
   );
   public static final Codec<evd> b = evb.b.listOf().xmap(evd::new, $$0 -> $$0.c);
   private final List<euz> c;
   private final BiFunction<cvs, etl, cvs> d;

   private evd(List<euz> $$0) {
      this.c = $$0;
      this.d = evb.a($$0);
   }

   public static evd a(List<euz> $$0) {
      return new evd(List.copyOf($$0));
   }

   public cvs a(cvs $$0, etl $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(etr $$0) {
      euz.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eva<evd> b() {
      return evb.I;
   }
}
