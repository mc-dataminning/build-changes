import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eor extends eot {
   public static final MapCodec<eor> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eot.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, eor::new)
   );
   private final List<eot> b;

   public eor(List<eot> $$0, eov.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public km a(ero $$0, dqd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eot $$5 : this.b) {
         km $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new km($$2, $$3, $$4);
   }

   @Override
   public List<ern.a> a(ero $$0, ji $$1, dqd $$2, azh $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public end a(ero $$0, ji $$1, dqd $$2) {
      Stream<end> $$3 = this.b.stream().filter($$0x -> $$0x != eom.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return end.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ero $$0, dhf $$1, dhd $$2, dys $$3, ji $$4, ji $$5, dqd $$6, end $$7, azh $$8, eqx $$9, boolean $$10) {
      for (eot $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eou<?> a() {
      return eou.b;
   }

   @Override
   public eot a(eov.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eov.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
