import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dga extends dfm {
   public static final MapCodec<dga> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cue.q.fieldOf("color").forGetter(dfm::b), u()).apply($$0, dga::new));
   public static final dva b = duq.ba;
   private static final Map<cue, dgv> c = Maps.newHashMap();
   private static final eyx d = dgv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(cue $$0, dtz.d $$1) {
      super($$0, $$1);
      this.l(this.E.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d;
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, Integer.valueOf(dvg.a($$0.i() + 180.0F)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   public static dgv a(cue $$0) {
      return c.getOrDefault($$0, dgx.iJ);
   }
}
