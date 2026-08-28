import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaf(aaf.a c) implements aai {
   public static final yw<vu, aaf> a = aai.a(aaf::a, aaf::new);
   public static final aai.b<aaf> b = aai.a("debug/brain");

   private aaf(vu $$0) {
      this(new aaf.a($$0));
   }

   private void a(vu $$0) {
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
      fex h,
      String i,
      @Nullable exj j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<iv> q,
      Set<iv> r
   ) {
      public a(vu $$0) {
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
            $$0.c(exj::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vu::p),
            $$0.a(vu::p),
            $$0.a(vu::p),
            $$0.a(vu::p),
            $$0.a(HashSet::new, iv.b),
            $$0.a(HashSet::new, iv.b)
         );
      }

      public void a(vu $$0) {
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
         $$0.a(this.m, vu::a);
         $$0.a(this.n, vu::a);
         $$0.a(this.o, vu::a);
         $$0.a(this.p, vu::a);
         $$0.a(this.q, iv.b);
         $$0.a(this.r, iv.b);
      }

      public boolean a(iv $$0) {
         return this.q.contains($$0);
      }

      public boolean b(iv $$0) {
         return this.r.contains($$0);
      }
   }
}
