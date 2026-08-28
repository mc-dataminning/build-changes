import com.mojang.serialization.MapCodec;

public class efl extends efe {
   public static final MapCodec<efl> b = dsd.b.fieldOf("state").xmap(dsc.a::b, dfa::o).xmap(efl::new, $$0 -> $$0.c);
   private final dfa c;

   public efl(dfa $$0) {
      this.c = $$0;
   }

   @Override
   protected eff<?> a() {
      return eff.f;
   }

   @Override
   public dsd a(azh $$0, iz $$1) {
      je.a $$2 = je.a.a($$0);
      return this.c.o().a(dlm.i, $$2);
   }
}
