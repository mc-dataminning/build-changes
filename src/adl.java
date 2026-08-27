import java.util.UUID;
import javax.annotation.Nullable;

public record adl(UUID b, int c, @Nullable xe d, xl.a e, @Nullable ws f, ww g, wo.a h) implements yz<abk> {
   public static final yq<wd, adl> a = yz.a(adl::a, adl::new);

   private adl(wd $$0) {
      this($$0.n(), $$0.l(), $$0.c(xe::a), new xl.a($$0), vs.a($$0, wu.d), ww.a($$0), wo.a.a.decode($$0));
   }

   private void a(wd $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d, xe::a);
      this.e.a($$0);
      vs.a($$0, this.f, wu.d);
      ww.a($$0, this.g);
      wo.a.a.encode($$0, this.h);
   }

   @Override
   public zb<adl> a() {
      return afv.aa;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   @Override
   public boolean c() {
      return true;
   }

   public int e() {
      return this.c;
   }

   @Nullable
   public xe f() {
      return this.d;
   }

   public xl.a g() {
      return this.e;
   }

   @Nullable
   public ws h() {
      return this.f;
   }

   public ww i() {
      return this.g;
   }

   public wo.a j() {
      return this.h;
   }
}
