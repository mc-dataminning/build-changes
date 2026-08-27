import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ctf extends csq {
   public static final MapCodec<ctf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cix.q.fieldOf("color").forGetter(csq::b), t()).apply($$0, ctf::new));
   public static final dhb b = dgr.ba;
   private static final Map<cix, cua> c = Maps.newHashMap();
   private static final eiy d = cua.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ctf> a() {
      return a;
   }

   public ctf(cix $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return d;
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(b, Integer.valueOf(dhh.a($$0.i() + 180.0F)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   public static cua a(cix $$0) {
      return c.getOrDefault($$0, cuc.iJ);
   }
}
