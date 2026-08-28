import com.google.common.collect.Sets;
import java.util.Set;

public record ady(int b, boolean c, Set<alo<dgz>> d, int e, int f, int g, boolean h, boolean i, boolean j, agw k, boolean l) implements zr<acg> {
   public static final zi<wv, ady> a = zr.a(ady::a, ady::new);

   private ady(wv $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(mb.be)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agw($$0),
         $$0.readBoolean()
      );
   }

   private void a(wv $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wh::b);
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
   public zt<ady> a() {
      return agz.O;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<alo<dgz>> f() {
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

   public agw m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
