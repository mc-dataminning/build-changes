import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aah(aah.a c) implements aak {
   public static final yy<vw, aah> a = aak.a(aah::a, aah::new);
   public static final aak.b<aah> b = aak.a("debug/brain");

   private aah(vw $$0) {
      this(new aah.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aak.b<aah> a() {
      return b;
   }

   public aah.a b() {
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
      ffq h,
      String i,
      @Nullable eyc j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<iv> q,
      Set<iv> r
   ) {
      public a(vw $$0) {
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
            $$0.c(eyc::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vw::p),
            $$0.a(vw::p),
            $$0.a(vw::p),
            $$0.a(vw::p),
            $$0.a(HashSet::new, iv.b),
            $$0.a(HashSet::new, iv.b)
         );
      }

      public void a(vw $$0) {
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
         $$0.a(this.m, vw::a);
         $$0.a(this.n, vw::a);
         $$0.a(this.o, vw::a);
         $$0.a(this.p, vw::a);
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
