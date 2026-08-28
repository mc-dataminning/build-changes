import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bs(Optional<jv<dcx>> b, dk.d c) {
   public static final Codec<bs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kg.a(mc.aO).optionalFieldOf("enchantments").forGetter(bs::a), dk.d.d.optionalFieldOf("levels", dk.d.c).forGetter(bs::b))
            .apply($$0, bs::new)
   );

   public bs(jr<dcx> $$0, dk.d $$1) {
      this(Optional.of(jv.a($$0)), $$1);
   }

   public bs(jv<dcx> $$0, dk.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(ddd $$0) {
      if (this.b.isPresent()) {
         for (jr<dcx> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != dk.d.c) {
         for (Entry<jr<dcx>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(ddd $$0, jr<dcx> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == dk.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jv<dcx>> a() {
      return this.b;
   }

   public dk.d b() {
      return this.c;
   }
}
