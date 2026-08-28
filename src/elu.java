import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class elu extends elw {
   public static final MapCodec<elu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(elw.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, elu::new)
   );
   private final List<elw> b;

   public elu(List<elw> $$0, ely.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ki a(eor $$0, dnj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (elw $$5 : this.b) {
         ki $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ki($$2, $$3, $$4);
   }

   @Override
   public List<eoq.c> a(eor $$0, je $$1, dnj $$2, azk $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ekg a(eor $$0, je $$1, dnj $$2) {
      Stream<ekg> $$3 = this.b.stream().filter($$0x -> $$0x != elp.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ekg.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eor $$0, dep $$1, den $$2, dvx $$3, je $$4, je $$5, dnj $$6, ekg $$7, azk $$8, eoa $$9, boolean $$10) {
      for (elw $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public elx<?> a() {
      return elx.b;
   }

   @Override
   public elw a(ely.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ely.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
