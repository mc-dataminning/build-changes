import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class eoq extends eos {
   public static final MapCodec<eoq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eos.f.listOf().fieldOf("elements").forGetter($$0x -> $$0x.b), e()).apply($$0, eoq::new)
   );
   private final List<eos> b;

   public eoq(List<eos> $$0, eou.a $$1) {
      super($$1);
      if ($$0.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.b = $$0;
         this.b($$1);
      }
   }

   @Override
   public km a(ern $$0, dqc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      int $$4 = 0;

      for (eos $$5 : this.b) {
         km $$6 = $$5.a($$0, $$1);
         $$2 = Math.max($$2, $$6.u());
         $$3 = Math.max($$3, $$6.v());
         $$4 = Math.max($$4, $$6.w());
      }

      return new km($$2, $$3, $$4);
   }

   @Override
   public List<erm.a> a(ern $$0, ji $$1, dqc $$2, azg $$3) {
      return this.b.get(0).a($$0, $$1, $$2, $$3);
   }

   @Override
   public enc a(ern $$0, ji $$1, dqc $$2) {
      Stream<enc> $$3 = this.b.stream().filter($$0x -> $$0x != eol.b).map($$3x -> $$3x.a($$0, $$1, $$2));
      return enc.b($$3::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
   }

   @Override
   public boolean a(ern $$0, dhe $$1, dhc $$2, dyr $$3, ji $$4, ji $$5, dqc $$6, enc $$7, azg $$8, eqw $$9, boolean $$10) {
      for (eos $$11 : this.b) {
         if (!$$11.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eot<?> a() {
      return eot.b;
   }

   @Override
   public eos a(eou.a $$0) {
      super.a($$0);
      this.b($$0);
      return this;
   }

   @Override
   public String toString() {
      return "List[" + this.b.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   private void b(eou.a $$0) {
      this.b.forEach($$1 -> $$1.a($$0));
   }
}
