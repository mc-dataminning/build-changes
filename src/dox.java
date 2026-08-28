import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dox extends dow {
   public static final MapCodec<dox> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(md.e.q().fieldOf("host").forGetter(dow::b), t()).apply($$0, dox::new));

   @Override
   public MapCodec<dox> a() {
      return b;
   }

   public dox(dku $$0, dyl.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(drl.d, jo.a.b));
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return drl.b($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(drl.d);
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(drl.d, $$0.k().o());
   }
}
