import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwd extends dwf {
   public static final Codec<dwd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwf.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwd::new)
   );
   private final List<dwf> b;

   public dwd(List<dwf> $$0, dwh.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public hz a(dys $$0, cyx $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwf $$5 : this.b) {
         hz $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new hz($$2, $$3, $$4);
   }

   @Override
   public List<dyr.c> a(dys $$0, gu $$1, cyx $$2, aru $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public duq a(dys $$0, gu $$1, cyx $$2) {
      Stream<duq> $$3 = this.b.stream().filter($$0x -> $$0x != dvy.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return duq.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dys $$0, cqf $$1, cqd $$2, dgw $$3, gu $$4, gu $$5, cyx $$6, duq $$7, aru $$8, boolean $$9) {
      for (dwf $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwg<?> a() {
      return dwg.b;
   }

   @Override
   public dwf a(dwh.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwh.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
