import com.mojang.serialization.MapCodec;

public class dkt extends dgv {
   public static final MapCodec<dkt> a = b(dkt::new);
   private static final ewl[] b = new ewl[]{
      dfa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfa.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dkt> a() {
      return a;
   }

   public dkt(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected dby d() {
      return cut.ug;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b[this.g($$0)];
   }
}
