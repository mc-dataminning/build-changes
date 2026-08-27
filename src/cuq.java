import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cuq extends cun {
   public static final MapCodec<cuq> b = b(cuq::new);
   public static final dih c = cza.aE;
   private static final Map<ib, eks> e = Maps.newEnumMap(
      ImmutableMap.of(
         ib.c,
         cvf.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ib.d,
         cvf.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ib.e,
         cvf.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ib.f,
         cvf.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cuq> a() {
      return b;
   }

   protected cuq(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ib.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cvh.a.o() : $$0;
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = $$0.c(c);
      hx $$4 = $$2.a($$3.g());
      dhn $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = super.a($$0);
      csi $$2 = $$0.q();
      hx $$3 = $$0.a();
      ib[] $$4 = $$0.f();

      for (ib $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
