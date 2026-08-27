import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddy extends ctw {
   public static final MapCodec<ddy> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcb.a.b.fieldOf("kind").forGetter(ctw::b), u()).apply($$0, ddy::new));
   public static final dic d = cyv.aE;
   private static final Map<hx, ekn> b = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cva.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hx.d,
         cva.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hx.f,
         cva.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hx.e,
         cva.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends ddy> a() {
      return c;
   }

   protected ddy(dcb.a $$0, dhh.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = super.a($$0);
      crg $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
