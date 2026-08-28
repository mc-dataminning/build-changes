import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bu(Optional<jk<dgx>> b, cx.d c) {
   public static final Codec<bu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.a(mi.aR).optionalFieldOf("enchantments").forGetter(bu::a), cx.d.d.optionalFieldOf("levels", cx.d.c).forGetter(bu::b))
            .apply($$0, bu::new)
   );

   public bu(jg<dgx> $$0, cx.d $$1) {
      this(Optional.of(jk.a($$0)), $$1);
   }

   public bu(jk<dgx> $$0, cx.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dhd $$0) {
      if (this.b.isPresent()) {
         for (jg<dgx> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != cx.d.c) {
         for (Entry<jg<dgx>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dhd $$0, jg<dgx> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == cx.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jk<dgx>> a() {
      return this.b;
   }

   public cx.d b() {
      return this.c;
   }
}
