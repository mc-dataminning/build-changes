import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cvu extends cvg {
   public static final MapCodec<cvu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cll.q.fieldOf("color").forGetter(cvg::b), u()).apply($$0, cvu::new));
   public static final dkg b = djw.ba;
   private static final Map<cll, cwp> c = Maps.newHashMap();
   private static final eml d = cwp.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cvu> a() {
      return a;
   }

   public cvu(cll $$0, djf.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d;
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(b, Integer.valueOf(dkm.a($$0.i() + 180.0F)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   public static cwp a(cll $$0) {
      return c.getOrDefault($$0, cwr.iJ);
   }
}
