import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eej extends eel {
   public static final Codec<eej> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eel.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eej::new)
   );
   private final List<eel> b;

   public eej(List<eel> $$0, een.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jg a(ehf $$0, dgo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eel $$5 : this.b) {
         jg $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jg($$2, $$3, $$4);
   }

   @Override
   public List<ehe.c> a(ehf $$0, ib $$1, dgo $$2, axd $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ecw a(ehf $$0, ib $$1, dgo $$2) {
      Stream<ecw> $$3 = this.b.stream().filter($$0x -> $$0x != eee.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ecw.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ehf $$0, cxw $$1, cxu $$2, doy $$3, ib $$4, ib $$5, dgo $$6, ecw $$7, axd $$8, boolean $$9) {
      for (eel $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eem<?> a() {
      return eem.b;
   }

   @Override
   public eel a(een.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(een.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
