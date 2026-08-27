import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import javax.annotation.Nullable;

public interface bol<F extends K1, Value> {
   bsh<Value> a();

   bsi b();

   @Nullable
   bok<F, Value> a(bkg<?> var1, Optional<Value> var2);

   public static record a<Value>(bsh<Value> a) implements bol<Mu<Unit>, Value> {
      @Override
      public bsi b() {
         return bsi.b;
      }

      @Override
      public bok<Mu<Unit>, Value> a(bkg<?> $$0, Optional<Value> $$1) {
         return $$1.isPresent() ? null : new bok<>($$0, this.a, Const.create(Unit.INSTANCE));
      }
   }

   public static record b<Value>(bsh<Value> a) implements bol<com.mojang.datafixers.kinds.IdF.Mu, Value> {
      @Override
      public bsi b() {
         return bsi.a;
      }

      @Override
      public bok<com.mojang.datafixers.kinds.IdF.Mu, Value> a(bkg<?> $$0, Optional<Value> $$1) {
         return $$1.isEmpty() ? null : new bok<>($$0, this.a, IdF.create($$1.get()));
      }
   }

   public static record c<Value>(bsh<Value> a) implements bol<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> {
      @Override
      public bsi b() {
         return bsi.c;
      }

      @Override
      public bok<com.mojang.datafixers.kinds.OptionalBox.Mu, Value> a(bkg<?> $$0, Optional<Value> $$1) {
         return new bok<>($$0, this.a, OptionalBox.create($$1));
      }
   }
}
