import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekq extends eld {
   public static final MapCodec<ekq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ecm.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ekq::new)
   );
   private final ecm c;

   private ekq(ecm $$0) {
      this.c = $$0;
   }

   public static ekq a(ecm $$0) {
      return new ekq($$0);
   }

   @Override
   protected boolean a(elc $$0, azs $$1, jh $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public elf<?> b() {
      return elf.a;
   }
}
