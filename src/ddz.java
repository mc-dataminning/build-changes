import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddz extends ddl {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctd.q.fieldOf("color").forGetter(ddl::b), u()).apply($$0, ddz::new));
   public static final dsx b = dsn.ba;
   private static final Map<ctd, deu> c = Maps.newHashMap();
   private static final ewf d = deu.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public ddz(ctd $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return d;
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(b, Integer.valueOf(dtd.a($$0.i() + 180.0F)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   public static deu a(ctd $$0) {
      return c.getOrDefault($$0, dew.iJ);
   }
}
