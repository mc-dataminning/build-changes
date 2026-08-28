import com.mojang.serialization.MapCodec;

public class elz extends emq {
   public static final MapCodec<elz> a = lq.e.r().fieldOf("block").xmap(elz::new, $$0 -> $$0.b);
   private final dfh b;

   public elz(dfh $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsk $$0, ayo $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emr<?> a() {
      return emr.b;
   }
}
