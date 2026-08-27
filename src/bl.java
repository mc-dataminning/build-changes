import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record bl(Optional<hg<cnq>> b, cl.d c) {
   public static final Codec<bl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arh.a(jd.g.r(), "enchantment").forGetter(bl::a), arh.a(cl.d.d, "levels", cl.d.c).forGetter(bl::b)).apply($$0, bl::new)
   );

   public bl(cnq $$0, cl.d $$1) {
      this(Optional.of($$0.j()), $$1);
   }

   public boolean a(Map<cnq, Integer> $$0) {
      if (this.b.isPresent()) {
         cnq $$1 = this.b.get().a();
         if (!$$0.containsKey($$1)) {
            return false;
         }

         int $$2 = $$0.get($$1);
         if (this.c != cl.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != cl.d.c) {
         for (Integer $$3 : $$0.values()) {
            if (this.c.d($$3)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<hg<cnq>> a() {
      return this.b;
   }

   public cl.d b() {
      return this.c;
   }
}
