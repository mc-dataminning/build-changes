import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface blf<F extends K1, Value> {
   bpb<Value> a();

   bpc b();

   @Nullable
   ble<F, Value> a(bha<?> var1, Optional<Value> var2);

   public static record a<Value>(bpb<Value> a) implements blf<Mu<Unit>, Value> {
      @Override
      public bpc b() {
         return bpc.b;
      }

      @Override
      public ble<Mu<Unit>, Value> a(bha<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new ble<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bpb<Value> a) implements blf<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bpc b() {
         return bpc.a;
      }

      @Override
      public ble<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bha<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new ble<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bpb<Value> a) implements blf<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bpc b() {
         return bpc.c;
      }

      @Override
      public ble<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bha<?> $$0, Optional<Value> $$1) {
         return new ble<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
