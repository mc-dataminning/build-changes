import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bq(Optional<jt<dbm>> b, di.d c) {
   public static final Codec<bq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ke.a(ly.aM).optionalFieldOf("enchantments").forGetter(bq::a), di.d.d.optionalFieldOf("levels", di.d.c).forGetter(bq::b))
            .apply($$0, bq::new)
   );

   public bq(jp<dbm> $$0, di.d $$1) {
      this(Optional.of(jt.a($$0)), $$1);
   }

   public bq(jt<dbm> $$0, di.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dbs $$0) {
      if (this.b.isPresent()) {
         for (jp<dbm> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != di.d.c) {
         for (Entry<jp<dbm>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dbs $$0, jp<dbm> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == di.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jt<dbm>> a() {
      return this.b;
   }

   public di.d b() {
      return this.c;
   }
}
