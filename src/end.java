import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class end {
   public static final aku<enc> a = a("normal");
   public static final aku<enc> b = a("flat");
   public static final aku<enc> c = a("large_biomes");
   public static final aku<enc> d = a("amplified");
   public static final aku<enc> e = a("single_biome_surface");
   public static final aku<enc> f = a("debug_all_block_states");

   public static void a(qe<enc> $$0) {
      new end.a($$0).a();
   }

   private static aku<enc> a(String $$0) {
      return aku.a(mc.bb, akv.b($$0));
   }

   public static Optional<aku<enc>> a(edo $$0) {
      return $$0.a(eau.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         dyu $$1 = (dyu)var10000;

         $$0x.b();
         return switch ($$1) {
            case eco $$3 -> Optional.of(b);
            case eck $$4 -> Optional.of(f);
            case ecw $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static edo a(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().a();
   }

   public static eau b(jt.a $$0) {
      return $$0.d(mc.bb).b(a).a().b().orElseThrow();
   }

   public static edo c(jt.a $$0) {
      return $$0.d(mc.bb).b(b).a().a();
   }

   static class a {
      private final qe<enc> a;
      private final js<ecy> b;
      private final js<dhl> c;
      private final js<emr> d;
      private final js<ent> e;
      private final js<dhz> f;
      private final jr<eat> g;
      private final eau h;
      private final eau i;

      a(qe<enc> $$0) {
         this.a = $$0;
         js<eat> $$1 = $$0.a(mc.aN);
         this.b = $$0.a(mc.aR);
         this.c = $$0.a(mc.aI);
         this.d = $$0.a(mc.aT);
         this.e = $$0.a(mc.aW);
         this.f = $$0.a(mc.bc);
         this.g = $$1.b(ear.a);
         jr<eat> $$2 = $$1.b(ear.b);
         jr<ecy> $$3 = this.b.b(ecy.f);
         jr.c<dhz> $$4 = this.f.b(dia.a);
         this.h = new eau($$2, new ecw(dhy.a($$4), $$3));
         jr<eat> $$5 = $$1.b(ear.c);
         jr<ecy> $$6 = this.b.b(ecy.g);
         this.i = new eau($$5, new ecw(dic.a(this.c), $$6));
      }

      private eau a(dyu $$0) {
         return new eau(this.g, $$0);
      }

      private eau a(dhp $$0, jr<ecy> $$1) {
         return this.a(new ecw($$0, $$1));
      }

      private enc a(eau $$0) {
         return new enc(Map.of(eau.b, $$0, eau.c, this.h, eau.d, this.i));
      }

      private void a(aku<enc> $$0, eau $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(dhp $$0) {
         jr<ecy> $$1 = this.b.b(ecy.c);
         this.a(end.a, this.a($$0, $$1));
         jr<ecy> $$2 = this.b.b(ecy.d);
         this.a(end.c, this.a($$0, $$2));
         jr<ecy> $$3 = this.b.b(ecy.e);
         this.a(end.d, this.a($$0, $$3));
      }

      public void a() {
         jr.c<dhz> $$0 = this.f.b(dia.b);
         this.a(dhy.a($$0));
         jr<ecy> $$1 = this.b.b(ecy.c);
         jr.c<dhl> $$2 = this.c.b(dhs.b);
         this.a(end.e, this.a(new dhw($$2), $$1));
         this.a(end.b, this.a(new eco(elq.a(this.c, this.e, this.d))));
         this.a(end.f, this.a(new eck($$2)));
      }
   }
}
