import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx extends dpw {
   public static final MapCodec<dpx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(mf.e.q().fieldOf("host").forGetter(dpw::b), t()).apply($$0, dpx::new));

   @Override
   public MapCodec<dpx> a() {
      return b;
   }

   public dpx(dlu $$0, dzn.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(dsl.d, ja.a.b));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return dsl.b($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(dsl.d);
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(dsl.d, $$0.k().o());
   }
}
