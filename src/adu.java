import com.google.common.collect.Sets;
import java.util.Set;

public record adu(int b, boolean c, Set<alg<dev>> d, int e, int f, int g, boolean h, boolean i, boolean j, agp k, boolean l) implements zo<acd> {
   public static final zf<ws, adu> a = zo.a(adu::a, adu::new);

   private adu(ws $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(ly.bb)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agp($$0),
         $$0.readBoolean()
      );
   }

   private void a(ws $$0) {
      $$0.q(this.b);
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
   public zq<adu> a() {
      return ags.O;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<alg<dev>> f() {
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

   public agp m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
