import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ett extends etv {
   public static final MapCodec<ett> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etv.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), f()).apply($$0, ett::new)
   );
   private final List<etv> b;

   public ett(List<etv> $$0, etx.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kb a(ewq $$0, dui $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (etv $$5 : this.b) {
         kb $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kb($$2, $$3, $$4);
   }

   @Override
   public List<ewp.a> a(ewq $$0, iw $$1, dui $$2, bai $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public esf a(ewq $$0, iw $$1, dui $$2) {
      Stream<esf> $$3 = this.b.stream().filter($$0x -> $$0x != eto.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return esf.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ewq $$0, dli $$1, dlf $$2, edo $$3, iw $$4, iw $$5, dui $$6, esf $$7, bai $$8, evz $$9, boolean $$10) {
      for (etv $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public etw<?> a() {
      return etw.b;
   }

   @Override
   public etv a(etx.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(etx.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }

   @VisibleForTesting
   public List<etv> b() {
      return this.b;
   }
}
