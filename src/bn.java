import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bn(Optional<ja<dad>> b, cu.d c) {
   public static final Codec<bn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(lh.f.r(), "enchantment").forGetter(bn::a), axu.a(cu.d.d, "levels", cu.d.c).forGetter(bn::b)).apply($$0, bn::new)
   );

   public bn(dad $$0, cu.d $$1) {
      this(Optional.of($$0.l()), $$1);
   }

   public boolean a(dai $$0) {
      if (this.b.isPresent()) {
         dad $$1 = this.b.get().a();
         int $$2 = $$0.a($$1);
         if ($$2 == 0) {
            return false;
         }

         if (this.c != cu.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != cu.d.c) {
         for (Entry<ja<dad>> $$3 : $$0.b()) {
            if (this.c.d($$3.getIntValue())) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<ja<dad>> a() {
      return this.b;
   }

   public cu.d b() {
      return this.c;
   }
}
