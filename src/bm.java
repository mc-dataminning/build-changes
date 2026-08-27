import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record bm(Optional<il<ctz>> b, cm.d c) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avu.a(kh.f.r(), "enchantment").forGetter(bm::a), avu.a(cm.d.d, "levels", cm.d.c).forGetter(bm::b)).apply($$0, bm::new)
   );

   public bm(ctz $$0, cm.d $$1) {
      this(Optional.of($$0.k()), $$1);
   }

   public boolean a(Map<ctz, Integer> $$0) {
      if (this.b.isPresent()) {
         ctz $$1 = this.b.get().a();
         if (!$$0.containsKey($$1)) {
            return false;
         }

         int $$2 = $$0.get($$1);
         if (this.c != cm.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != cm.d.c) {
         for (Integer $$3 : $$0.values()) {
            if (this.c.d($$3)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<il<ctz>> a() {
      return this.b;
   }

   public cm.d b() {
      return this.c;
   }
}
