import com.mojang.serialization.Codec;

public class eam extends ebb {
   public static final Codec<eam> a = dhi.b.fieldOf("block_state").xmap(eam::new, $$0 -> $$0.b).codec();
   private final dhi b;

   public eam(dhi $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dhi $$0, ats $$1) {
      return $$0 == this.b;
   }

   @Override
   protected ebc<?> a() {
      return ebc.c;
   }
}
