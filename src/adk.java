import com.google.common.collect.Sets;
import java.util.Set;

public record adk(int b, boolean c, Set<akp<dcu>> d, int e, int f, int g, boolean h, boolean i, boolean j, agc k, boolean l) implements zf<abt> {
   public static final yw<wj, adk> a = zf.a(adk::a, adk::new);

   private adk(wj $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(lu.ba)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new agc($$0),
         $$0.readBoolean()
      );
   }

   private void a(wj $$0) {
      $$0.p(this.b);
      $$0.a(this.c);
      $$0.a(this.d, vv::b);
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
   public zh<adk> a() {
      return agf.O;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<akp<dcu>> f() {
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

   public agc m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
