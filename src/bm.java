import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bm(Optional<iw<cyg>> b, ct.d c) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(ld.f.r(), "enchantment").forGetter(bm::a), axh.a(ct.d.d, "levels", ct.d.c).forGetter(bm::b)).apply($$0, bm::new)
   );

   public bm(cyg $$0, ct.d $$1) {
      this(Optional.of($$0.l()), $$1);
   }

   public boolean a(cyl $$0) {
      if (this.b.isPresent()) {
         cyg $$1 = this.b.get().a();
         int $$2 = $$0.a($$1);
         if ($$2 == 0) {
            return false;
         }

         if (this.c != ct.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != ct.d.c) {
         for (Entry<iw<cyg>> $$3 : $$0.b()) {
            if (this.c.d($$3.getIntValue())) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<iw<cyg>> a() {
      return this.b;
   }

   public ct.d b() {
      return this.c;
   }
}
