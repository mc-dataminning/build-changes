import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dyx {
   private cxq a;
   private czh b;
   private gw c;
   private boolean d;
   @Nullable
   private dva e;
   private boolean f;
   @Nullable
   private asc g;
   private int h;
   private final List<dyy> i;
   private boolean j;
   private boolean k;

   public dyx() {
      this.a = cxq.a;
      this.b = czh.a;
      this.c = gw.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dyx a() {
      dyx $$0 = new dyx();
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

   public dyx a(cxq $$0) {
      this.a = $$0;
      return this;
   }

   public dyx a(czh $$0) {
      this.b = $$0;
      return this;
   }

   public dyx a(gw $$0) {
      this.c = $$0;
      return this;
   }

   public dyx a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dyx a(dva $$0) {
      this.e = $$0;
      return this;
   }

   public dyx a(@Nullable asc $$0) {
      this.g = $$0;
      return this;
   }

   public dyx b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dyx c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dyx b() {
      this.i.clear();
      return this;
   }

   public dyx a(dyy $$0) {
      this.i.add($$0);
      return this;
   }

   public dyx b(dyy $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxq c() {
      return this.a;
   }

   public czh d() {
      return this.b;
   }

   public gw e() {
      return this.c;
   }

   public asc b(@Nullable gw $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? asc.a(ac.b()) : asc.a(arw.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dva g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dyy> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dzb.a a(List<dzb.a> $$0, @Nullable gw $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dyx d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
