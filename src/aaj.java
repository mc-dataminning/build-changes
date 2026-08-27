import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaj(aaj.a c) implements aam {
   public static final zc<we, aaj> a = aam.a(aaj::a, aaj::new);
   public static final aam.b<aaj> b = aam.a("debug/brain");

   private aaj(we $$0) {
      this(new aaj.a($$0));
   }

   private void a(we $$0) {
      this.c.a($$0);
   }

   @Override
   public aam.b<aaj> a() {
      return b;
   }

   public aaj.a b() {
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
      ewu h,
      String i,
      @Nullable eps j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<ir> q,
      Set<ir> r
   ) {
      public a(we $$0) {
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
            $$0.c(eps::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(we::p),
            $$0.a(we::p),
            $$0.a(we::p),
            $$0.a(we::p),
            $$0.a(HashSet::new, ir.b),
            $$0.a(HashSet::new, ir.b)
         );
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.p(this.e);
         $$0.a(this.f);
         $$0.a(this.g);
         $$0.a(this.h);
         $$0.a(this.i);
         $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.k);
         $$0.p(this.l);
         $$0.a(this.m, we::a);
         $$0.a(this.n, we::a);
         $$0.a(this.o, we::a);
         $$0.a(this.p, we::a);
         $$0.a(this.q, ir.b);
         $$0.a(this.r, ir.b);
      }

      public boolean a(ir $$0) {
         return this.q.contains($$0);
      }

      public boolean b(ir $$0) {
         return this.r.contains($$0);
      }
   }
}
