import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class esh extends esj {
   public static final MapCodec<esh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esj.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, esh::new)
   );
   private final List<esj> b;

   public esh(List<esj> $$0, esl.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jz a(eve $$0, dsz $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (esj $$5 : this.b) {
         jz $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jz($$2, $$3, $$4);
   }

   @Override
   public List<evd.a> a(eve $$0, iu $$1, dsz $$2, azv $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eqt a(eve $$0, iu $$1, dsz $$2) {
      Stream<eqt> $$3 = this.b.stream().filter($$0x -> $$0x != esc.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eqt.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eve $$0, djz $$1, djw $$2, ecf $$3, iu $$4, iu $$5, dsz $$6, eqt $$7, azv $$8, eun $$9, boolean $$10) {
      for (esj $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public esk<?> a() {
      return esk.b;
   }

   @Override
   public esj a(esl.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(esl.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
