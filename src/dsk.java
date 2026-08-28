import com.mojang.serialization.MapCodec;

public class dsk extends dnc {
   public static final MapCodec<dsk> c = b(dsk::new);
   public static final fbu g = djm.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dsk> a() {
      return c;
   }

   public dsk(dww.d $$0) {
      super($$0, jn.b, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dov.a($$0);
   }

   @Override
   protected djm b() {
      return djo.pe;
   }

   @Override
   protected boolean h(dwx $$0) {
      return dov.a($$0);
   }
}
