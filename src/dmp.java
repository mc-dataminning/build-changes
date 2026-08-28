import com.mojang.serialization.MapCodec;

public class dmp extends diq {
   public static final MapCodec<dmp> a = b(dmp::new);
   private static final eyx[] b = new eyx[]{
      dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   public dmp(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected ddr d() {
      return cvo.ui;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b[this.h($$0)];
   }
}
