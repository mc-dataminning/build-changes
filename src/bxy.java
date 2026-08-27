import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bxy<F extends K1, Value> {
   cbu<Value> a();

   cbv b();

   @Nullable
   bxx<F, Value> a(bts<?> var1, Optional<Value> var2);

   public static record a<Value>(cbu<Value> a) implements bxy<Mu<Unit>, Value> {
      @Override
      public cbv b() {
         return cbv.b;
      }

      @Override
      public bxx<Mu<Unit>, Value> a(bts<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bxx<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cbu<Value> a) implements bxy<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cbv b() {
         return cbv.a;
      }

      @Override
      public bxx<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bts<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bxx<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cbu<Value> a) implements bxy<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cbv b() {
         return cbv.c;
      }

      @Override
      public bxx<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bts<?> $$0, Optional<Value> $$1) {
         return new bxx<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
