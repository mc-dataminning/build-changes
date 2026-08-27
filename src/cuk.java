import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cuk extends ctw {
   public static final MapCodec<cuk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckc.q.fieldOf("color").forGetter(ctw::b), u()).apply($$0, cuk::new));
   public static final din b = did.ba;
   private static final Map<ckc, cvf> c = Maps.newHashMap();
   private static final eks d = cvf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cuk> a() {
      return a;
   }

   public cuk(ckc $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return d;
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(b, Integer.valueOf(dit.a($$0.i() + 180.0F)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   public static cvf a(ckc $$0) {
      return c.getOrDefault($$0, cvh.iJ);
   }
}
