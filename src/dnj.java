import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dnj extends dne implements dnf {
   public static final MapCodec<dnj> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnf.a.e.fieldOf("weathering_state").forGetter(dnj::m), u()).apply($$0, dnj::new)
   );
   private final dnf.a f;

   @Override
   protected MapCodec<dnj> a() {
      return e;
   }

   protected dnj(dnf.a $$0, drc.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(drd $$0, aqn $$1, io $$2, aym $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(drd $$0) {
      return dnf.c($$0.b()).isPresent();
   }

   public dnf.a m() {
      return this.f;
   }
}
