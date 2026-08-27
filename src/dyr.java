import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dyr {
   private cxx a;
   private czn b;
   private gw c;
   private boolean d;
   @Nullable
   private duu e;
   private boolean f;
   @Nullable
   private ash g;
   private int h;
   private final List<dys> i;
   private boolean j;
   private boolean k;

   public dyr() {
      this.a = cxx.a;
      this.b = czn.a;
      this.c = gw.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dyr a() {
      dyr $$0 = new dyr();
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

   public dyr a(cxx $$0) {
      this.a = $$0;
      return this;
   }

   public dyr a(czn $$0) {
      this.b = $$0;
      return this;
   }

   public dyr a(gw $$0) {
      this.c = $$0;
      return this;
   }

   public dyr a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dyr a(duu $$0) {
      this.e = $$0;
      return this;
   }

   public dyr a(@Nullable ash $$0) {
      this.g = $$0;
      return this;
   }

   public dyr b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dyr c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dyr b() {
      this.i.clear();
      return this;
   }

   public dyr a(dys $$0) {
      this.i.add($$0);
      return this;
   }

   public dyr b(dys $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxx c() {
      return this.a;
   }

   public czn d() {
      return this.b;
   }

   public gw e() {
      return this.c;
   }

   public ash b(@Nullable gw $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ash.a(ac.b()) : ash.a(asb.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public duu g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dys> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dyv.a a(List<dyv.a> $$0, @Nullable gw $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dyr d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
