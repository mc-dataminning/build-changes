import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ero extends erq {
   public static final MapCodec<ero> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erq.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, ero::new)
   );
   private final List<erq> b;

   public ero(List<erq> $$0, ers.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jz a(eul $$0, dsm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (erq $$5 : this.b) {
         jz $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jz($$2, $$3, $$4);
   }

   @Override
   public List<euk.a> a(eul $$0, iu $$1, dsm $$2, azt $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eqa a(eul $$0, iu $$1, dsm $$2) {
      Stream<eqa> $$3 = this.b.stream().filter($$0x -> $$0x != erj.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eqa.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eul $$0, djo $$1, djl $$2, ebm $$3, iu $$4, iu $$5, dsm $$6, eqa $$7, azt $$8, etu $$9, boolean $$10) {
      for (erq $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public err<?> a() {
      return err.b;
   }

   @Override
   public erq a(ers.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ers.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
