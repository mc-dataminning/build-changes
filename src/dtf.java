import com.mojang.serialization.MapCodec;

public class dtf extends dnc {
   public static final MapCodec<dtf> c = b(dtf::new);
   protected static final fbu g = djm.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtf> a() {
      return c;
   }

   public dtf(dww.d $$0) {
      super($$0, jn.a, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dov.a($$0);
   }

   @Override
   protected djm b() {
      return djo.pc;
   }

   @Override
   protected boolean h(dwx $$0) {
      return dov.a($$0);
   }
}
