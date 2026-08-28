import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class evu implements evq {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evs.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, evu::new)
   );
   public static final Codec<evu> b = evs.b.listOf().xmap(evu::new, $$0 -> $$0.c);
   private final List<evq> c;
   private final BiFunction<cwb, euc, cwb> d;

   private evu(List<evq> $$0) {
      this.c = $$0;
      this.d = evs.a($$0);
   }

   public static evu a(List<evq> $$0) {
      return new evu(List.copyOf($$0));
   }

   public cwb a(cwb $$0, euc $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eui $$0) {
      evq.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public evr<evu> b() {
      return evs.I;
   }
}
