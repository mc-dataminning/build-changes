import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eat extends eav {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eav.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eat::new)
   );
   private final List<eav> b;

   public eat(List<eav> $$0, eax.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jb a(edp $$0, ddk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eav $$5 : this.b) {
         jb $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jb($$2, $$3, $$4);
   }

   @Override
   public List<edo.c> a(edp $$0, hx $$1, ddk $$2, auw $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dzg a(edp $$0, hx $$1, ddk $$2) {
      Stream<dzg> $$3 = this.b.stream().filter($$0x -> $$0x != eao.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dzg.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(edp $$0, cus $$1, cuq $$2, dlm $$3, hx $$4, hx $$5, ddk $$6, dzg $$7, auw $$8, boolean $$9) {
      for (eav $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eaw<?> a() {
      return eaw.b;
   }

   @Override
   public eav a(eax.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eax.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
