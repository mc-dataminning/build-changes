import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eru {
   public static final jw<erv> c = new jw<>();
   protected final dvw<eru, erv> d;
   private erv a;
   private final jq.c<eru> b = lz.c.f(this);

   protected eru() {
      dvw.a<eru, erv> $$0 = new dvw.a<>(this);
      this.a($$0);
      this.d = $$0.a(eru::g, erv::new);
      this.f(this.d.b());
   }

   protected void a(dvw.a<eru, erv> $$0) {
   }

   public dvw<eru, erv> f() {
      return this.d;
   }

   protected final void f(erv $$0) {
      this.a = $$0;
   }

   public final erv g() {
      return this.a;
   }

   public abstract cwi a();

   protected void a(dfm $$0, jh $$1, erv $$2, azu $$3) {
   }

   protected void b(arp $$0, jh $$1, dvv $$2, erv $$3) {
   }

   protected void a(arp $$0, jh $$1, erv $$2, azu $$3) {
   }

   @Nullable
   protected lq h() {
      return null;
   }

   protected abstract boolean a(erv var1, der var2, jh var3, eru var4, jm var5);

   protected abstract ezy a(der var1, jh var2, erv var3);

   public abstract int a(dfp var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(erv var1, der var2, jh var3);

   public abstract float a(erv var1);

   protected abstract dvv b(erv var1);

   public abstract boolean c(erv var1);

   public abstract int d(erv var1);

   public boolean a(eru $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(axs<eru> $$0) {
      return this.b.a($$0);
   }

   public abstract fas b(erv var1, der var2, jh var3);

   public Optional<awm> j() {
      return Optional.empty();
   }

   @Deprecated
   public jq.c<eru> k() {
      return this.b;
   }
}
