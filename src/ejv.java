import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejv extends ejx {
   public static final MapCodec<ejv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejx.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ejv::new)
   );
   private final List<ejx> b;

   public ejv(List<ejx> $$0, ejz.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ke a(emr $$0, dls $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ejx $$5 : this.b) {
         ke $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ke($$2, $$3, $$4);
   }

   @Override
   public List<emq.c> a(emr $$0, ja $$1, dls $$2, aym $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eii a(emr $$0, ja $$1, dls $$2) {
      Stream<eii> $$3 = this.b.stream().filter($$0x -> $$0x != ejq.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eii.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(emr $$0, dcz $$1, dcx $$2, due $$3, ja $$4, ja $$5, dls $$6, eii $$7, aym $$8, boolean $$9) {
      for (ejx $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ejy<?> a() {
      return ejy.b;
   }

   @Override
   public ejx a(ejz.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ejz.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
