import com.mojang.serialization.Codec;

public class edi extends eda {
   public static final Codec<edi> a = asw.a(ke.f).fieldOf("tag").xmap(edi::new, $$0 -> $$0.b).codec();
   private final asw<cwq> b;

   public edi(asw<cwq> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djh $$0, auv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected edb<?> a() {
      return edb.d;
   }
}
