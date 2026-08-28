import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aao(aao.a c) implements aas {
   public static final zg<wf, aao> a = aas.a(aao::a, aao::new);
   public static final aas.b<aao> b = aas.a("debug/bee");

   private aao(wf $$0) {
      this(new aao.a($$0));
   }

   private void a(wf $$0) {
      this.c.a($$0);
   }

   @Override
   public aas.b<aao> a() {
      return b;
   }

   public aao.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ezn c, @Nullable ery d, @Nullable jh e, @Nullable jh f, int g, Set<String> h, List<jh> i) {
      public a(wf $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(ery::b), $$0.c(jh.b), $$0.c(jh.b), $$0.readInt(), $$0.a(HashSet::new, wf::p), $$0.a(jh.b));
      }

      public void a(wf $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jh.b);
         $$0.a(this.f, jh.b);
         $$0.q(this.g);
         $$0.a(this.h, wf::a);
         $$0.a(this.i, jh.b);
      }

      public boolean a(jh $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agr.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public ezn d() {
         return this.c;
      }

      @Nullable
      public ery e() {
         return this.d;
      }

      @Nullable
      public jh f() {
         return this.e;
      }

      @Nullable
      public jh g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jh> j() {
         return this.i;
      }
   }
}
