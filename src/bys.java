import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bys<F extends K1, Value> {
   cco<Value> a();

   ccp b();

   @Nullable
   byr<F, Value> a(bum<?> var1, Optional<Value> var2);

   public static record a<Value>(cco<Value> a) implements bys<Mu<Unit>, Value> {
      @Override
      public ccp b() {
         return ccp.b;
      }

      @Override
      public byr<Mu<Unit>, Value> a(bum<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new byr<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cco<Value> a) implements bys<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public ccp b() {
         return ccp.a;
      }

      @Override
      public byr<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bum<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new byr<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cco<Value> a) implements bys<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public ccp b() {
         return ccp.c;
      }

      @Override
      public byr<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bum<?> $$0, Optional<Value> $$1) {
         return new byr<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
