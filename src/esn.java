import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esn extends eru {
   public static final MapCodec<esn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(euo.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, esn::new)
   );
   private final eun b;
   private final boolean c;

   private esn(List<ets> $$0, eun $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public erw<esn> b() {
      return erx.e;
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.a();
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static eru.a<?> a(eun $$0) {
      return a($$1 -> new esn($$1, $$0, false));
   }

   public static eru.a<?> a(eun $$0, boolean $$1) {
      return a($$2 -> new esn($$2, $$0, $$1));
   }
}
