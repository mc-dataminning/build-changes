import com.mojang.serialization.Codec;

public class ecl extends eda {
   public static final Codec<ecl> a = djh.b.fieldOf("block_state").xmap(ecl::new, $$0 -> $$0.b).codec();
   private final djh b;

   public ecl(djh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djh $$0, auv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected edb<?> a() {
      return edb.c;
   }
}
