import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cvv extends cvh {
   public static final MapCodec<cvv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clm.q.fieldOf("color").forGetter(cvh::b), u()).apply($$0, cvv::new));
   public static final dkh b = djx.ba;
   private static final Map<clm, cwq> c = Maps.newHashMap();
   private static final emm d = cwq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cvv> a() {
      return a;
   }

   public cvv(clm $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return d;
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(b, Integer.valueOf(dkn.a($$0.i() + 180.0F)));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   public static cwq a(clm $$0) {
      return c.getOrDefault($$0, cws.iJ);
   }
}
