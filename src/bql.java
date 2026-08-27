import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bql<F extends K1, Value> {
   buh<Value> a();

   bui b();

   @Nullable
   bqk<F, Value> a(bmg<?> var1, Optional<Value> var2);

   public static record a<Value>(buh<Value> a) implements bql<Mu<Unit>, Value> {
      @Override
      public bui b() {
         return bui.b;
      }

      @Override
      public bqk<Mu<Unit>, Value> a(bmg<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bqk<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(buh<Value> a) implements bql<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bui b() {
         return bui.a;
      }

      @Override
      public bqk<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bmg<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bqk<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(buh<Value> a) implements bql<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bui b() {
         return bui.c;
      }

      @Override
      public bqk<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bmg<?> $$0, Optional<Value> $$1) {
         return new bqk<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
