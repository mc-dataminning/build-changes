import com.mojang.serialization.Codec;

public class dwb extends dvs {
   public static final Codec<dwb> b = dja.b.fieldOf("state").xmap(dwb::new, $$0 -> $$0.c).codec();
   private final dja c;

   protected dwb(dja $$0) {
      this.c = $$0;
   }

   @Override
   protected dvt<?> a() {
      return dvt.a;
   }

   @Override
   public dja a(aup $$0, hx $$1) {
      return this.c;
   }
}
