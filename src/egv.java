import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class egv extends egx {
   public static final Codec<egv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egx.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, egv::new)
   );
   private final List<egx> b;

   public egv(List<egx> $$0, egz.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ji a(ejr $$0, dit $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (egx $$5 : this.b) {
         ji $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ji($$2, $$3, $$4);
   }

   @Override
   public List<ejq.c> a(ejr $$0, id $$1, dit $$2, axt $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public efi a(ejr $$0, id $$1, dit $$2) {
      Stream<efi> $$3 = this.b.stream().filter($$0x -> $$0x != egq.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return efi.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ejr $$0, dab $$1, czz $$2, drf $$3, id $$4, id $$5, dit $$6, efi $$7, axt $$8, boolean $$9) {
      for (egx $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public egy<?> a() {
      return egy.b;
   }

   @Override
   public egx a(egz.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(egz.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
