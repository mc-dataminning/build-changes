import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dzt extends dzv {
   public static final Codec<dzt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzv.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dzt::new)
   );
   private final List<dzv> b;

   public dzt(List<dzv> $$0, dzx.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public iz a(ecp $$0, dcl $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dzv $$5 : this.b) {
         iz $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new iz($$2, $$3, $$4);
   }

   @Override
   public List<eco.c> a(ecp $$0, hv $$1, dcl $$2, auf $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dyg a(ecp $$0, hv $$1, dcl $$2) {
      Stream<dyg> $$3 = this.b.stream().filter($$0x -> $$0x != dzo.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dyg.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ecp $$0, ctt $$1, ctr $$2, dkm $$3, hv $$4, hv $$5, dcl $$6, dyg $$7, auf $$8, boolean $$9) {
      for (dzv $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dzw<?> a() {
      return dzw.b;
   }

   @Override
   public dzv a(dzx.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dzx.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
