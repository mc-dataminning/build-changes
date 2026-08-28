import com.mojang.serialization.MapCodec;

public class efq extends efj {
   public static final MapCodec<efq> b = dsh.b.fieldOf("state").xmap(dsg.a::b, dff::o).xmap(efq::new, $$0 -> $$0.c);
   private final dff c;

   public efq(dff $$0) {
      this.c = $$0;
   }

   @Override
   protected efk<?> a() {
      return efk.f;
   }

   @Override
   public dsh a(aym $$0, ja $$1) {
      jf.a $$2 = jf.a.a($$0);
      return this.c.o().a(dlr.i, $$2);
   }
}
