import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deh extends dct implements deb {
   public static final MapCodec<deh> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deb.a.e.fieldOf("weathering_state").forGetter(cwb::c), dhi.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, deh::new)
   );
   private final deb.a J;

   @Override
   public MapCodec<deh> a() {
      return I;
   }

   public deh(deb.a $$0, dhi $$1, dhh.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dhi $$0) {
      return deb.c($$0.b()).isPresent();
   }

   public deb.a g() {
      return this.J;
   }
}
