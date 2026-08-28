import com.mojang.serialization.MapCodec;

public class epg extends eoy {
   public static final MapCodec<epg> a = axj.a(lv.f).fieldOf("tag").xmap(epg::new, $$0 -> $$0.b);
   private final axj<dhj> b;

   public epg(axj<dhj> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(duo $$0, azl $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eoz<?> a() {
      return eoz.d;
   }
}
