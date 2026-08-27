import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dyr extends dyt {
   public static final Codec<dyr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyt.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dyr::new)
   );
   private final List<dyt> b;

   public dyr(List<dyt> $$0, dyv.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ja a(ebn $$0, dbr $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dyt $$5 : this.b) {
         ja $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ja($$2, $$3, $$4);
   }

   @Override
   public List<ebm.c> a(ebn $$0, hx $$1, dbr $$2, atw $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dxe a(ebn $$0, hx $$1, dbr $$2) {
      Stream<dxe> $$3 = this.b.stream().filter($$0x -> $$0x != dym.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dxe.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ebn $$0, csz $$1, csx $$2, djk $$3, hx $$4, hx $$5, dbr $$6, dxe $$7, atw $$8, boolean $$9) {
      for (dyt $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dyu<?> a() {
      return dyu.b;
   }

   @Override
   public dyt a(dyv.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dyv.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
