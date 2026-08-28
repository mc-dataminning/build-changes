import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class elr {
   public static final alk<elq> a = a("normal");
   public static final alk<elq> b = a("flat");
   public static final alk<elq> c = a("large_biomes");
   public static final alk<elq> d = a("amplified");
   public static final alk<elq> e = a("single_biome_surface");
   public static final alk<elq> f = a("debug_all_block_states");

   public static void a(rb<elq> $$0) {
      new elr.a($$0).a();
   }

   private static alk<elq> a(String $$0) {
      return alk.a(ma.aZ, all.b($$0));
   }

   public static Optional<alk<elq>> a(ece $$0) {
      return $$0.a(dzk.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dxk $$1 = (dxk)var10000;

         $$0x.b();
         return switch ($$1) {
            case ebe $$3 -> Optional.of(b);
            case eba $$4 -> Optional.of(f);
            case ebm $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static ece a(js.a $$0) {
      return $$0.d(ma.aZ).b(a).a().a();
   }

   public static dzk b(js.a $$0) {
      return $$0.d(ma.aZ).b(a).a().b().orElseThrow();
   }

   public static ece c(js.a $$0) {
      return $$0.d(ma.aZ).b(b).a().a();
   }

   static class a {
      private final rb<elq> a;
      private final jr<ebo> b;
      private final jr<dgh> c;
      private final jr<elf> d;
      private final jr<emh> e;
      private final jr<dgv> f;
      private final jq<dzj> g;
      private final dzk h;
      private final dzk i;

      a(rb<elq> $$0) {
         this.a = $$0;
         jr<dzj> $$1 = $$0.a(ma.aL);
         this.b = $$0.a(ma.aP);
         this.c = $$0.a(ma.aG);
         this.d = $$0.a(ma.aR);
         this.e = $$0.a(ma.aU);
         this.f = $$0.a(ma.ba);
         this.g = $$1.b(dzh.a);
         jq<dzj> $$2 = $$1.b(dzh.b);
         jq<ebo> $$3 = this.b.b(ebo.f);
         jq.c<dgv> $$4 = this.f.b(dgw.a);
         this.h = new dzk($$2, new ebm(dgu.a($$4), $$3));
         jq<dzj> $$5 = $$1.b(dzh.c);
         jq<ebo> $$6 = this.b.b(ebo.g);
         this.i = new dzk($$5, new ebm(dgy.a(this.c), $$6));
      }

      private dzk a(dxk $$0) {
         return new dzk(this.g, $$0);
      }

      private dzk a(dgl $$0, jq<ebo> $$1) {
         return this.a(new ebm($$0, $$1));
      }

      private elq a(dzk $$0) {
         return new elq(Map.of(dzk.b, $$0, dzk.c, this.h, dzk.d, this.i));
      }

      private void a(alk<elq> $$0, dzk $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dgl $$0) {
         jq<ebo> $$1 = this.b.b(ebo.c);
         this.a(elr.a, this.a($$0, $$1));
         jq<ebo> $$2 = this.b.b(ebo.d);
         this.a(elr.c, this.a($$0, $$2));
         jq<ebo> $$3 = this.b.b(ebo.e);
         this.a(elr.d, this.a($$0, $$3));
      }

      public void a() {
         jq.c<dgv> $$0 = this.f.b(dgw.b);
         this.a(dgu.a($$0));
         jq<ebo> $$1 = this.b.b(ebo.c);
         jq.c<dgh> $$2 = this.c.b(dgo.b);
         this.a(elr.e, this.a(new dgs($$2), $$1));
         this.a(elr.b, this.a(new ebe(eke.a(this.c, this.e, this.d))));
         this.a(elr.f, this.a(new eba($$2)));
      }
   }
}
