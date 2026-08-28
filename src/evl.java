import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class evl {
   private dru a;
   private dtl b;
   private iv c;
   private boolean d;
   @Nullable
   private erf e;
   private euz f;
   @Nullable
   private azv g;
   private int h;
   private final List<evm> i;
   private boolean j;
   private boolean k;

   public evl() {
      this.a = dru.a;
      this.b = dtl.a;
      this.c = iv.c;
      this.f = euz.b;
      this.i = Lists.newArrayList();
   }

   public evl a() {
      evl $$0 = new evl();
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

   public evl a(dru $$0) {
      this.a = $$0;
      return this;
   }

   public evl a(dtl $$0) {
      this.b = $$0;
      return this;
   }

   public evl a(iv $$0) {
      this.c = $$0;
      return this;
   }

   public evl a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public evl a(erf $$0) {
      this.e = $$0;
      return this;
   }

   public evl a(@Nullable azv $$0) {
      this.g = $$0;
      return this;
   }

   public evl a(euz $$0) {
      this.f = $$0;
      return this;
   }

   public evl b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public evl b() {
      this.i.clear();
      return this;
   }

   public evl a(evm $$0) {
      this.i.add($$0);
      return this;
   }

   public evl b(evm $$0) {
      this.i.remove($$0);
      return this;
   }

   public dru c() {
      return this.a;
   }

   public dtl d() {
      return this.b;
   }

   public iv e() {
      return this.c;
   }

   public azv b(@Nullable iv $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azv.a(ag.c()) : azv.a(azm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public erf g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<evm> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == euz.b;
   }

   public evp.b a(List<evp.b> $$0, @Nullable iv $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public evl c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
