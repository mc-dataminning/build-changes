import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class dwi extends dwk {
   public static final Codec<dwi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwk.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, dwi::new)
   );
   private final List<dwk> b;

   public dwi(List<dwk> $$0, dwm.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public ib a(dyx $$0, czc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (dwk $$5 : this.b) {
         ib $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new ib($$2, $$3, $$4);
   }

   @Override
   public List<dyw.c> a(dyx $$0, gw $$1, czc $$2, arx $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public duv a(dyx $$0, gw $$1, czc $$2) {
      Stream<duv> $$3 = this.b.stream().filter($$0x -> $$0x != dwd.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return duv.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(dyx $$0, cqk $$1, cqi $$2, dhb $$3, gw $$4, gw $$5, czc $$6, duv $$7, arx $$8, boolean $$9) {
      for (dwk $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dwl<?> a() {
      return dwl.b;
   }

   @Override
   public dwk a(dwm.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(dwm.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
