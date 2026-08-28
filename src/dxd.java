import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class dxd {
   public static final Codec<dxd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxc.a.lenientOptionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, dxd::new)
   );
   private Optional<Pair<dxc, Long>> b;

   public dxd(Optional<dxc> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public dxd() {
      this.b = Optional.empty();
   }

   public void a(dxc $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(dxc $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<dxc, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            dxc $$4 = (dxc)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : dxe.a_($$0.a()) > dxe.a_($$4.a());
            }
         }
      }
   }

   public Optional<dxc> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((dxc)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
