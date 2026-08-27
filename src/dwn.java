import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwn extends dwp {
   public static final Codec<dwn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwp.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwn::new)
   );
   private final List<dwp> b;

   public dwn(List<dwp> $$0, dwr.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public hy a(dzc $$0, czh $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwp $$5 : this.b) {
         hy $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new hy($$2, $$3, $$4);
   }

   @Override
   public List<dzb.c> a(dzc $$0, gw $$1, czh $$2, asc $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dva a(dzc $$0, gw $$1, czh $$2) {
      Stream<dva> $$3 = this.b.stream().filter($$0x -> $$0x != dwi.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dva.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dzc $$0, cqp $$1, cqn $$2, dhg $$3, gw $$4, gw $$5, czh $$6, dva $$7, asc $$8, boolean $$9) {
      for (dwp $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwq<?> a() {
      return dwq.b;
   }

   @Override
   public dwp a(dwr.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwr.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
