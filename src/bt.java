import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Optional;

public record bt(Optional<jj<dgl>> b, cw.d c) {
   public static final Codec<bt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ju.a(mh.aR).optionalFieldOf("enchantments").forGetter(bt::a), cw.d.d.optionalFieldOf("levels", cw.d.c).forGetter(bt::b))
            .apply($$0, bt::new)
   );

   public bt(jf<dgl> $$0, cw.d $$1) {
      this(Optional.of(jj.a($$0)), $$1);
   }

   public bt(jj<dgl> $$0, cw.d $$1) {
      this(Optional.of($$0), $$1);
   }

   public boolean a(dgr $$0) {
      if (this.b.isPresent()) {
         for (jf<dgl> $$1 : this.b.get()) {
            if (this.a($$0, $$1)) {
               return true;
            }
         }

         return false;
      } else if (this.c != cw.d.c) {
         for (Entry<jf<dgl>> $$2 : $$0.b()) {
            if (this.c.d($$2.getIntValue())) {
               return true;
            }
         }

         return false;
      } else {
         return !$$0.d();
      }
   }

   private boolean a(dgr $$0, jf<dgl> $$1) {
      int $$2 = $$0.a($$1);
      if ($$2 == 0) {
         return false;
      } else {
         return this.c == cw.d.c ? true : this.c.d($$2);
      }
   }

   public Optional<jj<dgl>> a() {
      return this.b;
   }

   public cw.d b() {
      return this.c;
   }
}
