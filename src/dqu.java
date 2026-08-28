import com.mojang.serialization.MapCodec;

public class dqu extends dky implements dit {
   public static final MapCodec<dqu> c = b(dqu::new);

   @Override
   public MapCodec<dqu> a() {
      return c;
   }

   public dqu(dvu.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return true;
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      a($$0, $$2, new cwm(this));
   }
}
