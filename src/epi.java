import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class epi extends epk {
   public static final MapCodec<epi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epk.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, epi::new)
   );
   private final List<epk> b;

   public epi(List<epk> $$0, epm.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kl a(esf $$0, dqu $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (epk $$5 : this.b) {
         kl $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kl($$2, $$3, $$4);
   }

   @Override
   public List<ese.a> a(esf $$0, jh $$1, dqu $$2, bam $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public enu a(esf $$0, jh $$1, dqu $$2) {
      Stream<enu> $$3 = this.b.stream().filter($$0x -> $$0x != epd.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return enu.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(esf $$0, dhy $$1, dhw $$2, dzj $$3, jh $$4, jh $$5, dqu $$6, enu $$7, bam $$8, ero $$9, boolean $$10) {
      for (epk $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public epl<?> a() {
      return epl.b;
   }

   @Override
   public epk a(epm.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(epm.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
