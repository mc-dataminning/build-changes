import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class den extends ddz {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csw.q.fieldOf("color").forGetter(ddz::b), u()).apply($$0, den::new));
   public static final dtl b = dtb.ba;
   private static final Map<csw, dfi> c = Maps.newHashMap();
   private static final exa d = dfi.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(csw $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return d;
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(b, Integer.valueOf(dtr.a($$0.i() + 180.0F)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }

   public static dfi a(csw $$0) {
      return c.getOrDefault($$0, dfk.iJ);
   }
}
