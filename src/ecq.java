import com.mojang.serialization.Codec;

public class ecq extends ecj {
   public static final Codec<ecq> b = dpi.b.fieldOf("state").xmap(dph.a::b, dch::n).xmap(ecq::new, $$0 -> $$0.c).codec();
   private final dch c;

   public ecq(dch $$0) {
      this.c = $$0;
   }

   @Override
   protected eck<?> a() {
      return eck.f;
   }

   @Override
   public dpi a(axt $$0, id $$1) {
      ij.a $$2 = ij.a.a($$0);
      return this.c.n().a(dis.i, $$2);
   }
}
