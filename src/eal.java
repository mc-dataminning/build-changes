import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eal extends ean {
   public static final Codec<eal> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ean.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eal::new)
   );
   private final List<ean> b;

   public eal(List<ean> $$0, eap.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jb a(edh $$0, ddc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ean $$5 : this.b) {
         jb $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jb($$2, $$3, $$4);
   }

   @Override
   public List<edg.c> a(edh $$0, hx $$1, ddc $$2, auv $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dyy a(edh $$0, hx $$1, ddc $$2) {
      Stream<dyy> $$3 = this.b.stream().filter($$0x -> $$0x != eag.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dyy.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(edh $$0, cuk $$1, cui $$2, dle $$3, hx $$4, hx $$5, ddc $$6, dyy $$7, auv $$8, boolean $$9) {
      for (ean $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eao<?> a() {
      return eao.b;
   }

   @Override
   public ean a(eap.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eap.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
