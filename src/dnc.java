import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnc extends dmk {
   public static final MapCodec<dnc> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dnc::new));
   public static final drx g = dhw.aE;
   protected static final float h = 2.5F;
   private static final Map<it, evf> i = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         dea.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         it.d,
         dea.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         it.e,
         dea.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         it.f,
         dea.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dnc> a() {
      return f;
   }

   protected dnc(lb $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, it.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return m($$0);
   }

   public static evf m(drd $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dbc $$0, io $$1, it $$2) {
      io $$3 = $$1.a($$2.g());
      drd $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = this.n();
      dbc $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
         if ($$5.o().d()) {
            it $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dec.a.n() : $$0;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      it $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      it $$10 = $$4.g();
      $$1.a(ky.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(g);
   }
}
