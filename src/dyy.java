import com.mojang.serialization.Codec;

public class dyy extends dyq {
   public static final Codec<dyy> a = aqd.a(je.e).fieldOf("tag").xmap(dyy::new, $$0 -> $$0.b).codec();
   private final aqd<csq> b;

   public dyy(aqd<csq> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfe $$0, arx $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyr<?> a() {
      return dyr.d;
   }
}
