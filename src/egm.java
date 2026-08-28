import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class egm {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egl.a.lenientOptionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, egm::new)
   );
   private Optional<Pair<egl, Long>> b;

   public egm(Optional<egl> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public egm() {
      this.b = Optional.empty();
   }

   public void a(egl $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(egl $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<egl, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            egl $$4 = (egl)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : egn.a_($$0.a()) > egn.a_($$4.a());
            }
         }
      }
   }

   public Optional<egl> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((egl)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
