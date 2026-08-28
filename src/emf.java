import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emf extends ems {
   public static final MapCodec<emf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edz.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, emf::new)
   );
   private final edz c;

   private emf(edz $$0) {
      this.c = $$0;
   }

   public static emf a(edz $$0) {
      return new emf($$0);
   }

   @Override
   protected boolean a(emr $$0, azh $$1, ji $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public emu<?> b() {
      return emu.a;
   }
}
