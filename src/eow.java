import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class eow {
   public static final alc<eov> a = a("normal");
   public static final alc<eov> b = a("flat");
   public static final alc<eov> c = a("large_biomes");
   public static final alc<eov> d = a("amplified");
   public static final alc<eov> e = a("single_biome_surface");
   public static final alc<eov> f = a("debug_all_block_states");

   public static void a(qg<eov> $$0) {
      new eow.a($$0).a();
   }

   private static alc<eov> a(String $$0) {
      return alc.a(me.bi, ald.b($$0));
   }

   public static Optional<alc<eov>> a(efg $$0) {
      return $$0.a(eck.b).flatMap($$0x -> {
         Object var10000;
         Objects.requireNonNull(var10000);
         eak $$1 = (eak)var10000;

         $$0x.b();
         return switch ($$1) {
            case eeg $$3 -> Optional.of(b);
            case eec $$4 -> Optional.of(f);
            case eeo $$5 -> Optional.of(a);
            default -> Optional.empty();
         };
      });
   }

   public static efg a(ju.a $$0) {
      return $$0.e(me.bi).b(a).a().a();
   }

   public static eck b(ju.a $$0) {
      return $$0.e(me.bi).b(a).a().b().orElseThrow();
   }

   public static efg c(ju.a $$0) {
      return $$0.e(me.bi).b(b).a().a();
   }

   static class a {
      private final qg<eov> a;
      private final jt<eeq> b;
      private final jt<dis> c;
      private final jt<eok> d;
      private final jt<epm> e;
      private final jt<djg> f;
      private final js<ecj> g;
      private final eck h;
      private final eck i;

      a(qg<eov> $$0) {
         this.a = $$0;
         jt<ecj> $$1 = $$0.a(me.aR);
         this.b = $$0.a(me.aV);
         this.c = $$0.a(me.aM);
         this.d = $$0.a(me.aY);
         this.e = $$0.a(me.bb);
         this.f = $$0.a(me.bj);
         this.g = $$1.b(ech.a);
         js<ecj> $$2 = $$1.b(ech.b);
         js<eeq> $$3 = this.b.b(eeq.f);
         js.c<djg> $$4 = this.f.b(djh.a);
         this.h = new eck($$2, new eeo(djf.a($$4), $$3));
         js<ecj> $$5 = $$1.b(ech.c);
         js<eeq> $$6 = this.b.b(eeq.g);
         this.i = new eck($$5, new eeo(djj.a(this.c), $$6));
      }

      private eck a(eak $$0) {
         return new eck(this.g, $$0);
      }

      private eck a(diw $$0, js<eeq> $$1) {
         return this.a(new eeo($$0, $$1));
      }

      private eov a(eck $$0) {
         return new eov(Map.of(eck.b, $$0, eck.c, this.h, eck.d, this.i));
      }

      private void a(alc<eov> $$0, eck $$1) {
         this.a.a($$0, this.a($$1));
      }

      private void a(diw $$0) {
         js<eeq> $$1 = this.b.b(eeq.c);
         this.a(eow.a, this.a($$0, $$1));
         js<eeq> $$2 = this.b.b(eeq.d);
         this.a(eow.c, this.a($$0, $$2));
         js<eeq> $$3 = this.b.b(eeq.e);
         this.a(eow.d, this.a($$0, $$3));
      }

      public void a() {
         js.c<djg> $$0 = this.f.b(djh.b);
         this.a(djf.a($$0));
         js<eeq> $$1 = this.b.b(eeq.c);
         js.c<dis> $$2 = this.c.b(diz.b);
         this.a(eow.e, this.a(new djd($$2), $$1));
         this.a(eow.b, this.a(new eeg(enj.a(this.c, this.e, this.d))));
         this.a(eow.f, this.a(new eec($$2)));
      }
   }
}
