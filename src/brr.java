import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface brr<F extends K1, Value> {
   bvn<Value> a();

   bvo b();

   @Nullable
   brq<F, Value> a(bnl<?> var1, Optional<Value> var2);

   public static record a<Value>(bvn<Value> a) implements brr<Mu<Unit>, Value> {
      @Override
      public bvo b() {
         return bvo.b;
      }

      @Override
      public brq<Mu<Unit>, Value> a(bnl<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new brq<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bvn<Value> a) implements brr<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bvo b() {
         return bvo.a;
      }

      @Override
      public brq<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bnl<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new brq<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bvn<Value> a) implements brr<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bvo b() {
         return bvo.c;
      }

      @Override
      public brq<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bnl<?> $$0, Optional<Value> $$1) {
         return new brq<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
