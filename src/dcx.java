import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dcx extends dci {
   public static final MapCodec<dcx> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dcx::new));
   public static final dgv g = cxu.aE;
   protected static final float h = 2.5F;
   private static final Map<hx, eiy> i = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cua.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         hx.d,
         cua.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         hx.e,
         cua.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         hx.f,
         cua.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dcx> a() {
      return f;
   }

   protected dcx(jv $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return h($$0);
   }

   public static eiy h(dgb $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      hx $$3 = $$0.c(g);
      ht $$4 = $$2.a($$3.g());
      dgb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = this.o();
      crc $$2 = $$0.q();
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
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cuc.a.o() : $$0;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, ate $$3) {
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
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(g);
   }
}
