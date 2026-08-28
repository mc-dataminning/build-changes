import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eqm extends eqo {
   public static final MapCodec<eqm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eqo.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, eqm::new)
   );
   private final List<eqo> b;

   public eqm(List<eqo> $$0, eqq.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kn a(etj $$0, drm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eqo $$5 : this.b) {
         kn $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kn($$2, $$3, $$4);
   }

   @Override
   public List<eti.a> a(etj $$0, jj $$1, drm $$2, azs $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eoy a(etj $$0, jj $$1, drm $$2) {
      Stream<eoy> $$3 = this.b.stream().filter($$0x -> $$0x != eqh.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eoy.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(etj $$0, dio $$1, dil $$2, eak $$3, jj $$4, jj $$5, drm $$6, eoy $$7, azs $$8, ess $$9, boolean $$10) {
      for (eqo $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eqp<?> a() {
      return eqp.b;
   }

   @Override
   public eqo a(eqq.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eqq.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
