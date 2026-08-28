import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class emx extends emz {
   public static final MapCodec<emx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emz.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, emx::new)
   );
   private final List<emz> b;

   public emx(List<emz> $$0, enb.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kk a(epu $$0, dol $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (emz $$5 : this.b) {
         kk $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kk($$2, $$3, $$4);
   }

   @Override
   public List<ept.c> a(epu $$0, jg $$1, dol $$2, azr $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public elj a(epu $$0, jg $$1, dol $$2) {
      Stream<elj> $$3 = this.b.stream().filter($$0x -> $$0x != ems.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return elj.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(epu $$0, dfs $$1, dfq $$2, dxa $$3, jg $$4, jg $$5, dol $$6, elj $$7, azr $$8, epd $$9, boolean $$10) {
      for (emz $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ena<?> a() {
      return ena.b;
   }

   @Override
   public emz a(enb.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(enb.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
