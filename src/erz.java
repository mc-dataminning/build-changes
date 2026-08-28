import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class erz extends esb {
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esb.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, erz::new)
   );
   private final List<esb> b;

   public erz(List<esb> $$0, esd.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jz a(euw $$0, dst $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (esb $$5 : this.b) {
         jz $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jz($$2, $$3, $$4);
   }

   @Override
   public List<euv.a> a(euw $$0, iu $$1, dst $$2, azv $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eql a(euw $$0, iu $$1, dst $$2) {
      Stream<eql> $$3 = this.b.stream().filter($$0x -> $$0x != eru.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eql.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(euw $$0, dju $$1, djr $$2, ebx $$3, iu $$4, iu $$5, dst $$6, eql $$7, azv $$8, euf $$9, boolean $$10) {
      for (esb $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public esc<?> a() {
      return esc.b;
   }

   @Override
   public esb a(esd.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(esd.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
