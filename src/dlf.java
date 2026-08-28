import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlf extends dkr {
   public static final MapCodec<dlf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(dkr::b), t()).apply($$0, dlf::new));
   public static final eaz b = eap.bd;
   private static final Map<cxw, dma> c = Maps.newHashMap();
   private static final ffc d = dma.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(cxw $$0, dzy.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d;
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(b, Integer.valueOf(ebf.a($$0.i() + 180.0F)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   public static dma a(cxw $$0) {
      return c.getOrDefault($$0, dmc.ji);
   }
}
