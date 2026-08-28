import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aao(aao.a c) implements aar {
   public static final zf<we, aao> a = aar.a(aao::a, aao::new);
   public static final aar.b<aao> b = aar.a("debug/brain");

   private aao(we $$0) {
      this(new aao.a($$0));
   }

   private void a(we $$0) {
      this.c.a($$0);
   }

   @Override
   public aar.b<aao> a() {
      return b;
   }

   public aao.a b() {
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
      ezh h,
      String i,
      @Nullable ers j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jg> q,
      Set<jg> r
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
            $$0.c(ers::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(we::p),
            $$0.a(we::p),
            $$0.a(we::p),
            $$0.a(we::p),
            $$0.a(HashSet::new, jg.b),
            $$0.a(HashSet::new, jg.b)
         );
      }

      public void a(we $$0) {
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
         $$0.a(this.m, we::a);
         $$0.a(this.n, we::a);
         $$0.a(this.o, we::a);
         $$0.a(this.p, we::a);
         $$0.a(this.q, jg.b);
         $$0.a(this.r, jg.b);
      }

      public boolean a(jg $$0) {
         return this.q.contains($$0);
      }

      public boolean b(jg $$0) {
         return this.r.contains($$0);
      }
   }
}
