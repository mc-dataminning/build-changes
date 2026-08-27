import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class dkt {
   public static final Codec<dkt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dks.a.optionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, dkt::new)
   );
   private Optional<Pair<dks, Long>> b;

   public dkt(Optional<dks> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public dkt() {
      this.b = Optional.empty();
   }

   public void a(dks $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(dks $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<dks, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            dks $$4 = (dks)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : dku.a_($$0.a()) > dku.a_($$4.a());
            }
         }
      }
   }

   public Optional<dks> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((dks)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
