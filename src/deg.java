import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class deg extends dds {
   public static final MapCodec<deg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csy.q.fieldOf("color").forGetter(dds::b), u()).apply($$0, deg::new));
   public static final duc b = dts.ba;
   private static final Map<csy, dfc> c = Maps.newHashMap();
   private static final exn d = dfc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(csy $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return d;
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, Integer.valueOf(dui.a($$0.i() + 180.0F)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.a && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   public static dfc a(csy $$0) {
      return c.getOrDefault($$0, dfe.jD);
   }
}
