import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class ddr extends ddc {
   public static final MapCodec<ddr> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, ddr::new));
   public static final dhq g = cyo.aE;
   protected static final float h = 2.5F;
   private static final Map<hx, ekb> i = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cut.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         hx.d,
         cut.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         hx.e,
         cut.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         hx.f,
         cut.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<ddr> a() {
      return f;
   }

   protected ddr(jv $$0, dgv.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return h($$0);
   }

   public static ekb h(dgw $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = $$0.c(g);
      ht $$4 = $$2.a($$3.g());
      dgw $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = this.o();
      crv $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cuv.a.o() : $$0;
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      hx $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      hx $$10 = $$4.g();
      $$1.a(js.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(g);
   }
}
