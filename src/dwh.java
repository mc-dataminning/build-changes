import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwh extends dwj {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwj.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwh::new)
   );
   private final List<dwj> b;

   public dwh(List<dwj> $$0, dwl.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public hy a(dyw $$0, czn $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwj $$5 : this.b) {
         hy $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new hy($$2, $$3, $$4);
   }

   @Override
   public List<dyv.c> a(dyw $$0, gw $$1, czn $$2, ash $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public duu a(dyw $$0, gw $$1, czn $$2) {
      Stream<duu> $$3 = this.b.stream().filter($$0x -> $$0x != dwc.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return duu.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dyw $$0, cqv $$1, cqt $$2, dha $$3, gw $$4, gw $$5, czn $$6, duu $$7, ash $$8, boolean $$9) {
      for (dwj $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwk<?> a() {
      return dwk.b;
   }

   @Override
   public dwj a(dwl.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwl.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
