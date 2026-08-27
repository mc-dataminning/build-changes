import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record bj(Optional<he<cne>> b, cj.d c) {
   public static final Codec<bj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(jb.g.r(), "enchantment").forGetter(bj::a), aqy.a(cj.d.d, "levels", cj.d.c).forGetter(bj::b)).apply($$0, bj::new)
   );

   public bj(cne $$0, cj.d $$1) {
      this(Optional.of($$0.j()), $$1);
   }

   public boolean a(Map<cne, Integer> $$0) {
      if (this.b.isPresent()) {
         cne $$1 = this.b.get().a();
         if (!$$0.containsKey($$1)) {
            return false;
         }

         int $$2 = $$0.get($$1);
         if (this.c != cj.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != cj.d.c) {
         for (Integer $$3 : $$0.values()) {
            if (this.c.d($$3)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<he<cne>> a() {
      return this.b;
   }

   public cj.d b() {
      return this.c;
   }
}
