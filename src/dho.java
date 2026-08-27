import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dho extends dgx {
   public static final MapCodec<dho> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dho::new));
   public static final dlz g = dcj.aE;
   protected static final float h = 2.5F;
   private static final Map<ie, eol> i = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cyo.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ie.d,
         cyo.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ie.e,
         cyo.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ie.f,
         cyo.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dho> a() {
      return f;
   }

   protected dho(kc $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ie.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return m($$0);
   }

   public static eol m(dlf $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(cvq $$0, hz $$1, ie $$2) {
      hz $$3 = $$1.a($$2.g());
      dlf $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = this.o();
      cvq $$2 = $$0.q();
      hz $$3 = $$0.a();
      ie[] $$4 = $$0.f();

      for (ie $$5 : $$4) {
         if ($$5.o().d()) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cyq.a.o() : $$0;
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      ie $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ie $$10 = $$4.g();
      $$1.a(jz.ab, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(g);
   }
}
