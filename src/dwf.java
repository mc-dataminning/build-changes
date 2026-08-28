import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwf extends dwa implements dwb {
   public static final MapCodec<dwf> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwb.a.e.fieldOf("weathering_state").forGetter(dwf::q), t()).apply($$0, dwf::new)
   );
   private final dwb.a f;

   @Override
   protected MapCodec<dwf> a() {
      return e;
   }

   protected dwf(dwb.a $$0, eag.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eah $$0) {
      return dwb.c($$0.b()).isPresent();
   }

   public dwb.a q() {
      return this.f;
   }
}
