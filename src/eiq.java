import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eiq extends eis {
   public static final MapCodec<eiq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eis.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eiq::new)
   );
   private final List<eis> b;

   public eiq(List<eis> $$0, eiu.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public js a(elm $$0, dkn $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eis $$5 : this.b) {
         js $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new js($$2, $$3, $$4);
   }

   @Override
   public List<ell.c> a(elm $$0, io $$1, dkn $$2, aym $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ehd a(elm $$0, io $$1, dkn $$2) {
      Stream<ehd> $$3 = this.b.stream().filter($$0x -> $$0x != eil.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ehd.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(elm $$0, dbu $$1, dbs $$2, dta $$3, io $$4, io $$5, dkn $$6, ehd $$7, aym $$8, boolean $$9) {
      for (eis $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eit<?> a() {
      return eit.b;
   }

   @Override
   public eis a(eiu.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eiu.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
