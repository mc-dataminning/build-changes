import java.util.Optional;
import javax.annotation.Nullable;

public abstract class elz {
   public static final jc<ema> c = new jc<>();
   protected final dqi<elz, ema> d;
   private ema a;
   private final iw.c<elz> b = ld.c.f(this);

   protected elz() {
      dqi.a<elz, ema> $$0 = new dqi.a<>(this);
      this.a($$0);
      this.d = $$0.a(elz::g, ema::new);
      this.f(this.d.b());
   }

   protected void a(dqi.a<elz, ema> $$0) {
   }

   public dqi<elz, ema> f() {
      return this.d;
   }

   protected final void f(ema $$0) {
      this.a = $$0;
   }

   public final ema g() {
      return this.a;
   }

   public abstract csu a();

   protected void a(dad $$0, in $$1, ema $$2, ayg $$3) {
   }

   protected void b(dad $$0, in $$1, ema $$2) {
   }

   protected void b(dad $$0, in $$1, ema $$2, ayg $$3) {
   }

   @Nullable
   protected kv h() {
      return null;
   }

   protected abstract boolean a(ema var1, czj var2, in var3, elz var4, is var5);

   protected abstract etp a(czj var1, in var2, ema var3);

   public abstract int a(dag var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ema var1, czj var2, in var3);

   public abstract float a(ema var1);

   protected abstract dqh b(ema var1);

   public abstract boolean c(ema var1);

   public abstract int d(ema var1);

   public boolean a(elz $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awg<elz> $$0) {
      return this.b.a($$0);
   }

   public abstract eui b(ema var1, czj var2, in var3);

   public Optional<avb> j() {
      return Optional.empty();
   }

   @Deprecated
   public iw.c<elz> k() {
      return this.b;
   }
}
