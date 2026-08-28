import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaq(aaq.a c) implements aat {
   public static final zj<wl, aaq> a = aat.a(aaq::a, aaq::new);
   public static final aat.b<aaq> b = aat.a("debug/brain");

   private aaq(wl $$0) {
      this(new aaq.a($$0));
   }

   private void a(wl $$0) {
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
      evm h,
      String i,
      @Nullable eoe j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<iz> q,
      Set<iz> r
   ) {
      public a(wl $$0) {
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
            $$0.c(eoe::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(wl::p),
            $$0.a(wl::p),
            $$0.a(wl::p),
            $$0.a(wl::p),
            $$0.a(HashSet::new, iz.b),
            $$0.a(HashSet::new, iz.b)
         );
      }

      public void a(wl $$0) {
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
         $$0.a(this.m, wl::a);
         $$0.a(this.n, wl::a);
         $$0.a(this.o, wl::a);
         $$0.a(this.p, wl::a);
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
