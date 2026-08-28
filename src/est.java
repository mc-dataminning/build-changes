import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class est extends esv {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esv.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), f()).apply($$0, est::new)
   );
   private final List<esv> b;

   public est(List<esv> $$0, esx.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ka a(evq $$0, dtl $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (esv $$5 : this.b) {
         ka $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ka($$2, $$3, $$4);
   }

   @Override
   public List<evp.a> a(evq $$0, iv $$1, dtl $$2, azv $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public erf a(evq $$0, iv $$1, dtl $$2) {
      Stream<erf> $$3 = this.b.stream().filter($$0x -> $$0x != eso.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return erf.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(evq $$0, dkl $$1, dki $$2, ecr $$3, iv $$4, iv $$5, dtl $$6, erf $$7, azv $$8, euz $$9, boolean $$10) {
      for (esv $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public esw<?> a() {
      return esw.b;
   }

   @Override
   public esv a(esx.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(esx.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }

   @VisibleForTesting
   public List<esv> b() {
      return this.b;
   }
}
