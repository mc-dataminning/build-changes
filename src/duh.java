import com.mojang.serialization.Codec;

public class duh extends dua {
   public static final Codec<duh> b = dhi.b.fieldOf("state").xmap(dhh.a::b, cva::o).xmap(duh::new, $$0 -> $$0.c).codec();
   private final cva c;

   public duh(cva $$0) {
      this.c = $$0;
   }

   @Override
   protected dub<?> a() {
      return dub.f;
   }

   @Override
   public dhi a(ats $$0, ht $$1) {
      hx.a $$2 = hx.a.a($$0);
      return this.c.o().a(dbl.i, $$2);
   }
}
