import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ebd {
   private czw a;
   private dbm b;
   private ht c;
   private boolean d;
   @Nullable
   private dwz e;
   private boolean f;
   @Nullable
   private ats g;
   private int h;
   private final List<ebe> i;
   private boolean j;
   private boolean k;

   public ebd() {
      this.a = czw.a;
      this.b = dbm.a;
      this.c = ht.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ebd a() {
      ebd $$0 = new ebd();
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

   public ebd a(czw $$0) {
      this.a = $$0;
      return this;
   }

   public ebd a(dbm $$0) {
      this.b = $$0;
      return this;
   }

   public ebd a(ht $$0) {
      this.c = $$0;
      return this;
   }

   public ebd a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ebd a(dwz $$0) {
      this.e = $$0;
      return this;
   }

   public ebd a(@Nullable ats $$0) {
      this.g = $$0;
      return this;
   }

   public ebd b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ebd c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ebd b() {
      this.i.clear();
      return this;
   }

   public ebd a(ebe $$0) {
      this.i.add($$0);
      return this;
   }

   public ebd b(ebe $$0) {
      this.i.remove($$0);
      return this;
   }

   public czw c() {
      return this.a;
   }

   public dbm d() {
      return this.b;
   }

   public ht e() {
      return this.c;
   }

   public ats b(@Nullable ht $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ats.a(ac.b()) : ats.a(atm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dwz g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ebe> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ebh.a a(List<ebh.a> $$0, @Nullable ht $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ebd d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
