import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eke {
   public static final ala<ekd> a = a("normal");
   public static final ala<ekd> b = a("flat");
   public static final ala<ekd> c = a("large_biomes");
   public static final ala<ekd> d = a("amplified");
   public static final ala<ekd> e = a("single_biome_surface");
   public static final ala<ekd> f = a("debug_all_block_states");

   public static void a(qt<ekd> $$0) {
      new eke.a($$0).a();
   }

   private static ala<ekd> a(String $$0) {
      return ala.a(lv.aY, alb.b($$0));
   }

   public static Optional<ala<ekd>> a(ear $$0) {
      return $$0.a(dxx.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dvx $$1 = (dvx)var10000;

         $$0x.b();
         return switch ($$1) {
            case dzr $$3 -> Optional.of(b);
            case dzn $$4 -> Optional.of(f);
            case dzz $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ear a(jp.a $$0) {
      return $$0.b(lv.aY).b(a).a().a();
   }

   public static dxx b(jp.a $$0) {
      return $$0.b(lv.aY).b(a).a().b().orElseThrow();
   }

   static class a {
      private final qt<ekd> a;
      private final jo<eab> b;
      private final jo<det> c;
      private final jo<ejs> d;
      private final jo<eku> e;
      private final jo<dfh> f;
      private final jn<dxw> g;
      private final dxx h;
      private final dxx i;

      a(qt<ekd> $$0) {
         this.a = $$0;
         jo<dxw> $$1 = $$0.a(lv.aK);
         this.b = $$0.a(lv.aO);
         this.c = $$0.a(lv.aF);
         this.d = $$0.a(lv.aQ);
         this.e = $$0.a(lv.aT);
         this.f = $$0.a(lv.aZ);
         this.g = $$1.b(dxu.a);
         jn<dxw> $$2 = $$1.b(dxu.b);
         jn<eab> $$3 = this.b.b(eab.f);
         jn.c<dfh> $$4 = this.f.b(dfi.a);
         this.h = new dxx($$2, new dzz(dfg.a($$4), $$3));
         jn<dxw> $$5 = $$1.b(dxu.c);
         jn<eab> $$6 = this.b.b(eab.g);
         this.i = new dxx($$5, new dzz(dfk.a(this.c), $$6));
      }

      private dxx a(dvx $$0) {
         return new dxx(this.g, $$0);
      }

      private dxx a(dex $$0, jn<eab> $$1) {
         return this.a(new dzz($$0, $$1));
      }

      private ekd a(dxx $$0) {
         return new ekd(Map.of(dxx.b, $$0, dxx.c, this.h, dxx.d, this.i));
      }

      private void a(ala<ekd> $$0, dxx $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dex $$0) {
         jn<eab> $$1 = this.b.b(eab.c);
         this.a(eke.a, this.a($$0, $$1));
         jn<eab> $$2 = this.b.b(eab.d);
         this.a(eke.c, this.a($$0, $$2));
         jn<eab> $$3 = this.b.b(eab.e);
         this.a(eke.d, this.a($$0, $$3));
      }

      public void a() {
         jn.c<dfh> $$0 = this.f.b(dfi.b);
         this.a(dfg.a($$0));
         jn<eab> $$1 = this.b.b(eab.c);
         jn.c<det> $$2 = this.c.b(dfa.b);
         this.a(eke.e, this.a(new dfe($$2), $$1));
         this.a(eke.b, this.a(new dzr(eir.a(this.c, this.e, this.d))));
         this.a(eke.f, this.a(new dzn($$2)));
      }
   }
}
