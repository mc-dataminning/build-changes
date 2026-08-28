import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class faz implements fav {
   public static final MapCodec<faz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fax.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, faz::new)
   );
   public static final Codec<faz> b = fax.b.listOf().xmap(faz::new, $$0 -> $$0.c);
   private final List<fav> c;
   private final BiFunction<czd, ezh, czd> d;

   private faz(List<fav> $$0) {
      this.c = $$0;
      this.d = fax.a($$0);
   }

   public static faz a(List<fav> $$0) {
      return new faz(List.copyOf($$0));
   }

   public czd a(czd $$0, ezh $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ezn $$0) {
      fav.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public faw<faz> b() {
      return fax.I;
   }
}
