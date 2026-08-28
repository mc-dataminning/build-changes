import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aau(aau.a c) implements aax {
   public static final zn<wm, aau> a = aax.a(aau::a, aau::new);
   public static final aax.b<aau> b = aax.a("debug/brain");

   private aau(wm $$0) {
      this(new aau.a($$0));
   }

   private void a(wm $$0) {
      this.c.a($$0);
   }

   @Override
   public aax.b<aau> a() {
      return b;
   }

   public aau.a b() {
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
      evr h,
      String i,
      @Nullable eoj j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<iz> q,
      Set<iz> r
   ) {
      public a(wm $$0) {
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
            $$0.c(eoj::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(wm::p),
            $$0.a(wm::p),
            $$0.a(wm::p),
            $$0.a(wm::p),
            $$0.a(HashSet::new, iz.b),
            $$0.a(HashSet::new, iz.b)
         );
      }

      public void a(wm $$0) {
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
         $$0.a(this.m, wm::a);
         $$0.a(this.n, wm::a);
         $$0.a(this.o, wm::a);
         $$0.a(this.p, wm::a);
         $$0.a(this.q, iz.b);
         $$0.a(this.r, iz.b);
      }

      public boolean a(iz $$0) {
         return this.q.contains($$0);
      }

      public boolean b(iz $$0) {
         return this.r.contains($$0);
      }
   }
}
