import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmg extends dlo {
   public static final MapCodec<dmg> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dmg::new));
   public static final drb g = dha.aE;
   protected static final float h = 2.5F;
   private static final Map<is, eui> i = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         dde.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         is.d,
         dde.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         is.e,
         dde.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         is.f,
         dde.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dmg> a() {
      return f;
   }

   protected dmg(la $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, is.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return m($$0);
   }

   public static eui m(dqh $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dag $$0, in $$1, is $$2) {
      in $$3 = $$1.a($$2.g());
      dqh $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = this.n();
      dag $$2 = $$0.q();
      in $$3 = $$0.a();
      is[] $$4 = $$0.f();

      for (is $$5 : $$4) {
         if ($$5.o().d()) {
            is $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? ddg.a.n() : $$0;
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      is $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      is $$10 = $$4.g();
      $$1.a(kx.ab, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(g);
   }
}
