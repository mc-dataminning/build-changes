import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dgo extends dga {
   public static final MapCodec<dgo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuj.q.fieldOf("color").forGetter(dga::b), u()).apply($$0, dgo::new));
   public static final dvo b = dve.ba;
   private static final Map<cuj, dhj> c = Maps.newHashMap();
   private static final ezm d = dhj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   public dgo(cuj $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return d;
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(b, Integer.valueOf(dvu.a($$0.i() + 180.0F)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.a && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   public static dhj a(cuj $$0) {
      return c.getOrDefault($$0, dhl.iJ);
   }
}
