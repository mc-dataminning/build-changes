import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eak extends eam {
   public static final Codec<eak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eam.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eak::new)
   );
   private final List<eam> b;

   public eak(List<eam> $$0, eao.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jb a(edg $$0, ddb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eam $$5 : this.b) {
         jb $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jb($$2, $$3, $$4);
   }

   @Override
   public List<edf.c> a(edg $$0, hx $$1, ddb $$2, auu $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dyx a(edg $$0, hx $$1, ddb $$2) {
      Stream<dyx> $$3 = this.b.stream().filter($$0x -> $$0x != eaf.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dyx.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(edg $$0, cuj $$1, cuh $$2, dld $$3, hx $$4, hx $$5, ddb $$6, dyx $$7, auu $$8, boolean $$9) {
      for (eam $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ean<?> a() {
      return ean.b;
   }

   @Override
   public eam a(eao.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eao.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
