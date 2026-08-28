import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface byv<F extends K1, Value> {
   ccr<Value> a();

   ccs b();

   @Nullable
   byu<F, Value> a(bup<?> var1, Optional<Value> var2);

   public static record a<Value>(ccr<Value> a) implements byv<Mu<Unit>, Value> {
      @Override
      public ccs b() {
         return ccs.b;
      }

      @Override
      public byu<Mu<Unit>, Value> a(bup<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byu<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(ccr<Value> a) implements byv<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccs b() {
         return ccs.a;
      }

      @Override
      public byu<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bup<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byu<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(ccr<Value> a) implements byv<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccs b() {
         return ccs.c;
      }

      @Override
      public byu<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bup<?> $$0, Optional<Value> $$1) {
         return new byu<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
