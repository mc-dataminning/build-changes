import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ecq extends ecs {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecs.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ecq::new)
   );
   private final List<ecs> b;

   public ecq(List<ecs> $$0, ecu.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jd a(efm $$0, dfe $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ecs $$5 : this.b) {
         jd $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jd($$2, $$3, $$4);
   }

   @Override
   public List<efl.c> a(efm $$0, hz $$1, dfe $$2, awp $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ebd a(efm $$0, hz $$1, dfe $$2) {
      Stream<ebd> $$3 = this.b.stream().filter($$0x -> $$0x != ecl.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ebd.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(efm $$0, cwm $$1, cwk $$2, dng $$3, hz $$4, hz $$5, dfe $$6, ebd $$7, awp $$8, boolean $$9) {
      for (ecs $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ect<?> a() {
      return ect.b;
   }

   @Override
   public ecs a(ecu.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ecu.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
