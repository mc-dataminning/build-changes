import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bs(Optional<jw<deh>> b, dk.d c) {
   public static final Codec<bs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.a(me.aS).optionalFieldOf("enchantments").forGetter(bs::a), dk.d.d.optionalFieldOf("levels", dk.d.c).forGetter(bs::b))
            .apply($$0, bs::new)
   );

   public bs(js<deh> $$0, dk.d $$1) {
      this(Optional.of(jw.a($$0)), $$1);
   }

   public bs(jw<deh> $$0, dk.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(den $$0) {
      if (this.b.isPresent()) {
         for (js<deh> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != dk.d.c) {
         for (Entry<js<deh>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(den $$0, js<deh> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == dk.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jw<deh>> a() {
      return this.b;
   }

   public dk.d b() {
      return this.c;
   }
}
