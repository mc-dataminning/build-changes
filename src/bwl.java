import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bwl<F extends K1, Value> {
   cah<Value> a();

   cai b();

   @Nullable
   bwk<F, Value> a(bsf<?> var1, Optional<Value> var2);

   public static record a<Value>(cah<Value> a) implements bwl<Mu<Unit>, Value> {
      @Override
      public cai b() {
         return cai.b;
      }

      @Override
      public bwk<Mu<Unit>, Value> a(bsf<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bwk<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(cah<Value> a) implements bwl<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public cai b() {
         return cai.a;
      }

      @Override
      public bwk<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bsf<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bwk<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(cah<Value> a) implements bwl<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public cai b() {
         return cai.c;
      }

      @Override
      public bwk<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bsf<?> $$0, Optional<Value> $$1) {
         return new bwk<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
