import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaq(aaq.a c) implements aat {
   public static final ze<vy, aaq> a = aat.a(aaq::a, aaq::new);
   public static final aat.b<aaq> b = aat.a("debug/brain");

   private aaq(vy $$0) {
      this(new aaq.a($$0));
   }

   private void a(vy $$0) {
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
      fgc h,
      String i,
      @Nullable eyo j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<iw> q,
      Set<iw> r
   ) {
      public a(vy $$0) {
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
            $$0.c(eyo::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vy::p),
            $$0.a(vy::p),
            $$0.a(vy::p),
            $$0.a(vy::p),
            $$0.a(HashSet::new, iw.b),
            $$0.a(HashSet::new, iw.b)
         );
      }

      public void a(vy $$0) {
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
         $$0.a(this.m, vy::a);
         $$0.a(this.n, vy::a);
         $$0.a(this.o, vy::a);
         $$0.a(this.p, vy::a);
         $$0.a(this.q, iw.b);
         $$0.a(this.r, iw.b);
      }

      public boolean a(iw $$0) {
         return this.q.contains($$0);
      }

      public boolean b(iw $$0) {
         return this.r.contains($$0);
      }
   }
}
