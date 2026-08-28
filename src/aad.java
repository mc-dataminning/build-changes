import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aad(aad.a c) implements aag {
   public static final yu<vs, aad> a = aag.a(aad::a, aad::new);
   public static final aag.b<aad> b = aag.a("debug/brain");

   private aad(vs $$0) {
      this(new aad.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aag.b<aad> a() {
      return b;
   }

   public aad.a b() {
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
      fdw h,
      String i,
      @Nullable ewj j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<iu> q,
      Set<iu> r
   ) {
      public a(vs $$0) {
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
            $$0.c(ewj::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vs::p),
            $$0.a(vs::p),
            $$0.a(vs::p),
            $$0.a(vs::p),
            $$0.a(HashSet::new, iu.b),
            $$0.a(HashSet::new, iu.b)
         );
      }

      public void a(vs $$0) {
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
         $$0.a(this.m, vs::a);
         $$0.a(this.n, vs::a);
         $$0.a(this.o, vs::a);
         $$0.a(this.p, vs::a);
         $$0.a(this.q, iu.b);
         $$0.a(this.r, iu.b);
      }

      public boolean a(iu $$0) {
         return this.q.contains($$0);
      }

      public boolean b(iu $$0) {
         return this.r.contains($$0);
      }
   }
}
