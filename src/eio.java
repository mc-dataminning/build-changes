import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eio extends eiq {
   public static final MapCodec<eio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eiq.e.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), d()).apply($$0, eio::new)
   );
   private final List<eiq> b;

   public eio(List<eiq> $$0, eis.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public js a(elk $$0, dkl $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eiq $$5 : this.b) {
         js $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new js($$2, $$3, $$4);
   }

   @Override
   public List<elj.c> a(elk $$0, io $$1, dkl $$2, ayk $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public ehb a(elk $$0, io $$1, dkl $$2) {
      Stream<ehb> $$3 = this.b.stream().filter($$0x -> $$0x != eij.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return ehb.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(elk $$0, dbs $$1, dbq $$2, dsy $$3, io $$4, io $$5, dkl $$6, ehb $$7, ayk $$8, boolean $$9) {
      for (eiq $$10 : this.b) {
         if (!$$10.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eir<?> a() {
      return eir.b;
   }

   @Override
   public eiq a(eis.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eis.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
