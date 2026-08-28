import com.mojang.serialization.MapCodec;

public class emf extends elw {
   public static final MapCodec<emf> b = dym.a.fieldOf("state").xmap(emf::new, $$0 -> $$0.c);
   private final dym c;

   protected emf(dym $$0) {
      this.c = $$0;
   }

   @Override
   protected elx<?> a() {
      return elx.a;
   }

   @Override
   public dym a(azs $$0, jj $$1) {
      return this.c;
   }
}
