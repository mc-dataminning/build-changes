import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class czl extends czi {
   public static final MapCodec<czl> b = b(czl::new);
   public static final dnt c = ddv.aE;
   private static final Map<ih, eqk> e = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         daa.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ih.d,
         daa.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ih.e,
         daa.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ih.f,
         daa.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends czl> a() {
      return b;
   }

   protected czl(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dac.a.o() : $$0;
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ih $$3 = $$0.c(c);
      ib $$4 = $$2.a($$3.g());
      dmz $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = super.a($$0);
      cxc $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
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
