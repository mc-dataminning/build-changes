import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fcu extends fbu {
   public static final MapCodec<fcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(ddh.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fbt.a(100).forGetter($$0x -> $$0x.c))).apply($$0, fcu::new)
   );
   private final List<ask<String>> b;
   private final fbt c;

   protected fcu(List<fdq> $$0, List<ask<String>> $$1, fbt $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      $$0.a(kk.U, ddh.a, this::a);
      return $$0;
   }

   public ddh a(ddh $$0) {
      List<ask<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fbw<fcu> b() {
      return fbx.O;
   }
}
