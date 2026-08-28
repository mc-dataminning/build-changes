import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dji extends diu {
   public static final MapCodec<dji> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwd.q.fieldOf("color").forGetter(diu::b), t()).apply($$0, dji::new));
   public static final dyn b = dye.bd;
   private static final Map<cwd, dkd> c = Maps.newHashMap();
   private static final fcl d = dkd.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(cwd $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return d;
   }

   @Override
   public dxo a(dax $$0) {
      return this.m().b(b, Integer.valueOf(dyt.a($$0.i() + 180.0F)));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   public static dkd a(cwd $$0) {
      return c.getOrDefault($$0, dkf.jh);
   }
}
