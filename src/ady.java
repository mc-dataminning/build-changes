import com.google.common.collect.Sets;
import java.util.Set;

public record ady(int b, boolean c, Set<alk<dff>> d, int e, int f, int g, boolean h, boolean i, boolean j, agt k, boolean l) implements zs<ach> {
   public static final zj<ww, ady> a = zs.a(ady::a, ady::new);

   private ady(ww $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ma.bb)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agt($$0),
         $$0.readBoolean()
      );
   }

   private void a(ww $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wi::b);
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
   public zu<ady> a() {
      return agw.O;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<alk<dff>> f() {
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

   public agt m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
