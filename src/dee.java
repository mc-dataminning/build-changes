import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dee extends ddo {
   public static final MapCodec<dee> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dee::new));
   public static final dih g = cza.aE;
   protected static final float h = 2.5F;
   private static final Map<ib, eks> i = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         cvf.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ib.d,
         cvf.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ib.e,
         cvf.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ib.f,
         cvf.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dee> a() {
      return f;
   }

   protected dee(jz $$0, dhm.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ib.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return h($$0);
   }

   public static eks h(dhn $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = $$0.c(g);
      hx $$4 = $$2.a($$3.g());
      dhn $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = this.o();
      csi $$2 = $$0.q();
      hx $$3 = $$0.a();
      ib[] $$4 = $$0.f();

      for (ib $$5 : $$4) {
         if ($$5.o().d()) {
            ib $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cvh.a.o() : $$0;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      ib $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ib $$10 = $$4.g();
      $$1.a(jw.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(g);
   }
}
