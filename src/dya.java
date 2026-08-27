import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dya extends dyc {
   public static final Codec<dya> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyc.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dya::new)
   );
   private final List<dyc> b;

   public dya(List<dyc> $$0, dye.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public iw a(eaw $$0, dbf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dyc $$5 : this.b) {
         iw $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new iw($$2, $$3, $$4);
   }

   @Override
   public List<eav.c> a(eaw $$0, ht $$1, dbf $$2, ato $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dwn a(eaw $$0, ht $$1, dbf $$2) {
      Stream<dwn> $$3 = this.b.stream().filter($$0x -> $$0x != dxv.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dwn.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eaw $$0, csm $$1, csk $$2, dit $$3, ht $$4, ht $$5, dbf $$6, dwn $$7, ato $$8, boolean $$9) {
      for (dyc $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dyd<?> a() {
      return dyd.b;
   }

   @Override
   public dyc a(dye.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dye.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
