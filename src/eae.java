import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eae extends eag {
   public static final Codec<eae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eag.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eae::new)
   );
   private final List<eag> b;

   public eae(List<eag> $$0, eai.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jb a(eda $$0, dcv $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eag $$5 : this.b) {
         jb $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jb($$2, $$3, $$4);
   }

   @Override
   public List<ecz.c> a(eda $$0, hx $$1, dcv $$2, aup $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dyr a(eda $$0, hx $$1, dcv $$2) {
      Stream<dyr> $$3 = this.b.stream().filter($$0x -> $$0x != dzz.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dyr.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eda $$0, cud $$1, cub $$2, dkx $$3, hx $$4, hx $$5, dcv $$6, dyr $$7, aup $$8, boolean $$9) {
      for (eag $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eah<?> a() {
      return eah.b;
   }

   @Override
   public eag a(eai.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eai.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
