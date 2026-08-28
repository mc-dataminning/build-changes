import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class diq extends dic {
   public static final MapCodec<diq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(dic::b), t()).apply($$0, diq::new));
   public static final dxv b = dxm.bd;
   private static final Map<cvl, djl> c = Maps.newHashMap();
   private static final fbt d = djl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(cvl $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return d;
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(b, Integer.valueOf(dyb.a($$0.i() + 180.0F)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   public static djl a(cvl $$0) {
      return c.getOrDefault($$0, djn.jh);
   }
}
