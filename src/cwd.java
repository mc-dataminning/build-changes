import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cwd extends cvp {
   public static final MapCodec<cwd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clv.q.fieldOf("color").forGetter(cvp::b), u()).apply($$0, cwd::new));
   public static final dkp b = dkf.ba;
   private static final Map<clv, cwy> c = Maps.newHashMap();
   private static final emv d = cwy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cwd> a() {
      return a;
   }

   public cwd(clv $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d;
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(b, Integer.valueOf(dkv.a($$0.i() + 180.0F)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   public static cwy a(clv $$0) {
      return c.getOrDefault($$0, cxa.iJ);
   }
}
