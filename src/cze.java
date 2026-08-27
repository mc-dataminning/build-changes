import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cze extends czd {
   public static final MapCodec<cze> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kc.f.q().fieldOf("host").forGetter(czd::b), u()).apply($$0, cze::new));

   @Override
   public MapCodec<cze> a() {
      return b;
   }

   public cze(cvf $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dbq.i, ib.a.b));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return dbq.b($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(dbq.i);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(dbq.i, $$0.k().o());
   }
}
