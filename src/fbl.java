import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class fbl implements fbh {
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbj.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, fbl::new)
   );
   public static final Codec<fbl> b = fbj.b.listOf().xmap(fbl::new, $$0 -> $$0.c);
   private final List<fbh> c;
   private final BiFunction<czn, ezt, czn> d;

   private fbl(List<fbh> $$0) {
      this.c = $$0;
      this.d = fbj.a($$0);
   }

   public static fbl a(List<fbh> $$0) {
      return new fbl(List.copyOf($$0));
   }

   public czn a(czn $$0, ezt $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ezz $$0) {
      fbh.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fbi<fbl> b() {
      return fbj.I;
   }
}
