import com.google.common.collect.Sets;
import java.util.Set;

public record ado(int b, boolean c, Set<aks<dca>> d, int e, int f, int g, boolean h, boolean i, boolean j, agg k, boolean l) implements zl<abw> {
   public static final zc<wp, ado> a = zl.a(ado::a, ado::new);

   private ado(wp $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(li.aS)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agg($$0),
         $$0.readBoolean()
      );
   }

   private void a(wp $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, we::b);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.c(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.j);
      this.k.a($$0);
      $$0.a(this.l);
   }

   @Override
   public zn<ado> a() {
      return agj.P;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<aks<dca>> f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public boolean k() {
      return this.i;
   }

   public boolean l() {
      return this.j;
   }

   public agg m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
