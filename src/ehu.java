import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ehu extends ehw {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehw.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ehu::new)
   );
   private final List<ehw> b;

   public ehu(List<ehw> $$0, ehy.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jr a(ekq $$0, djr $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ehw $$5 : this.b) {
         jr $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jr($$2, $$3, $$4);
   }

   @Override
   public List<ekp.c> a(ekq $$0, in $$1, djr $$2, ayg $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public egh a(ekq $$0, in $$1, djr $$2) {
      Stream<egh> $$3 = this.b.stream().filter($$0x -> $$0x != ehp.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return egh.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ekq $$0, day $$1, daw $$2, dse $$3, in $$4, in $$5, djr $$6, egh $$7, ayg $$8, boolean $$9) {
      for (ehw $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ehx<?> a() {
      return ehx.b;
   }

   @Override
   public ehw a(ehy.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ehy.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
