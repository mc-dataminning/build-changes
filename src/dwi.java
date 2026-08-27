import com.mojang.serialization.Codec;

public class dwi extends dvz {
   public static final Codec<dwi> b = djh.b.fieldOf("state").xmap(dwi::new, $$0 -> $$0.c).codec();
   private final djh c;

   protected dwi(djh $$0) {
      this.c = $$0;
   }

   @Override
   protected dwa<?> a() {
      return dwa.a;
   }

   @Override
   public djh a(auv $$0, hx $$1) {
      return this.c;
   }
}
