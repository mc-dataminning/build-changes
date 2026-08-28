import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eno extends enq {
   public static final MapCodec<eno> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(enq.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, eno::new)
   );
   private final List<enq> b;

   public eno(List<enq> $$0, ens.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kl a(eql $$0, dpd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (enq $$5 : this.b) {
         kl $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kl($$2, $$3, $$4);
   }

   @Override
   public List<eqk.c> a(eql $$0, jh $$1, dpd $$2, azu $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ema a(eql $$0, jh $$1, dpd $$2) {
      Stream<ema> $$3 = this.b.stream().filter($$0x -> $$0x != enj.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ema.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(eql $$0, dgk $$1, dgi $$2, dxr $$3, jh $$4, jh $$5, dpd $$6, ema $$7, azu $$8, epu $$9, boolean $$10) {
      for (enq $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public enr<?> a() {
      return enr.b;
   }

   @Override
   public enq a(ens.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ens.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
