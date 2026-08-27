import java.util.Optional;
import javax.annotation.Nullable;

public abstract class emt {
   public static final jd<emu> c = new jd<>();
   protected final drc<emt, emu> d;
   private emu a;
   private final ix.c<emt> b = le.c.f(this);

   protected emt() {
      drc.a<emt, emu> $$0 = new drc.a<>(this);
      this.a($$0);
      this.d = $$0.a(emt::g, emu::new);
      this.f(this.d.b());
   }

   protected void a(drc.a<emt, emu> $$0) {
   }

   public drc<emt, emu> f() {
      return this.d;
   }

   protected final void f(emu $$0) {
      this.a = $$0;
   }

   public final emu g() {
      return this.a;
   }

   public abstract ctj a();

   protected void a(dax $$0, io $$1, emu $$2, ayk $$3) {
   }

   protected void b(dax $$0, io $$1, emu $$2) {
   }

   protected void b(dax $$0, io $$1, emu $$2, ayk $$3) {
   }

   @Nullable
   protected kw h() {
      return null;
   }

   protected abstract boolean a(emu var1, dad var2, io var3, emt var4, it var5);

   protected abstract euk a(dad var1, io var2, emu var3);

   public abstract int a(dba var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(emu var1, dad var2, io var3);

   public abstract float a(emu var1);

   protected abstract drb b(emu var1);

   public abstract boolean c(emu var1);

   public abstract int d(emu var1);

   public boolean a(emt $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(awl<emt> $$0) {
      return this.b.a($$0);
   }

   public abstract evd b(emu var1, dad var2, io var3);

   public Optional<avg> j() {
      return Optional.empty();
   }

   @Deprecated
   public ix.c<emt> k() {
      return this.b;
   }
}
