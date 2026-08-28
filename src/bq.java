import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bq(Optional<jr<dbk>> b, dh.d c) {
   public static final Codec<bq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kc.a(lv.aM).optionalFieldOf("enchantments").forGetter(bq::a), dh.d.d.optionalFieldOf("levels", dh.d.c).forGetter(bq::b))
            .apply($$0, bq::new)
   );

   public bq(jn<dbk> $$0, dh.d $$1) {
      this(Optional.of(jr.a($$0)), $$1);
   }

   public bq(jr<dbk> $$0, dh.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dbq $$0) {
      if (this.b.isPresent()) {
         for (jn<dbk> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != dh.d.c) {
         for (Entry<jn<dbk>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dbq $$0, jn<dbk> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == dh.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jr<dbk>> a() {
      return this.b;
   }

   public dh.d b() {
      return this.c;
   }
}
