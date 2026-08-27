import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddu extends ctr {
   public static final MapCodec<ddu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cjx.q.fieldOf("color").forGetter(ctr::b), u()).apply($$0, ddu::new));
   public static final dic b = cyv.aE;
   private static final Map<hx, ekn> c = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cva.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hx.d,
         cva.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hx.e,
         cva.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hx.f,
         cva.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   public ddu(cjx $$0, dhh.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = this.o();
      csd $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }
}
