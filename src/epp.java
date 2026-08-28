import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class epp extends epr {
   public static final MapCodec<epp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epr.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, epp::new)
   );
   private final List<epr> b;

   public epp(List<epr> $$0, ept.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public km a(esm $$0, dqw $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (epr $$5 : this.b) {
         km $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new km($$2, $$3, $$4);
   }

   @Override
   public List<esl.a> a(esm $$0, ji $$1, dqw $$2, azh $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eob a(esm $$0, ji $$1, dqw $$2) {
      Stream<eob> $$3 = this.b.stream().filter($$0x -> $$0x != epk.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eob.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(esm $$0, dhy $$1, dhv $$2, dzn $$3, ji $$4, ji $$5, dqw $$6, eob $$7, azh $$8, erv $$9, boolean $$10) {
      for (epr $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eps<?> a() {
      return eps.b;
   }

   @Override
   public epr a(ept.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ept.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
