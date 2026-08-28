import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aal(aal.a c) implements aao {
   public static final zc<wb, aal> a = aao.a(aal::a, aal::new);
   public static final aao.b<aal> b = aao.a("debug/brain");

   private aal(wb $$0) {
      this(new aal.a($$0));
   }

   private void a(wb $$0) {
      this.c.a($$0);
   }

   @Override
   public aao.b<aal> a() {
      return b;
   }

   public aal.a b() {
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
      eyw h,
      String i,
      @Nullable erh j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jf> q,
      Set<jf> r
   ) {
      public a(wb $$0) {
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
            $$0.c(erh::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(wb::p),
            $$0.a(wb::p),
            $$0.a(wb::p),
            $$0.a(wb::p),
            $$0.a(HashSet::new, jf.b),
            $$0.a(HashSet::new, jf.b)
         );
      }

      public void a(wb $$0) {
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
         $$0.a(this.m, wb::a);
         $$0.a(this.n, wb::a);
         $$0.a(this.o, wb::a);
         $$0.a(this.p, wb::a);
         $$0.a(this.q, jf.b);
         $$0.a(this.r, jf.b);
      }

      public boolean a(jf $$0) {
         return this.q.contains($$0);
      }

      public boolean b(jf $$0) {
         return this.r.contains($$0);
      }
   }
}
