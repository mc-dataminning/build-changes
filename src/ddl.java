import com.mojang.serialization.MapCodec;

public record ddl() implements ddm {
   public static final ddl a = new ddl();
   public static final MapCodec<ddl> b = MapCodec.unit(a);
   public static final yy<wl, ddl> c = yy.a(a);

   @Override
   public ddm.a<ddl> a() {
      return ddm.a.c;
   }

   @Override
   public boolean a(djx $$0, czy $$1, bxu $$2) {
      return $$2.eC();
   }
}
