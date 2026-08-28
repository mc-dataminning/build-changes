import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aac(aac.a c) implements aaf {
   public static final yt<vr, aac> a = aaf.a(aac::a, aac::new);
   public static final aaf.b<aac> b = aaf.a("debug/brain");

   private aac(vr $$0) {
      this(new aac.a($$0));
   }

   private void a(vr $$0) {
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
      fcu h,
      String i,
      @Nullable evh j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<jj> q,
      Set<jj> r
   ) {
      public a(vr $$0) {
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
            $$0.c(evh::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(vr::p),
            $$0.a(vr::p),
            $$0.a(vr::p),
            $$0.a(vr::p),
            $$0.a(HashSet::new, jj.b),
            $$0.a(HashSet::new, jj.b)
         );
      }

      public void a(vr $$0) {
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
         $$0.a(this.m, vr::a);
         $$0.a(this.n, vr::a);
         $$0.a(this.o, vr::a);
         $$0.a(this.p, vr::a);
         $$0.a(this.q, jj.b);
         $$0.a(this.r, jj.b);
      }

      public boolean a(jj $$0) {
         return this.q.contains($$0);
      }

      public boolean b(jj $$0) {
         return this.r.contains($$0);
      }
   }
}
