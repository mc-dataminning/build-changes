import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class erl {
   private dom a;
   private dqf b;
   private ji c;
   private boolean d;
   @Nullable
   private enf e;
   private eqz f;
   @Nullable
   private azh g;
   private int h;
   private final List<erm> i;
   private boolean j;
   private boolean k;

   public erl() {
      this.a = dom.a;
      this.b = dqf.a;
      this.c = ji.c;
      this.f = eqz.b;
      this.i = Lists.newArrayList();
   }

   public erl a() {
      erl $$0 = new erl();
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

   public erl a(dom $$0) {
      this.a = $$0;
      return this;
   }

   public erl a(dqf $$0) {
      this.b = $$0;
      return this;
   }

   public erl a(ji $$0) {
      this.c = $$0;
      return this;
   }

   public erl a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public erl a(enf $$0) {
      this.e = $$0;
      return this;
   }

   public erl a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public erl a(eqz $$0) {
      this.f = $$0;
      return this;
   }

   public erl b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public erl b() {
      this.i.clear();
      return this;
   }

   public erl a(erm $$0) {
      this.i.add($$0);
      return this;
   }

   public erl b(erm $$0) {
      this.i.remove($$0);
      return this;
   }

   public dom c() {
      return this.a;
   }

   public dqf d() {
      return this.b;
   }

   public ji e() {
      return this.c;
   }

   public azh b(@Nullable ji $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azh.a(af.c()) : azh.a(ayz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public enf g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<erm> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eqz.b;
   }

   public erp.b a(List<erp.b> $$0, @Nullable ji $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public erl c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
