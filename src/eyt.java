import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyt extends eyb {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fau.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eyt::new)
   );
   private final fat b;
   private final boolean c;

   private eyt(List<ezx> $$0, fat $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eyd<eyt> b() {
      return eye.e;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static eyb.a<?> a(fat $$0) {
      return a($$1 -> new eyt($$1, $$0, false));
   }

   public static eyb.a<?> a(fat $$0, boolean $$1) {
      return a($$2 -> new eyt($$2, $$0, $$1));
   }
}
