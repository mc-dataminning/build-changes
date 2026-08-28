import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dip extends dib {
   public static final MapCodec<dip> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(dib::b), t()).apply($$0, dip::new));
   public static final dxu b = dxl.bd;
   private static final Map<cvk, djk> c = Maps.newHashMap();
   private static final fbs d = djk.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   public dip(cvk $$0, dwu.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return d;
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, Integer.valueOf(dya.a($$0.i() + 180.0F)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   public static djk a(cvk $$0) {
      return c.getOrDefault($$0, djm.jh);
   }
}
