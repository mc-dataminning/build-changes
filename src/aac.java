import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aac(aac.a c) implements aaf {
   public static final yv<vx, aac> a = aaf.a(aac::a, aac::new);
   public static final aaf.b<aac> b = aaf.a("debug/brain");

   private aac(vx $$0) {
      this(new aac.a($$0));
   }

   private void a(vx $$0) {
      this.c.a($$0);
   }

   @Override
   public aaf.b<aac> a() {
      return b;
   }

   public aac.a b() {
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
      eum h,
      String i,
      @Nullable enk j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<io> q,
      Set<io> r
   ) {
      public a(vx $$0) {
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
            $$0.c(enk::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vx::p),
            $$0.a(vx::p),
            $$0.a(vx::p),
            $$0.a(vx::p),
            $$0.a(HashSet::new, io.b),
            $$0.a(HashSet::new, io.b)
         );
      }

      public void a(vx $$0) {
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
         $$0.a(this.m, vx::a);
         $$0.a(this.n, vx::a);
         $$0.a(this.o, vx::a);
         $$0.a(this.p, vx::a);
         $$0.a(this.q, io.b);
         $$0.a(this.r, io.b);
      }

      public boolean a(io $$0) {
         return this.q.contains($$0);
      }

      public boolean b(io $$0) {
         return this.r.contains($$0);
      }
   }
}
