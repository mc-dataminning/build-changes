import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eot extends eov {
   public static final MapCodec<eot> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eov.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, eot::new)
   );
   private final List<eov> b;

   public eot(List<eov> $$0, eox.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public km a(erq $$0, dqf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eov $$5 : this.b) {
         km $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new km($$2, $$3, $$4);
   }

   @Override
   public List<erp.a> a(erq $$0, ji $$1, dqf $$2, azh $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public enf a(erq $$0, ji $$1, dqf $$2) {
      Stream<enf> $$3 = this.b.stream().filter($$0x -> $$0x != eoo.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return enf.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(erq $$0, dhh $$1, dhf $$2, dyu $$3, ji $$4, ji $$5, dqf $$6, enf $$7, azh $$8, eqz $$9, boolean $$10) {
      for (eov $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eow<?> a() {
      return eow.b;
   }

   @Override
   public eov a(eox.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eox.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
