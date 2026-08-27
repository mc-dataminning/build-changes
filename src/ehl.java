import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ehl extends ehn {
   public static final Codec<ehl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehn.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ehl::new)
   );
   private final List<ehn> b;

   public ehl(List<ehn> $$0, ehp.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jq a(ekh $$0, dji $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ehn $$5 : this.b) {
         jq $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jq($$2, $$3, $$4);
   }

   @Override
   public List<ekg.c> a(ekh $$0, im $$1, dji $$2, ayd $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public efy a(ekh $$0, im $$1, dji $$2) {
      Stream<efy> $$3 = this.b.stream().filter($$0x -> $$0x != ehg.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return efy.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ekh $$0, dap $$1, dan $$2, drv $$3, im $$4, im $$5, dji $$6, efy $$7, ayd $$8, boolean $$9) {
      for (ehn $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eho<?> a() {
      return eho.b;
   }

   @Override
   public ehn a(ehp.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ehp.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
