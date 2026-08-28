import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends don {
   public static final MapCodec<doo> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ma.e.q().fieldOf("host").forGetter(don::b), t()).apply($$0, doo::new));

   @Override
   public MapCodec<doo> a() {
      return b;
   }

   public doo(dkm $$0, dxu.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(drb.i, jm.a.b));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return drb.b($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(drb.i);
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(drb.i, $$0.k().o());
   }
}
