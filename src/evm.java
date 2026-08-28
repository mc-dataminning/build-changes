import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evm extends euu {
   public static final MapCodec<evm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(exp.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, evm::new)
   );
   private final exo b;
   private final boolean c;

   private evm(List<ews> $$0, exo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public euw<evm> b() {
      return eux.e;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.b.a();
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      int $$2 = this.c ? $$0.J() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static euu.a<?> a(exo $$0) {
      return a($$1 -> new evm($$1, $$0, false));
   }

   public static euu.a<?> a(exo $$0, boolean $$1) {
      return a($$2 -> new evm($$2, $$0, $$1));
   }
}
