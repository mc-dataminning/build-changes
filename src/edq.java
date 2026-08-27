import com.mojang.serialization.Codec;

public class edq extends edi {
   public static final Codec<edq> a = asx.a(ke.f).fieldOf("tag").xmap(edq::new, $$0 -> $$0.b).codec();
   private final asx<cwy> b;

   public edq(asx<cwy> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(djp $$0, auw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected edj<?> a() {
      return edj.d;
   }
}
