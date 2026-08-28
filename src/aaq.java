import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaq(aaq.a c) implements aat {
   public static final zh<wg, aaq> a = aat.a(aaq::a, aaq::new);
   public static final aat.b<aaq> b = aat.a("debug/brain");

   private aaq(wg $$0) {
      this(new aaq.a($$0));
   }

   private void a(wg $$0) {
      this.c.a($$0);
   }

   @Override
   public aat.b<aaq> a() {
      return b;
   }

   public aaq.a b() {
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
      ezy h,
      String i,
      @Nullable esj j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jh> q,
      Set<jh> r
   ) {
      public a(wg $$0) {
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
            $$0.c(esj::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(wg::p),
            $$0.a(wg::p),
            $$0.a(wg::p),
            $$0.a(wg::p),
            $$0.a(HashSet::new, jh.b),
            $$0.a(HashSet::new, jh.b)
         );
      }

      public void a(wg $$0) {
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
         $$0.a(this.m, wg::a);
         $$0.a(this.n, wg::a);
         $$0.a(this.o, wg::a);
         $$0.a(this.p, wg::a);
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
