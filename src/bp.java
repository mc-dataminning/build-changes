import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bp(Optional<ji<daa>> b, de.d c) {
   public static final Codec<bp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lp.f.r().optionalFieldOf("enchantment").forGetter(bp::a), de.d.d.optionalFieldOf("levels", de.d.c).forGetter(bp::b)).apply($$0, bp::new)
   );

   public bp(daa $$0, de.d $$1) {
      this(Optional.of($$0.m()), $$1);
   }

   public boolean a(daf $$0) {
      if (this.b.isPresent()) {
         daa $$1 = this.b.get().a();
         int $$2 = $$0.a($$1);
         if ($$2 == 0) {
            return false;
         }

         if (this.c != de.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != de.d.c) {
         for (Entry<ji<daa>> $$3 : $$0.b()) {
            if (this.c.d($$3.getIntValue())) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<ji<daa>> a() {
      return this.b;
   }

   public de.d b() {
      return this.c;
   }
}
