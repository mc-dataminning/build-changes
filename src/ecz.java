import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class ecz {
   public static final Codec<ecz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecy.a.lenientOptionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, ecz::new)
   );
   private Optional<Pair<ecy, Long>> b;

   public ecz(Optional<ecy> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public ecz() {
      this.b = Optional.empty();
   }

   public void a(ecy $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(ecy $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<ecy, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            ecy $$4 = (ecy)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : eda.a_($$0.a()) > eda.a_($$4.a());
            }
         }
      }
   }

   public Optional<ecy> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((ecy)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
