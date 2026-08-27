import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dez extends dei {
   public static final MapCodec<dez> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dez::new));
   public static final djj g = czu.aE;
   protected static final float h = 2.5F;
   private static final Map<ia, elu> i = Maps.newEnumMap(
      ImmutableMap.of(
         ia.c,
         cvz.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ia.d,
         cvz.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ia.e,
         cvz.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ia.f,
         cvz.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dez> a() {
      return f;
   }

   protected dez(jy $$0, dio.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ia.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return h($$0);
   }

   public static elu h(dip $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      ia $$3 = $$0.c(g);
      hv $$4 = $$2.a($$3.g());
      dip $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = this.o();
      ctb $$2 = $$0.q();
      hv $$3 = $$0.a();
      ia[] $$4 = $$0.f();

      for (ia $$5 : $$4) {
         if ($$5.o().d()) {
            ia $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cwb.a.o() : $$0;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      ia $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ia $$10 = $$4.g();
      $$1.a(jv.ab, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(g);
   }
}
