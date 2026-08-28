import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bs(Optional<ji<dff>> b, cv.d c) {
   public static final Codec<bs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jt.a(mg.aP).optionalFieldOf("enchantments").forGetter(bs::a), cv.d.d.optionalFieldOf("levels", cv.d.c).forGetter(bs::b))
            .apply($$0, bs::new)
   );

   public bs(je<dff> $$0, cv.d $$1) {
      this(Optional.of(ji.a($$0)), $$1);
   }

   public bs(ji<dff> $$0, cv.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dfl $$0) {
      if (this.b.isPresent()) {
         for (je<dff> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != cv.d.c) {
         for (Entry<je<dff>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dfl $$0, je<dff> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == cv.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<ji<dff>> a() {
      return this.b;
   }

   public cv.d b() {
      return this.c;
   }
}
