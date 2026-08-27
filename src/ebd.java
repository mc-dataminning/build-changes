import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ebd {
   public static final ii<ebe> c = new ii<>();
   protected final dgc<ebd, ebe> d;
   private ebe a;
   private final ib.c<ebd> b = jy.d.f(this);

   protected ebd() {
      dgc.a<ebd, ebe> $$0 = new dgc.a<>(this);
      this.a($$0);
      this.d = $$0.a(ebd::g, ebe::new);
      this.f(this.d.b());
   }

   protected void a(dgc.a<ebd, ebe> $$0) {
   }

   public dgc<ebd, ebe> f() {
      return this.d;
   }

   protected final void f(ebe $$0) {
      this.a = $$0;
   }

   public final ebe g() {
      return this.a;
   }

   public abstract cke a();

   protected void a(cqz $$0, ht $$1, ebe $$2, ate $$3) {
   }

   protected void b(cqz $$0, ht $$1, ebe $$2) {
   }

   protected void b(cqz $$0, ht $$1, ebe $$2, ate $$3) {
   }

   @Nullable
   protected jq h() {
      return null;
   }

   protected abstract boolean a(ebe var1, cqf var2, ht var3, ebd var4, hx var5);

   protected abstract eif a(cqf var1, ht var2, ebe var3);

   public abstract int a(crc var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(ebe var1, cqf var2, ht var3);

   public abstract float a(ebe var1);

   protected abstract dgb b(ebe var1);

   public abstract boolean c(ebe var1);

   public abstract int d(ebe var1);

   public boolean a(ebd $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(arh<ebd> $$0) {
      return this.b.a($$0);
   }

   public abstract eiy b(ebe var1, cqf var2, ht var3);

   public Optional<aqc> j() {
      return Optional.empty();
   }

   @Deprecated
   public ib.c<ebd> k() {
      return this.b;
   }
}
