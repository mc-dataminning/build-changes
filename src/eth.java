import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eth extends etj {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etj.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), f()).apply($$0, eth::new)
   );
   private final List<etj> b;

   public eth(List<etj> $$0, etl.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ka a(ewe $$0, dtw $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (etj $$5 : this.b) {
         ka $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ka($$2, $$3, $$4);
   }

   @Override
   public List<ewd.a> a(ewe $$0, iv $$1, dtw $$2, azx $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ert a(ewe $$0, iv $$1, dtw $$2) {
      Stream<ert> $$3 = this.b.stream().filter($$0x -> $$0x != etc.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ert.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ewe $$0, dkw $$1, dkt $$2, edc $$3, iv $$4, iv $$5, dtw $$6, ert $$7, azx $$8, evn $$9, boolean $$10) {
      for (etj $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public etk<?> a() {
      return etk.b;
   }

   @Override
   public etj a(etl.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(etl.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }

   @VisibleForTesting
   public List<etj> b() {
      return this.b;
   }
}
