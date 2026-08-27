import com.mojang.serialization.Codec;

public class dwg extends dvz {
   public static final Codec<dwg> b = djh.b.fieldOf("state").xmap(djg.a::b, cwq::o).xmap(dwg::new, $$0 -> $$0.c).codec();
   private final cwq c;

   public dwg(cwq $$0) {
      this.c = $$0;
   }

   @Override
   protected dwa<?> a() {
      return dwa.f;
   }

   @Override
   public djh a(auv $$0, hx $$1) {
      ic.a $$2 = ic.a.a($$0);
      return this.c.o().a(ddb.i, $$2);
   }
}
