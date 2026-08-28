import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eso extends esq {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(esq.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), f()).apply($$0, eso::new)
   );
   private final List<esq> b;

   public eso(List<esq> $$0, ess.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ka a(evl $$0, dtg $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (esq $$5 : this.b) {
         ka $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ka($$2, $$3, $$4);
   }

   @Override
   public List<evk.a> a(evl $$0, iv $$1, dtg $$2, azv $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public era a(evl $$0, iv $$1, dtg $$2) {
      Stream<era> $$3 = this.b.stream().filter($$0x -> $$0x != esj.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return era.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(evl $$0, dkg $$1, dkd $$2, ecm $$3, iv $$4, iv $$5, dtg $$6, era $$7, azv $$8, euu $$9, boolean $$10) {
      for (esq $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public esr<?> a() {
      return esr.b;
   }

   @Override
   public esq a(ess.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ess.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }

   @VisibleForTesting
   public List<esq> b() {
      return this.b;
   }
}
