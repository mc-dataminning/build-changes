import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwe extends dwg {
   public static final Codec<dwe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwg.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwe::new)
   );
   private final List<dwg> b;

   public dwe(List<dwg> $$0, dwi.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public hz a(dyt $$0, cyy $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwg $$5 : this.b) {
         hz $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new hz($$2, $$3, $$4);
   }

   @Override
   public List<dys.c> a(dyt $$0, gu $$1, cyy $$2, aru $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dur a(dyt $$0, gu $$1, cyy $$2) {
      Stream<dur> $$3 = this.b.stream().filter($$0x -> $$0x != dvz.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dur.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dyt $$0, cqg $$1, cqe $$2, dgx $$3, gu $$4, gu $$5, cyy $$6, dur $$7, aru $$8, boolean $$9) {
      for (dwg $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwh<?> a() {
      return dwh.b;
   }

   @Override
   public dwg a(dwi.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwi.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
