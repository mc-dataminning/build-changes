import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwp extends dwr {
   public static final Codec<dwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwr.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwp::new)
   );
   private final List<dwr> b;

   public dwp(List<dwr> $$0, dwt.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ib a(dze $$0, czj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwr $$5 : this.b) {
         ib $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ib($$2, $$3, $$4);
   }

   @Override
   public List<dzd.c> a(dze $$0, gw $$1, czj $$2, ase $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dvc a(dze $$0, gw $$1, czj $$2) {
      Stream<dvc> $$3 = this.b.stream().filter($$0x -> $$0x != dwk.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dvc.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dze $$0, cqr $$1, cqp $$2, dhi $$3, gw $$4, gw $$5, czj $$6, dvc $$7, ase $$8, boolean $$9) {
      for (dwr $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dws<?> a() {
      return dws.b;
   }

   @Override
   public dwr a(dwt.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwt.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
