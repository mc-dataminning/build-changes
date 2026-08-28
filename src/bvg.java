import com.mojang.serialization.Codec;

public enum bvg implements bam {
   a("hurt", awp.uZ),
   b("thorns", awp.uZ),
   c("drowning", awp.va),
   d("burning", awp.vc),
   e("poking", awp.vd),
   f("freezing", awp.vb);

   public static final Codec<bvg> g = bam.a(bvg::values);
   private final String h;
   private final awo i;

   private bvg(final String $$0, final awo $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   @Override
   public String c() {
      return this.h;
   }

   public awo a() {
      return this.i;
   }
}
