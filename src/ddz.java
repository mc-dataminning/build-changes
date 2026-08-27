import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddz extends ctw {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckc.q.fieldOf("color").forGetter(ctw::b), u()).apply($$0, ddz::new));
   public static final dih b = cza.aE;
   private static final Map<ib, eks> c = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         cvf.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ib.d,
         cvf.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ib.e,
         cvf.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ib.f,
         cvf.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public ddz(ckc $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ib.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = this.o();
      csi $$2 = $$0.q();
      hx $$3 = $$0.a();
      ib[] $$4 = $$0.f();

      for (ib $$5 : $$4) {
         if ($$5.o().d()) {
            ib $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }
}
