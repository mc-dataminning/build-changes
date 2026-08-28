import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aag(aag.a c) implements aaj {
   public static final yx<vw, aag> a = aaj.a(aag::a, aag::new);
   public static final aaj.b<aag> b = aaj.a("debug/brain");

   private aag(vw $$0) {
      this(new aag.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aaj.b<aag> a() {
      return b;
   }

   public aag.a b() {
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
      exc h,
      String i,
      @Nullable eps j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jd> q,
      Set<jd> r
   ) {
      public a(vw $$0) {
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
            $$0.a(vw::p),
            $$0.a(vw::p),
            $$0.a(vw::p),
            $$0.a(vw::p),
            $$0.a(HashSet::new, jd.b),
            $$0.a(HashSet::new, jd.b)
         );
      }

      public void a(vw $$0) {
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
         $$0.a(this.m, vw::a);
         $$0.a(this.n, vw::a);
         $$0.a(this.o, vw::a);
         $$0.a(this.p, vw::a);
         $$0.a(this.q, jd.b);
         $$0.a(this.r, jd.b);
      }

      public boolean a(jd $$0) {
         return this.q.contains($$0);
      }

      public boolean b(jd $$0) {
         return this.r.contains($$0);
      }
   }
}
