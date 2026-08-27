import com.mojang.serialization.Codec;

public class dwf extends dvy {
   public static final Codec<dwf> b = djg.b.fieldOf("state").xmap(djf.a::b, cwp::o).xmap(dwf::new, $$0 -> $$0.c).codec();
   private final cwp c;

   public dwf(cwp $$0) {
      this.c = $$0;
   }

   @Override
   protected dvz<?> a() {
      return dvz.f;
   }

   @Override
   public djg a(auu $$0, hx $$1) {
      ic.a $$2 = ic.a.a($$0);
      return this.c.o().a(dda.i, $$2);
   }
}
