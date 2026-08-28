import com.mojang.serialization.MapCodec;

public class ewf extends evx {
   public static final MapCodec<ewf> a = axt.a(mh.i).fieldOf("tag").xmap(ewf::new, $$0 -> $$0.b);
   private final axt<dnc> b;

   public ewf(axt<dnc> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebe $$0, azx $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected evy<?> a() {
      return evy.d;
   }
}
