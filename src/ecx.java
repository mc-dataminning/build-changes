import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.apache.commons.lang3.tuple.Pair;

public class ecx {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecw.a.lenientOptionalFieldOf("event").forGetter($$0x -> $$0x.b.map(Pair::getLeft)),
               Codec.LONG.fieldOf("tick").forGetter($$0x -> $$0x.b.<Long>map(Pair::getRight).orElse(-1L))
            )
            .apply($$0, ecx::new)
   );
   private Optional<Pair<ecw, Long>> b;

   public ecx(Optional<ecw> $$0, long $$1) {
      this.b = $$0.map($$1x -> Pair.of($$1x, $$1));
   }

   public ecx() {
      this.b = Optional.empty();
   }

   public void a(ecw $$0, long $$1) {
      if (this.b($$0, $$1)) {
         this.b = Optional.of(Pair.of($$0, $$1));
      }
   }

   private boolean b(ecw $$0, long $$1) {
      if (this.b.isEmpty()) {
         return true;
      } else {
         Pair<ecw, Long> $$2 = this.b.get();
         long $$3 = (Long)$$2.getRight();
         if ($$1 != $$3) {
            return false;
         } else {
            ecw $$4 = (ecw)$$2.getLeft();
            if ($$0.b() < $$4.b()) {
               return true;
            } else {
               return $$0.b() > $$4.b() ? false : ecy.a_($$0.a()) > ecy.a_($$4.a());
            }
         }
      }
   }

   public Optional<ecw> a(long $$0) {
      if (this.b.isEmpty()) {
         return Optional.empty();
      } else {
         return this.b.get().getRight() < $$0 ? Optional.of((ecw)this.b.get().getLeft()) : Optional.empty();
      }
   }

   public void a() {
      this.b = Optional.empty();
   }
}
