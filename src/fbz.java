import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class fbz implements fbv {
   public static final MapCodec<fbz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fbx.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, fbz::new)
   );
   public static final Codec<fbz> b = fbx.b.listOf().xmap(fbz::new, $$0 -> $$0.c);
   private final List<fbv> c;
   private final BiFunction<czy, fah, czy> d;

   private fbz(List<fbv> $$0) {
      this.c = $$0;
      this.d = fbx.a($$0);
   }

   public static fbz a(List<fbv> $$0) {
      return new fbz(List.copyOf($$0));
   }

   public czy a(czy $$0, fah $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(fan $$0) {
      fbv.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fbw<fbz> b() {
      return fbx.I;
   }
}
