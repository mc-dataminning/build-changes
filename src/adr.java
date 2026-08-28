import com.google.common.collect.Sets;
import java.util.Set;

public record adr(int b, boolean c, Set<ald<dej>> d, int e, int f, int g, boolean h, boolean i, boolean j, agm k, boolean l) implements zl<aca> {
   public static final zc<wp, adr> a = zl.a(adr::a, adr::new);

   private adr(wp $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lw.bc)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agm($$0),
         $$0.readBoolean()
      );
   }

   private void a(wp $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wb::b);
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
   public zn<adr> a() {
      return agp.O;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ald<dej>> f() {
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

   public agm m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
