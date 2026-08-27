import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class ddd extends dcp {
   public static final MapCodec<ddd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csh.q.fieldOf("color").forGetter(dcp::b), u()).apply($$0, ddd::new));
   public static final dsb b = drr.ba;
   private static final Map<csh, ddy> c = Maps.newHashMap();
   private static final evd d = ddy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   public ddd(csh $$0, dra.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return d;
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(b, Integer.valueOf(dsh.a($$0.i() + 180.0F)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }

   public static ddy a(csh $$0) {
      return c.getOrDefault($$0, dea.iJ);
   }
}
