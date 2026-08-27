import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bm(Optional<in<cwz>> b, cm.d c) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(kt.f.r(), "enchantment").forGetter(bm::a), awu.a(cm.d.d, "levels", cm.d.c).forGetter(bm::b)).apply($$0, bm::new)
   );

   public bm(cwz $$0, cm.d $$1) {
      this(Optional.of($$0.k()), $$1);
   }

   public boolean a(cxg $$0) {
      if (this.b.isPresent()) {
         cwz $$1 = this.b.get().a();
         int $$2 = $$0.a($$1);
         if ($$2 == 0) {
            return false;
         }

         if (this.c != cm.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != cm.d.c) {
         for (Entry<in<cwz>> $$3 : $$0.b()) {
            if (this.c.d($$3.getIntValue())) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<in<cwz>> a() {
      return this.b;
   }

   public cm.d b() {
      return this.c;
   }
}
