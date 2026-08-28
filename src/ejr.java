import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejr extends ejt {
   public static final MapCodec<ejr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejt.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ejr::new)
   );
   private final List<ejt> b;

   public ejr(List<ejt> $$0, ejv.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kd a(emn $$0, dlo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ejt $$5 : this.b) {
         kd $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kd($$2, $$3, $$4);
   }

   @Override
   public List<emm.c> a(emn $$0, iz $$1, dlo $$2, azh $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eie a(emn $$0, iz $$1, dlo $$2) {
      Stream<eie> $$3 = this.b.stream().filter($$0x -> $$0x != ejm.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eie.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(emn $$0, dcv $$1, dct $$2, dub $$3, iz $$4, iz $$5, dlo $$6, eie $$7, azh $$8, boolean $$9) {
      for (ejt $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eju<?> a() {
      return eju.b;
   }

   @Override
   public ejt a(ejv.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ejv.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
