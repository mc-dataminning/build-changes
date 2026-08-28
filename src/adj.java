import com.google.common.collect.Sets;
import java.util.Set;

public record adj(int b, boolean c, Set<ald<dip>> d, int e, int f, int g, boolean h, boolean i, boolean j, agi k, boolean l) implements zd<abs> {
   public static final yu<wh, adj> a = zd.a(adj::a, adj::new);

   private adj(wh $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(mg.bm)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agi($$0),
         $$0.readBoolean()
      );
   }

   private void a(wh $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vs::b);
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
   public zf<adj> a() {
      return agl.O;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<ald<dip>> f() {
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

   public agi m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
