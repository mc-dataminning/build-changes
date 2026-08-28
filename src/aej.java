import com.google.common.collect.Sets;
import java.util.Set;

public record aej(int b, boolean c, Set<aly<dha>> d, int e, int f, int g, boolean h, boolean i, boolean j, ahh k, boolean l) implements aac<acr> {
   public static final zt<xg, aej> a = aac.a(aej::a, aej::new);

   private aej(xg $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(mb.bd)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new ahh($$0),
         $$0.readBoolean()
      );
   }

   private void a(xg $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, ws::b);
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
   public aae<aej> a() {
      return ahk.O;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<aly<dha>> f() {
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

   public ahh m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
