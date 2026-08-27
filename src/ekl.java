import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ekl {
   private dib a;
   private djr b;
   private in c;
   private boolean d;
   @Nullable
   private egh e;
   private boolean f;
   @Nullable
   private ayg g;
   private int h;
   private final List<ekm> i;
   private boolean j;
   private boolean k;

   public ekl() {
      this.a = dib.a;
      this.b = djr.a;
      this.c = in.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ekl a() {
      ekl $$0 = new ekl();
      $$0.a = this.a;
      $$0.b = this.b;
      $$0.c = this.c;
      $$0.d = this.d;
      $$0.e = this.e;
      $$0.f = this.f;
      $$0.g = this.g;
      $$0.h = this.h;
      $$0.i.addAll(this.i);
      $$0.j = this.j;
      $$0.k = this.k;
      return $$0;
   }

   public ekl a(dib $$0) {
      this.a = $$0;
      return this;
   }

   public ekl a(djr $$0) {
      this.b = $$0;
      return this;
   }

   public ekl a(in $$0) {
      this.c = $$0;
      return this;
   }

   public ekl a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ekl a(egh $$0) {
      this.e = $$0;
      return this;
   }

   public ekl a(@Nullable ayg $$0) {
      this.g = $$0;
      return this;
   }

   public ekl b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ekl c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ekl b() {
      this.i.clear();
      return this;
   }

   public ekl a(ekm $$0) {
      this.i.add($$0);
      return this;
   }

   public ekl b(ekm $$0) {
      this.i.remove($$0);
      return this;
   }

   public dib c() {
      return this.a;
   }

   public djr d() {
      return this.b;
   }

   public in e() {
      return this.c;
   }

   public ayg b(@Nullable in $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ayg.a(ac.b()) : ayg.a(axz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public egh g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ekm> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ekp.a a(List<ekp.a> $$0, @Nullable in $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ekl d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
