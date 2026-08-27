import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dys {
   private cxl a;
   private czc b;
   private gw c;
   private boolean d;
   @Nullable
   private duv e;
   private boolean f;
   @Nullable
   private arx g;
   private int h;
   private final List<dyt> i;
   private boolean j;
   private boolean k;

   public dys() {
      this.a = cxl.a;
      this.b = czc.a;
      this.c = gw.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dys a() {
      dys $$0 = new dys();
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

   public dys a(cxl $$0) {
      this.a = $$0;
      return this;
   }

   public dys a(czc $$0) {
      this.b = $$0;
      return this;
   }

   public dys a(gw $$0) {
      this.c = $$0;
      return this;
   }

   public dys a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dys a(duv $$0) {
      this.e = $$0;
      return this;
   }

   public dys a(@Nullable arx $$0) {
      this.g = $$0;
      return this;
   }

   public dys b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dys c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dys b() {
      this.i.clear();
      return this;
   }

   public dys a(dyt $$0) {
      this.i.add($$0);
      return this;
   }

   public dys b(dyt $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxl c() {
      return this.a;
   }

   public czc d() {
      return this.b;
   }

   public gw e() {
      return this.c;
   }

   public arx b(@Nullable gw $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? arx.a(ac.b()) : arx.a(ars.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public duv g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dyt> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dyw.a a(List<dyw.a> $$0, @Nullable gw $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dys d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
