import com.mojang.serialization.Codec;

public class egh extends egw {
   public static final Codec<egh> a = dmz.b.fieldOf("block_state").xmap(egh::new, $$0 -> $$0.b).codec();
   private final dmz b;

   public egh(dmz $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dmz $$0, axd $$1) {
      return $$0 == this.b;
   }

   @Override
   protected egx<?> a() {
      return egx.c;
   }
}
