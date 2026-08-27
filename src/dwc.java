import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwc extends dwe {
   public static final Codec<dwc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwe.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwc::new)
   );
   private final List<dwe> b;

   public dwc(List<dwe> $$0, dwg.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ia a(dyr $$0, cyw $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwe $$5 : this.b) {
         ia $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ia($$2, $$3, $$4);
   }

   @Override
   public List<dyq.c> a(dyr $$0, gv $$1, cyw $$2, art $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dup a(dyr $$0, gv $$1, cyw $$2) {
      Stream<dup> $$3 = this.b.stream().filter($$0x -> $$0x != dvx.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dup.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dyr $$0, cqe $$1, cqc $$2, dgv $$3, gv $$4, gv $$5, cyw $$6, dup $$7, art $$8, boolean $$9) {
      for (dwe $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwf<?> a() {
      return dwf.b;
   }

   @Override
   public dwe a(dwg.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwg.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
