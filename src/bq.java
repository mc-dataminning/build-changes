import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bq(Optional<js<dbn>> b, dh.d c) {
   public static final Codec<bq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kd.a(lw.aN).optionalFieldOf("enchantments").forGetter(bq::a), dh.d.d.optionalFieldOf("levels", dh.d.c).forGetter(bq::b))
            .apply($$0, bq::new)
   );

   public bq(jo<dbn> $$0, dh.d $$1) {
      this(Optional.of(js.a($$0)), $$1);
   }

   public bq(js<dbn> $$0, dh.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dbt $$0) {
      if (this.b.isPresent()) {
         for (jo<dbn> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != dh.d.c) {
         for (Entry<jo<dbn>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dbt $$0, jo<dbn> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == dh.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<js<dbn>> a() {
      return this.b;
   }

   public dh.d b() {
      return this.c;
   }
}
