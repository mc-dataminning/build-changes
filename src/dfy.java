import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfy extends dfh {
   public static final MapCodec<dfy> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dfy::new));
   public static final dkj g = dat.aE;
   protected static final float h = 2.5F;
   private static final Map<ic, emv> i = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwy.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ic.d,
         cwy.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ic.e,
         cwy.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ic.f,
         cwy.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dfy> a() {
      return f;
   }

   protected dfy(ka $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ic.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return h($$0);
   }

   public static emv h(djp $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      ic $$3 = $$0.c(g);
      hx $$4 = $$2.a($$3.g());
      djp $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = this.o();
      cua $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cxa.a.o() : $$0;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      ic $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ic $$10 = $$4.g();
      $$1.a(jx.ab, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(g);
   }
}
