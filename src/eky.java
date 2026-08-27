import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eky extends ela {
   public static final Codec<eky> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ela.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eky::new)
   );
   private final List<ela> b;

   public eky(List<ela> $$0, elc.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public jv a(enu $$0, dmd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ela $$5 : this.b) {
         jv $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new jv($$2, $$3, $$4);
   }

   @Override
   public List<ent.c> a(enu $$0, ir $$1, dmd $$2, ayt $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ejl a(enu $$0, ir $$1, dmd $$2) {
      Stream<ejl> $$3 = this.b.stream().filter($$0x -> $$0x != ekt.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ejl.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(enu $$0, dcv $$1, dct $$2, duz $$3, ir $$4, ir $$5, dmd $$6, ejl $$7, ayt $$8, boolean $$9) {
      for (ela $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public elb<?> a() {
      return elb.b;
   }

   @Override
   public ela a(elc.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(elc.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
