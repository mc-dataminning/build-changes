import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlk extends dkw {
   public static final MapCodec<dlk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(dkw::b), t()).apply($$0, dlk::new));
   public static final ebh b = eax.bd;
   private static final Map<cyb, dmf> c = Maps.newHashMap();
   private static final ffk d = dmf.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(cyb $$0, eag.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d;
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(b, Integer.valueOf(ebn.a($$0.i() + 180.0F)));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.a && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   public static dmf a(cyb $$0) {
      return c.getOrDefault($$0, dmh.jl);
   }
}
