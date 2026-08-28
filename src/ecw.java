import com.mojang.serialization.MapCodec;

public interface ecw<T extends ecv> {
   ecw<ecn> a = a("block", new ecn.a());
   ecw<ecp> b = a("entity", new ecp.a());

   MapCodec<T> a();

   zt<? super xg, T> b();

   static <S extends ecw<T>, T extends ecv> S a(String $$0, S $$1) {
      return kd.a(ma.t, $$0, $$1);
   }
}
