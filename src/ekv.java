import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ekv extends ekx {
   public static final MapCodec<ekv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ekx.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, ekv::new)
   );
   private final List<ekx> b;

   public ekv(List<ekx> $$0, ekz.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kh a(ens $$0, dmm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ekx $$5 : this.b) {
         kh $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kh($$2, $$3, $$4);
   }

   @Override
   public List<enr.c> a(ens $$0, jd $$1, dmm $$2, ayw $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ejh a(ens $$0, jd $$1, dmm $$2) {
      Stream<ejh> $$3 = this.b.stream().filter($$0x -> $$0x != ekq.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ejh.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ens $$0, dds $$1, ddq $$2, duz $$3, jd $$4, jd $$5, dmm $$6, ejh $$7, ayw $$8, enb $$9, boolean $$10) {
      for (ekx $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eky<?> a() {
      return eky.b;
   }

   @Override
   public ekx a(ekz.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(ekz.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
