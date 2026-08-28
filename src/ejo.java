import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejo extends ejq {
   public static final MapCodec<ejo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejq.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ejo::new)
   );
   private final List<ejq> b;

   public ejo(List<ejq> $$0, ejs.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kd a(emk $$0, dll $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ejq $$5 : this.b) {
         kd $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kd($$2, $$3, $$4);
   }

   @Override
   public List<emj.c> a(emk $$0, iz $$1, dll $$2, azg $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eib a(emk $$0, iz $$1, dll $$2) {
      Stream<eib> $$3 = this.b.stream().filter($$0x -> $$0x != ejj.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eib.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(emk $$0, dcs $$1, dcq $$2, dty $$3, iz $$4, iz $$5, dll $$6, eib $$7, azg $$8, boolean $$9) {
      for (ejq $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ejr<?> a() {
      return ejr.b;
   }

   @Override
   public ejq a(ejs.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ejs.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
