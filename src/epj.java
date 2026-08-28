import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class epj extends epl {
   public static final MapCodec<epj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(epl.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, epj::new)
   );
   private final List<epl> b;

   public epj(List<epl> $$0, epn.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kl a(esg $$0, dqv $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (epl $$5 : this.b) {
         kl $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kl($$2, $$3, $$4);
   }

   @Override
   public List<esf.a> a(esg $$0, jh $$1, dqv $$2, bac $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public env a(esg $$0, jh $$1, dqv $$2) {
      Stream<env> $$3 = this.b.stream().filter($$0x -> $$0x != epe.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return env.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(esg $$0, dhx $$1, dhv $$2, dzk $$3, jh $$4, jh $$5, dqv $$6, env $$7, bac $$8, erp $$9, boolean $$10) {
      for (epl $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public epm<?> a() {
      return epm.b;
   }

   @Override
   public epl a(epn.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(epn.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
