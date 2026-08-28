import com.mojang.serialization.MapCodec;

public record dbh() implements dbi {
   public static final dbh a = new dbh();
   public static final MapCodec<dbh> b = MapCodec.unit(a);
   public static final yt<wg, dbh> c = yt.a(a);

   @Override
   public dbi.a<dbh> a() {
      return dbi.a.c;
   }

   @Override
   public boolean a(dhp $$0, cxy $$1, bwr $$2) {
      return $$2.eB();
   }
}
