import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dxf extends dxh {
   public static final Codec<dxf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dxh.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dxf::new)
   );
   private final List<dxh> b;

   public dxf(List<dxh> $$0, dxj.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public iw a(dzu $$0, dal $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dxh $$5 : this.b) {
         iw $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new iw($$2, $$3, $$4);
   }

   @Override
   public List<dzt.c> a(dzu $$0, ht $$1, dal $$2, ate $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public dvs a(dzu $$0, ht $$1, dal $$2) {
      Stream<dvs> $$3 = this.b.stream().filter($$0x -> $$0x != dxa.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return dvs.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dzu $$0, crt $$1, crr $$2, dhy $$3, ht $$4, ht $$5, dal $$6, dvs $$7, ate $$8, boolean $$9) {
      for (dxh $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dxi<?> a() {
      return dxi.b;
   }

   @Override
   public dxh a(dxj.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dxj.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
