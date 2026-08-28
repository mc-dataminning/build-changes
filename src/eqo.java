import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eqo {
   public static final jt<eqp> c = new jt<>();
   protected final dup<eqo, eqp> d;
   private eqp a;
   private final jn.c<eqo> b = lu.c.f(this);

   protected eqo() {
      dup.a<eqo, eqp> $$0 = new dup.a<>(this);
      this.a($$0);
      this.d = $$0.a(eqo::g, eqp::new);
      this.f(this.d.b());
   }

   protected void a(dup.a<eqo, eqp> $$0) {
   }

   public dup<eqo, eqp> f() {
      return this.d;
   }

   protected final void f(eqp $$0) {
      this.a = $$0;
   }

   public final eqp g() {
      return this.a;
   }

   public abstract cvk a();

   protected void a(deg $$0, je $$1, eqp $$2, azl $$3) {
   }

   protected void b(deg $$0, je $$1, duo $$2, eqp $$3) {
   }

   protected void b(deg $$0, je $$1, eqp $$2, azl $$3) {
   }

   @Nullable
   protected ll h() {
      return null;
   }

   protected abstract boolean a(eqp var1, ddl var2, je var3, eqo var4, jj var5);

   protected abstract eys a(ddl var1, je var2, eqp var3);

   public abstract int a(dej var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(eqp var1, ddl var2, je var3);

   public abstract float a(eqp var1);

   protected abstract duo b(eqp var1);

   public abstract boolean c(eqp var1);

   public abstract int d(eqp var1);

   public boolean a(eqo $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axj<eqo> $$0) {
      return this.b.a($$0);
   }

   public abstract ezm b(eqp var1, ddl var2, je var3);

   public Optional<awd> j() {
      return Optional.empty();
   }

   @Deprecated
   public jn.c<eqo> k() {
      return this.b;
   }
}
