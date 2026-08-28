import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class emm extends emo {
   public static final MapCodec<emm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emo.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, emm::new)
   );
   private final List<emo> b;

   public emm(List<emo> $$0, emq.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kj a(epj $$0, doa $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (emo $$5 : this.b) {
         kj $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kj($$2, $$3, $$4);
   }

   @Override
   public List<epi.c> a(epj $$0, jf $$1, doa $$2, azn $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eky a(epj $$0, jf $$1, doa $$2) {
      Stream<eky> $$3 = this.b.stream().filter($$0x -> $$0x != emh.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eky.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(epj $$0, dfg $$1, dfe $$2, dwp $$3, jf $$4, jf $$5, doa $$6, eky $$7, azn $$8, eos $$9, boolean $$10) {
      for (emo $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public emp<?> a() {
      return emp.b;
   }

   @Override
   public emo a(emq.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(emq.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
