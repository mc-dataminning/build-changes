import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class edl extends edn {
   public static final Codec<edl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edn.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, edl::new)
   );
   private final List<edn> b;

   public edl(List<edn> $$0, edp.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jf a(egh $$0, dfr $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (edn $$5 : this.b) {
         jf $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jf($$2, $$3, $$4);
   }

   @Override
   public List<egg.c> a(egh $$0, ib $$1, dfr $$2, awt $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eby a(egh $$0, ib $$1, dfr $$2) {
      Stream<eby> $$3 = this.b.stream().filter($$0x -> $$0x != edg.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eby.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(egh $$0, cwz $$1, cwx $$2, dob $$3, ib $$4, ib $$5, dfr $$6, eby $$7, awt $$8, boolean $$9) {
      for (edn $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public edo<?> a() {
      return edo.b;
   }

   @Override
   public edn a(edp.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(edp.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
