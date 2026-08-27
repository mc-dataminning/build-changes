import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dcs extends csq {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cix.q.fieldOf("color").forGetter(csq::b), t()).apply($$0, dcs::new));
   public static final dgv b = cxu.aE;
   private static final Map<hx, eiy> c = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cua.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         hx.d,
         cua.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         hx.e,
         cua.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         hx.f,
         cua.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public dcs(cix $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = this.o();
      crc $$2 = $$0.q();
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
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }
}
