import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class dny {
   public static final Codec<dny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dnx.a.optionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, dny::new)
   );
   private Optional<Pair<dnx, Long>> b;

   public dny(Optional<dnx> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public dny() {
      this.b = Optional.empty();
   }

   public void a(dnx $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(dnx $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<dnx, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            dnx $$4 = (dnx)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : dnz.a_($$0.a()) > dnz.a_($$4.a());
            }
         }
      }
   }

   public Optional<dnx> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((dnx)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
