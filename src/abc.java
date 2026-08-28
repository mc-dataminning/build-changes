import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record abc(abc.a c) implements abf {
   public static final zt<ws, abc> a = abf.a(abc::a, abc::new);
   public static final abf.b<abc> b = abf.a("debug/brain");

   private abc(ws $$0) {
      this(new abc.a($$0));
   }

   private void a(ws $$0) {
      this.c.a($$0);
   }

   @Override
   public abf.b<abc> a() {
      return b;
   }

   public abc.a b() {
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
      fby h,
      String i,
      @Nullable eul j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jh> q,
      Set<jh> r
   ) {
      public a(ws $$0) {
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
            $$0.c(eul::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(ws::p),
            $$0.a(ws::p),
            $$0.a(ws::p),
            $$0.a(ws::p),
            $$0.a(HashSet::new, jh.b),
            $$0.a(HashSet::new, jh.b)
         );
      }

      public void a(ws $$0) {
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
         $$0.a(this.m, ws::a);
         $$0.a(this.n, ws::a);
         $$0.a(this.o, ws::a);
         $$0.a(this.p, ws::a);
         $$0.a(this.q, jh.b);
         $$0.a(this.r, jh.b);
      }

      public boolean a(jh $$0) {
         return this.q.contains($$0);
      }

      public boolean b(jh $$0) {
         return this.r.contains($$0);
      }
   }
}
