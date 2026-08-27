import com.mojang.serialization.Codec;

public class dzg extends dyz {
   public static final Codec<dzg> b = dme.b.fieldOf("state").xmap(dmd.a::b, czf::o).xmap(dzg::new, $$0 -> $$0.c).codec();
   private final czf c;

   public dzg(czf $$0) {
      this.c = $$0;
   }

   @Override
   protected dza<?> a() {
      return dza.f;
   }

   @Override
   public dme a(awt $$0, ib $$1) {
      ih.a $$2 = ih.a.a($$0);
      return this.c.o().a(dfq.i, $$2);
   }
}
