import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doc extends dnk {
   public static final MapCodec<doc> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, doc::new));
   public static final dsx g = diw.aE;
   protected static final float h = 2.5F;
   private static final Map<je, ewl> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfa.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         je.d,
         dfa.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         je.e,
         dfa.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         je.f,
         dfa.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<doc> a() {
      return f;
   }

   protected doc(lm $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return m($$0);
   }

   public static ewl m(dsd $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dcc $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      dsd $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = this.o();
      dcc $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dfc.a.o() : $$0;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      je $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      je $$10 = $$4.g();
      $$1.a(li.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(g);
   }
}
