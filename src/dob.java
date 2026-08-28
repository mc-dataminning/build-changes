import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dob extends dhs {
   public static final MapCodec<dob> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvy.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), t()).apply($$0, dob::new)
   );
   public static final dwa f = dvz.w;

   @Override
   public MapCodec<dob> a() {
      return e;
   }

   protected dob(dvy $$0, dvi.d $$1) {
      super($$1, $$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)));
   }

   @Override
   protected int h(dvj $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dvj a(dvj $$0, int $$1) {
      return $$0.b(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(dfb $$0, jh $$1) {
      Class<? extends bue> $$2 = switch (this.d.f()) {
         case a -> bue.class;
         case b -> bva.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(f);
   }
}
