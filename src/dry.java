import com.mojang.serialization.Codec;

public class dry extends drr {
   public static final Codec<dry> b = dez.b.fieldOf("state").xmap(dey.a::b, csl::n).xmap(dry::new, $$0 -> $$0.c).codec();
   private final csl c;

   public dry(csl $$0) {
      this.c = $$0;
   }

   @Override
   protected drs<?> a() {
      return drs.f;
   }

   @Override
   public dez a(aru $$0, gu $$1) {
      ha.a $$2 = ha.a.a($$0);
      return this.c.n().a(cyw.g, $$2);
   }
}
