import com.mojang.serialization.Codec;

public class dvz extends dvs {
   public static final Codec<dvz> b = dja.b.fieldOf("state").xmap(diz.a::b, cwj::o).xmap(dvz::new, $$0 -> $$0.c).codec();
   private final cwj c;

   public dvz(cwj $$0) {
      this.c = $$0;
   }

   @Override
   protected dvt<?> a() {
      return dvt.f;
   }

   @Override
   public dja a(aup $$0, hx $$1) {
      ic.a $$2 = ic.a.a($$0);
      return this.c.o().a(dcu.i, $$2);
   }
}
