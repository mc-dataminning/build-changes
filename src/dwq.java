import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwq extends dmr implements dwn {
   public static final MapCodec<dwq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwn.a.e.fieldOf("weathering_state").forGetter(dnu::c), t()).apply($$0, dwq::new)
   );
   private final dwn.a e;

   @Override
   public MapCodec<dwq> a() {
      return d;
   }

   public dwq(dwn.a $$0, eas.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(eat $$0) {
      return dwn.c($$0.b()).isPresent();
   }

   public dwn.a q() {
      return this.e;
   }
}
