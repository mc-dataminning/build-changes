import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eos extends eou {
   public static final MapCodec<eos> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eou.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, eos::new)
   );
   private final List<eou> b;

   public eos(List<eou> $$0, eow.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public km a(erp $$0, dqe $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eou $$5 : this.b) {
         km $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new km($$2, $$3, $$4);
   }

   @Override
   public List<ero.a> a(erp $$0, ji $$1, dqe $$2, azh $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ene a(erp $$0, ji $$1, dqe $$2) {
      Stream<ene> $$3 = this.b.stream().filter($$0x -> $$0x != eon.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ene.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(erp $$0, dhg $$1, dhe $$2, dyt $$3, ji $$4, ji $$5, dqe $$6, ene $$7, azh $$8, eqy $$9, boolean $$10) {
      for (eou $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eov<?> a() {
      return eov.b;
   }

   @Override
   public eou a(eow.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eow.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
