import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ecj extends ecl {
   public static final Codec<ecj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecl.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ecj::new)
   );
   private final List<ecl> b;

   public ecj(List<ecl> $$0, ecn.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jd a(eff $$0, dfa $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ecl $$5 : this.b) {
         jd $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jd($$2, $$3, $$4);
   }

   @Override
   public List<efe.c> a(eff $$0, hz $$1, dfa $$2, awo $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eaw a(eff $$0, hz $$1, dfa $$2) {
      Stream<eaw> $$3 = this.b.stream().filter($$0x -> $$0x != ece.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eaw.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eff $$0, cwi $$1, cwg $$2, dnc $$3, hz $$4, hz $$5, dfa $$6, eaw $$7, awo $$8, boolean $$9) {
      for (ecl $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ecm<?> a() {
      return ecm.b;
   }

   @Override
   public ecl a(ecn.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ecn.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
