import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaf(aaf.a c) implements aai {
   public static final yw<vv, aaf> a = aai.a(aaf::a, aaf::new);
   public static final aai.b<aaf> b = aai.a("debug/brain");

   private aaf(vv $$0) {
      this(new aaf.a($$0));
   }

   private void a(vv $$0) {
      this.c.a($$0);
   }

   @Override
   public aai.b<aaf> a() {
      return b;
   }

   public aaf.a b() {
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
      eww h,
      String i,
      @Nullable epm j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jd> q,
      Set<jd> r
   ) {
      public a(vv $$0) {
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
            $$0.c(epm::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vv::p),
            $$0.a(vv::p),
            $$0.a(vv::p),
            $$0.a(vv::p),
            $$0.a(HashSet::new, jd.b),
            $$0.a(HashSet::new, jd.b)
         );
      }

      public void a(vv $$0) {
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
         $$0.a(this.m, vv::a);
         $$0.a(this.n, vv::a);
         $$0.a(this.o, vv::a);
         $$0.a(this.p, vv::a);
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
