import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aar(aar.a c) implements aau {
   public static final zi<wh, aar> a = aau.a(aar::a, aar::new);
   public static final aau.b<aar> b = aau.a("debug/brain");

   private aar(wh $$0) {
      this(new aar.a($$0));
   }

   private void a(wh $$0) {
      this.c.a($$0);
   }

   @Override
   public aau.b<aar> a() {
      return b;
   }

   public aar.a b() {
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
      fbr h,
      String i,
      @Nullable eue j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jh> q,
      Set<jh> r
   ) {
      public a(wh $$0) {
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
            $$0.c(eue::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(wh::p),
            $$0.a(wh::p),
            $$0.a(wh::p),
            $$0.a(wh::p),
            $$0.a(HashSet::new, jh.b),
            $$0.a(HashSet::new, jh.b)
         );
      }

      public void a(wh $$0) {
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
         $$0.a(this.m, wh::a);
         $$0.a(this.n, wh::a);
         $$0.a(this.o, wh::a);
         $$0.a(this.p, wh::a);
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
