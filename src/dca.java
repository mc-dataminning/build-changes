import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dca extends dbm {
   public static final MapCodec<dca> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqw.q.fieldOf("color").forGetter(dbm::b), u()).apply($$0, dca::new));
   public static final dqy b = dqo.ba;
   private static final Map<cqw, dcv> c = Maps.newHashMap();
   private static final ety d = dcv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(cqw $$0, dpx.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d;
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, Integer.valueOf(dre.a($$0.i() + 180.0F)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   public static dcv a(cqw $$0) {
      return c.getOrDefault($$0, dcx.iJ);
   }
}
