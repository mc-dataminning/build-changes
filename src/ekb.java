import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ekb extends ekd {
   public static final MapCodec<ekb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ekd.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ekb::new)
   );
   private final List<ekd> b;

   public ekb(List<ekd> $$0, ekf.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ke a(emx $$0, dlu $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ekd $$5 : this.b) {
         ke $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ke($$2, $$3, $$4);
   }

   @Override
   public List<emw.c> a(emx $$0, ja $$1, dlu $$2, ayo $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eio a(emx $$0, ja $$1, dlu $$2) {
      Stream<eio> $$3 = this.b.stream().filter($$0x -> $$0x != ejw.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eio.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(emx $$0, ddb $$1, dcz $$2, duh $$3, ja $$4, ja $$5, dlu $$6, eio $$7, ayo $$8, boolean $$9) {
      for (ekd $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eke<?> a() {
      return eke.b;
   }

   @Override
   public ekd a(ekf.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ekf.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
