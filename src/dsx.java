import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsx extends dla implements dsw {
   public static final MapCodec<dsx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.e.fieldOf("weathering_state").forGetter(dsx::q), t()).apply($$0, dsx::new)
   );
   private final dsw.a e;

   @Override
   protected MapCodec<dsx> a() {
      return d;
   }

   public dsx(dsw.a $$0, dww.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwx $$0) {
      return dsw.c($$0.b()).isPresent();
   }

   public dsw.a q() {
      return this.e;
   }
}
