import com.mojang.serialization.Codec;

public class dwq extends dwh {
   public static final Codec<dwq> b = djp.b.fieldOf("state").xmap(dwq::new, $$0 -> $$0.c).codec();
   private final djp c;

   protected dwq(djp $$0) {
      this.c = $$0;
   }

   @Override
   protected dwi<?> a() {
      return dwi.a;
   }

   @Override
   public djp a(auw $$0, hx $$1) {
      return this.c;
   }
}
