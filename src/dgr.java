import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dgr extends dgd {
   public static final MapCodec<dgr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cum.q.fieldOf("color").forGetter(dgd::b), t()).apply($$0, dgr::new));
   public static final dvs b = dvi.ba;
   private static final Map<cum, dhm> c = Maps.newHashMap();
   private static final ezq d = dhm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public dgr(cum $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return d;
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, Integer.valueOf(dvy.a($$0.i() + 180.0F)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   public static dhm a(cum $$0) {
      return c.getOrDefault($$0, dho.iJ);
   }
}
