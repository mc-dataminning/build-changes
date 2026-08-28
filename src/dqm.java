import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqm extends dpu {
   public static final MapCodec<dqm> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dqm::new));
   public static final dvi g = dlf.aF;
   protected static final float h = 2.5F;
   private static final Map<jj, ezm> i = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dhj.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         jj.d,
         dhj.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         jj.e,
         dhj.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         jj.f,
         dhj.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dqm> a() {
      return f;
   }

   protected dqm(lr $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(g, jj.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return o($$0);
   }

   public static ezm o(duo $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dej $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2.g());
      duo $$4 = $$0.a_($$3);
      return $$4.c($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o();
      dej $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dhl.a.o() : $$0;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      jj $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      jj $$10 = $$4.g();
      $$1.a(ln.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(g, $$1.a($$0.c(g)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(g);
   }
}
