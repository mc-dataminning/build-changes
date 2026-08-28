import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record br(Optional<ju<dbw>> b, dj.d c) {
   public static final Codec<br> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(ma.aM).optionalFieldOf("enchantments").forGetter(br::a), dj.d.d.optionalFieldOf("levels", dj.d.c).forGetter(br::b))
            .apply($$0, br::new)
   );

   public br(jq<dbw> $$0, dj.d $$1) {
      this(Optional.of(ju.a($$0)), $$1);
   }

   public br(ju<dbw> $$0, dj.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dcc $$0) {
      if (this.b.isPresent()) {
         for (jq<dbw> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != dj.d.c) {
         for (Entry<jq<dbw>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dcc $$0, jq<dbw> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == dj.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<ju<dbw>> a() {
      return this.b;
   }

   public dj.d b() {
      return this.c;
   }
}
