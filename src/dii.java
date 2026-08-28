import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dii extends dok {
   public static final MapCodec<dii> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwb.a.fieldOf("wood_type").forGetter(dok::d), u()).apply($$0, dii::new));
   public static final dvo b = dve.ba;
   public static final dvf c = dve.a;
   protected static final float d = 5.0F;
   protected static final ezm e = dhj.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ezm> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dhj.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dhj.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dhj.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dhj.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dwb $$0, dun.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.c_($$3) instanceof dte $$7 && this.a($$4, $$6, $$7, $$0)) {
         return brp.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cnu $$0, eyo $$1, dte $$2, cvp $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cvd && $$1.c().equals(jj.a);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jj.a, dpl.b);
   }

   @Override
   public duo a(czk $$0) {
      deg $$1 = $$0.q();
      eqp $$2 = $$1.b_($$0.a());
      je $$3 = $$0.a().d();
      duo $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awt.aB);
      jj $$6 = jj.a((double)$$0.i());
      boolean $$7 = !dhj.a($$4.g($$1, $$3), jj.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dqj.b)) {
            jj $$8 = $$4.c(dqj.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jj> $$9 = dvu.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dvu.a($$6.g()) : dvu.a($$0.i() + 180.0F);
      return this.o().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == eqq.c));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      ezm $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      return this.a($$0, $$1, $$2, eyx.a());
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1 == jj.b && !this.a($$0, $$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(duo $$0) {
      return dvu.b($$0.c(b));
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
      $$0.a(b, c, f);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.i, dte::a);
   }
}
