import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dot extends ddx {
   public static final MapCodec<dot> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dms.a.b.fieldOf("kind").forGetter(ddx::b), u()).apply($$0, dot::new));
   public static final dtw d = djc.aE;
   private static final Map<iw, exn> b = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         dfc.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         iw.d,
         dfc.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         iw.f,
         dfc.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         iw.e,
         dfc.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dot> a() {
      return c;
   }

   protected dot(dms.a $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, iw.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      dbg $$2 = $$0.q();
      ir $$3 = $$0.a();
      iw[] $$4 = $$0.f();

      for (iw $$5 : $$4) {
         if ($$5.o().d()) {
            iw $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
