import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bp(Optional<jn<czl>> b, de.d c) {
   public static final Codec<bp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.a(lr.aK).optionalFieldOf("enchantments").forGetter(bp::a), de.d.d.optionalFieldOf("levels", de.d.c).forGetter(bp::b))
            .apply($$0, bp::new)
   );

   public bp(jj<czl> $$0, de.d $$1) {
      this(Optional.of(jn.a($$0)), $$1);
   }

   public bp(jn<czl> $$0, de.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(czr $$0) {
      if (this.b.isPresent()) {
         for (jj<czl> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != de.d.c) {
         for (Entry<jj<czl>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(czr $$0, jj<czl> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == de.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jn<czl>> a() {
      return this.b;
   }

   public de.d b() {
      return this.c;
   }
}
