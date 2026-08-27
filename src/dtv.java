import com.mojang.serialization.Codec;

public class dtv extends dto {
   public static final Codec<dtv> b = dgw.b.fieldOf("state").xmap(dgv.a::b, cut::o).xmap(dtv::new, $$0 -> $$0.c).codec();
   private final cut c;

   public dtv(cut $$0) {
      this.c = $$0;
   }

   @Override
   protected dtp<?> a() {
      return dtp.f;
   }

   @Override
   public dgw a(ato $$0, ht $$1) {
      hx.a $$2 = hx.a.a($$0);
      return this.c.o().a(dbe.i, $$2);
   }
}
