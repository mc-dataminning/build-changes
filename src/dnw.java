import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnw extends dne {
   public static final MapCodec<dnw> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dnw::new));
   public static final dsr g = diq.aE;
   protected static final float h = 2.5F;
   private static final Map<je, ewf> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         deu.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         je.d,
         deu.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         je.e,
         deu.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         je.f,
         deu.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dnw> a() {
      return f;
   }

   protected dnw(lm $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return m($$0);
   }

   public static ewf m(drx $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dbw $$0, iz $$1, je $$2) {
      iz $$3 = $$1.a($$2.g());
      drx $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n();
      dbw $$2 = $$0.q();
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
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dew.a.n() : $$0;
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      je $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      je $$10 = $$4.g();
      $$1.a(lj.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(g);
   }
}
