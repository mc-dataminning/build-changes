import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface btp<F extends K1, Value> {
   bxl<Value> a();

   bxm b();

   @Nullable
   bto<F, Value> a(bpj<?> var1, Optional<Value> var2);

   public static record a<Value>(bxl<Value> a) implements btp<Mu<Unit>, Value> {
      @Override
      public bxm b() {
         return bxm.b;
      }

      @Override
      public bto<Mu<Unit>, Value> a(bpj<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bto<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bxl<Value> a) implements btp<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bxm b() {
         return bxm.a;
      }

      @Override
      public bto<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bpj<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bto<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bxl<Value> a) implements btp<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bxm b() {
         return bxm.c;
      }

      @Override
      public bto<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bpj<?> $$0, Optional<Value> $$1) {
         return new bto<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
