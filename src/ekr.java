import com.mojang.serialization.Codec;

public class ekr extends ekj {
   public static final Codec<ekr> a = awg.a(le.f).fieldOf("tag").xmap(ekr::new, $$0 -> $$0.b).codec();
   private final awg<dde> b;

   public ekr(awg<dde> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dqh $$0, ayg $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ekk<?> a() {
      return ekk.d;
   }
}
