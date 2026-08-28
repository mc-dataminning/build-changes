import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eks {
   public static final alb<ekr> a = a("normal");
   public static final alb<ekr> b = a("flat");
   public static final alb<ekr> c = a("large_biomes");
   public static final alb<ekr> d = a("amplified");
   public static final alb<ekr> e = a("single_biome_surface");
   public static final alb<ekr> f = a("debug_all_block_states");

   public static void a(qt<ekr> $$0) {
      new eks.a($$0).a();
   }

   private static alb<ekr> a(String $$0) {
      return alb.a(lv.aZ, alc.b($$0));
   }

   public static Optional<alb<ekr>> a(ebf $$0) {
      return $$0.a(dyl.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dwl $$1 = (dwl)var10000;

         $$0x.b();
         return switch ($$1) {
            case eaf $$3 -> Optional.of(b);
            case eab $$4 -> Optional.of(f);
            case ean $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ebf a(jp.a $$0) {
      return $$0.b(lv.aZ).b(a).a().a();
   }

   public static dyl b(jp.a $$0) {
      return $$0.b(lv.aZ).b(a).a().b().orElseThrow();
   }

   static class a {
      private final qt<ekr> a;
      private final jo<eap> b;
      private final jo<dfh> c;
      private final jo<ekg> d;
      private final jo<eli> e;
      private final jo<dfv> f;
      private final jn<dyk> g;
      private final dyl h;
      private final dyl i;

      a(qt<ekr> $$0) {
         this.a = $$0;
         jo<dyk> $$1 = $$0.a(lv.aL);
         this.b = $$0.a(lv.aP);
         this.c = $$0.a(lv.aG);
         this.d = $$0.a(lv.aR);
         this.e = $$0.a(lv.aU);
         this.f = $$0.a(lv.ba);
         this.g = $$1.b(dyi.a);
         jn<dyk> $$2 = $$1.b(dyi.b);
         jn<eap> $$3 = this.b.b(eap.f);
         jn.c<dfv> $$4 = this.f.b(dfw.a);
         this.h = new dyl($$2, new ean(dfu.a($$4), $$3));
         jn<dyk> $$5 = $$1.b(dyi.c);
         jn<eap> $$6 = this.b.b(eap.g);
         this.i = new dyl($$5, new ean(dfy.a(this.c), $$6));
      }

      private dyl a(dwl $$0) {
         return new dyl(this.g, $$0);
      }

      private dyl a(dfl $$0, jn<eap> $$1) {
         return this.a(new ean($$0, $$1));
      }

      private ekr a(dyl $$0) {
         return new ekr(Map.of(dyl.b, $$0, dyl.c, this.h, dyl.d, this.i));
      }

      private void a(alb<ekr> $$0, dyl $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dfl $$0) {
         jn<eap> $$1 = this.b.b(eap.c);
         this.a(eks.a, this.a($$0, $$1));
         jn<eap> $$2 = this.b.b(eap.d);
         this.a(eks.c, this.a($$0, $$2));
         jn<eap> $$3 = this.b.b(eap.e);
         this.a(eks.d, this.a($$0, $$3));
      }

      public void a() {
         jn.c<dfv> $$0 = this.f.b(dfw.b);
         this.a(dfu.a($$0));
         jn<eap> $$1 = this.b.b(eap.c);
         jn.c<dfh> $$2 = this.c.b(dfo.b);
         this.a(eks.e, this.a(new dfs($$2), $$1));
         this.a(eks.b, this.a(new eaf(ejf.a(this.c, this.e, this.d))));
         this.a(eks.f, this.a(new eab($$2)));
      }
   }
}
