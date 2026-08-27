import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eeh extends eej {
   public static final Codec<eeh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eej.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eeh::new)
   );
   private final List<eej> b;

   public eeh(List<eej> $$0, eel.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jg a(ehd $$0, dgm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eej $$5 : this.b) {
         jg $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jg($$2, $$3, $$4);
   }

   @Override
   public List<ehc.c> a(ehd $$0, ib $$1, dgm $$2, axd $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ecu a(ehd $$0, ib $$1, dgm $$2) {
      Stream<ecu> $$3 = this.b.stream().filter($$0x -> $$0x != eec.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ecu.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ehd $$0, cxu $$1, cxs $$2, dow $$3, ib $$4, ib $$5, dgm $$6, ecu $$7, axd $$8, boolean $$9) {
      for (eej $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eek<?> a() {
      return eek.b;
   }

   @Override
   public eej a(eel.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eel.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
