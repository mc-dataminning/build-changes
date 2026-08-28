import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class dxo {
   public static final Codec<dxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxn.a.lenientOptionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, dxo::new)
   );
   private Optional<Pair<dxn, Long>> b;

   public dxo(Optional<dxn> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public dxo() {
      this.b = Optional.empty();
   }

   public void a(dxn $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(dxn $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<dxn, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            dxn $$4 = (dxn)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : dxp.a_($$0.a()) > dxp.a_($$4.a());
            }
         }
      }
   }

   public Optional<dxn> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((dxn)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
