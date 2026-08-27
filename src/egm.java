import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class egm extends ego {
   public static final Codec<egm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ego.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, egm::new)
   );
   private final List<ego> b;

   public egm(List<ego> $$0, egq.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jg a(eji $$0, dik $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ego $$5 : this.b) {
         jg $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jg($$2, $$3, $$4);
   }

   @Override
   public List<ejh.c> a(eji $$0, ib $$1, dik $$2, axr $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eez a(eji $$0, ib $$1, dik $$2) {
      Stream<eez> $$3 = this.b.stream().filter($$0x -> $$0x != egh.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eez.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eji $$0, czs $$1, czq $$2, dqw $$3, ib $$4, ib $$5, dik $$6, eez $$7, axr $$8, boolean $$9) {
      for (ego $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public egp<?> a() {
      return egp.b;
   }

   @Override
   public ego a(egq.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(egq.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
