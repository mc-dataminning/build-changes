import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ejq extends ejs {
   public static final MapCodec<ejq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ejs.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, ejq::new)
   );
   private final List<ejs> b;

   public ejq(List<ejs> $$0, eju.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public kd a(emm $$0, dln $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (ejs $$5 : this.b) {
         kd $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new kd($$2, $$3, $$4);
   }

   @Override
   public List<eml.c> a(emm $$0, iz $$1, dln $$2, azh $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public eid a(emm $$0, iz $$1, dln $$2) {
      Stream<eid> $$3 = this.b.stream().filter($$0x -> $$0x != ejl.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return eid.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(emm $$0, dcu $$1, dcs $$2, dua $$3, iz $$4, iz $$5, dln $$6, eid $$7, azh $$8, boolean $$9) {
      for (ejs $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ejt<?> a() {
      return ejt.b;
   }

   @Override
   public ejs a(eju.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eju.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
