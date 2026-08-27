import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dop extends dds {
   public static final MapCodec<dop> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csy.q.fieldOf("color").forGetter(dds::b), u()).apply($$0, dop::new));
   public static final dtw b = djc.aE;
   private static final Map<iw, exn> c = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         dfc.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         iw.d,
         dfc.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         iw.e,
         dfc.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         iw.f,
         dfc.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(csy $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, iw.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.n();
      dcd $$2 = $$0.q();
      ir $$3 = $$0.a();
      iw[] $$4 = $$0.f();

      for (iw $$5 : $$4) {
         if ($$5.o().d()) {
            iw $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }
}
