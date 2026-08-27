import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bog<F extends K1, Value> {
   bsc<Value> a();

   bsd b();

   @Nullable
   bof<F, Value> a(bkb<?> var1, Optional<Value> var2);

   public static record a<Value>(bsc<Value> a) implements bog<Mu<Unit>, Value> {
      @Override
      public bsd b() {
         return bsd.b;
      }

      @Override
      public bof<Mu<Unit>, Value> a(bkb<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bof<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bsc<Value> a) implements bog<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bsd b() {
         return bsd.a;
      }

      @Override
      public bof<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bkb<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bof<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bsc<Value> a) implements bog<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bsd b() {
         return bsd.c;
      }

      @Override
      public bof<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bkb<?> $$0, Optional<Value> $$1) {
         return new bof<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
