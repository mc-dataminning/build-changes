import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aak(aak.a c) implements aan {
   public static final zb<wa, aak> a = aan.a(aak::a, aak::new);
   public static final aan.b<aak> b = aan.a("debug/brain");

   private aak(wa $$0) {
      this(new aak.a($$0));
   }

   private void a(wa $$0) {
      this.c.a($$0);
   }

   @Override
   public aan.b<aak> a() {
      return b;
   }

   public aak.a b() {
      return this.c;
   }

   public static record a(
      UUID a,
      int b,
      String c,
      String d,
      int e,
      float f,
      float g,
      eye h,
      String i,
      @Nullable eqp j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<je> q,
      Set<je> r
   ) {
      public a(wa $$0) {
         this(
            $$0.n(),
            $$0.readInt(),
            $$0.p(),
            $$0.p(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.p(),
            $$0.c(eqp::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(wa::p),
            $$0.a(wa::p),
            $$0.a(wa::p),
            $$0.a(wa::p),
            $$0.a(HashSet::new, je.b),
            $$0.a(HashSet::new, je.b)
         );
      }

      public void a(wa $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.q(this.e);
         $$0.a(this.f);
         $$0.a(this.g);
         $$0.a(this.h);
         $$0.a(this.i);
         $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.k);
         $$0.q(this.l);
         $$0.a(this.m, wa::a);
         $$0.a(this.n, wa::a);
         $$0.a(this.o, wa::a);
         $$0.a(this.p, wa::a);
         $$0.a(this.q, je.b);
         $$0.a(this.r, je.b);
      }

      public boolean a(je $$0) {
         return this.q.contains($$0);
      }

      public boolean b(je $$0) {
         return this.r.contains($$0);
      }
   }
}
