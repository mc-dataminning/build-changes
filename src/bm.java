import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bm(Optional<iv<cxn>> b, cs.d c) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(lc.f.r(), "enchantment").forGetter(bm::a), axe.a(cs.d.d, "levels", cs.d.c).forGetter(bm::b)).apply($$0, bm::new)
   );

   public bm(cxn $$0, cs.d $$1) {
      this(Optional.of($$0.k()), $$1);
   }

   public boolean a(cxu $$0) {
      if (this.b.isPresent()) {
         cxn $$1 = this.b.get().a();
         int $$2 = $$0.a($$1);
         if ($$2 == 0) {
            return false;
         }

         if (this.c != cs.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != cs.d.c) {
         for (Entry<iv<cxn>> $$3 : $$0.b()) {
            if (this.c.d($$3.getIntValue())) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<iv<cxn>> a() {
      return this.b;
   }

   public cs.d b() {
      return this.c;
   }
}
