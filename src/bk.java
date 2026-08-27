import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public record bk(Optional<ih<crc>> b, ck.d c) {
   public static final Codec<bk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(kd.f.r(), "enchantment").forGetter(bk::a), atq.a(ck.d.d, "levels", ck.d.c).forGetter(bk::b)).apply($$0, bk::new)
   );

   public bk(crc $$0, ck.d $$1) {
      this(Optional.of($$0.j()), $$1);
   }

   public boolean a(Map<crc, Integer> $$0) {
      if (this.b.isPresent()) {
         crc $$1 = this.b.get().a();
         if (!$$0.containsKey($$1)) {
            return false;
         }

         int $$2 = $$0.get($$1);
         if (this.c != ck.d.c && !this.c.d($$2)) {
            return false;
         }
      } else if (this.c != ck.d.c) {
         for (Integer $$3 : $$0.values()) {
            if (this.c.d($$3)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public Optional<ih<crc>> a() {
      return this.b;
   }

   public ck.d b() {
      return this.c;
   }
}
