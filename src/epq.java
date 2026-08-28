import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class epq extends eps {
   public static final MapCodec<epq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eps.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, epq::new)
   );
   private final List<eps> b;

   public epq(List<eps> $$0, epu.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kl a(esn $$0, drc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eps $$5 : this.b) {
         kl $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kl($$2, $$3, $$4);
   }

   @Override
   public List<esm.a> a(esn $$0, jh $$1, drc $$2, bam $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eoc a(esn $$0, jh $$1, drc $$2) {
      Stream<eoc> $$3 = this.b.stream().filter($$0x -> $$0x != epl.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eoc.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(esn $$0, dig $$1, die $$2, dzr $$3, jh $$4, jh $$5, drc $$6, eoc $$7, bam $$8, erw $$9, boolean $$10) {
      for (eps $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ept<?> a() {
      return ept.b;
   }

   @Override
   public eps a(epu.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(epu.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
