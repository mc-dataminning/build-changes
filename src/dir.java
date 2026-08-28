import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dir extends did {
   public static final MapCodec<dir> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(did::b), t()).apply($$0, dir::new));
   public static final dxw b = dxn.bd;
   private static final Map<cvm, djm> c = Maps.newHashMap();
   private static final fbu d = djm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dir> a() {
      return a;
   }

   public dir(cvm $$0, dww.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return d;
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, Integer.valueOf(dyc.a($$0.i() + 180.0F)));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   public static djm a(cvm $$0) {
      return c.getOrDefault($$0, djo.jh);
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.b;
   }
}
