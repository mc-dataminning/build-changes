import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfq extends dez {
   public static final MapCodec<dfq> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dfq::new));
   public static final dkb g = dal.aE;
   protected static final float h = 2.5F;
   private static final Map<ic, emm> i = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwq.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ic.d,
         cwq.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ic.e,
         cwq.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ic.f,
         cwq.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dfq> a() {
      return f;
   }

   protected dfq(ka $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return h($$0);
   }

   public static emm h(djh $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = $$0.c(g);
      hx $$4 = $$2.a($$3.g());
      djh $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = this.o();
      cts $$2 = $$0.q();
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
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cws.a.o() : $$0;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
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
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(g);
   }
}
