import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dym extends dyo {
   public static final Codec<dym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyo.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dym::new)
   );
   private final List<dyo> b;

   public dym(List<dyo> $$0, dyq.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public iw a(ebi $$0, dbm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dyo $$5 : this.b) {
         iw $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new iw($$2, $$3, $$4);
   }

   @Override
   public List<ebh.c> a(ebi $$0, ht $$1, dbm $$2, ats $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dwz a(ebi $$0, ht $$1, dbm $$2) {
      Stream<dwz> $$3 = this.b.stream().filter($$0x -> $$0x != dyh.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dwz.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ebi $$0, csu $$1, css $$2, djf $$3, ht $$4, ht $$5, dbm $$6, dwz $$7, ats $$8, boolean $$9) {
      for (dyo $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dyp<?> a() {
      return dyp.b;
   }

   @Override
   public dyo a(dyq.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dyq.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
