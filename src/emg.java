import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emg {
   private djw a;
   private dlm b;
   private iz c;
   private boolean d;
   @Nullable
   private eic e;
   private boolean f;
   @Nullable
   private azh g;
   private int h;
   private final List<emh> i;
   private boolean j;
   private boolean k;

   public emg() {
      this.a = djw.a;
      this.b = dlm.a;
      this.c = iz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emg a() {
      emg $$0 = new emg();
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

   public emg a(djw $$0) {
      this.a = $$0;
      return this;
   }

   public emg a(dlm $$0) {
      this.b = $$0;
      return this;
   }

   public emg a(iz $$0) {
      this.c = $$0;
      return this;
   }

   public emg a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emg a(eic $$0) {
      this.e = $$0;
      return this;
   }

   public emg a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public emg b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emg c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emg b() {
      this.i.clear();
      return this;
   }

   public emg a(emh $$0) {
      this.i.add($$0);
      return this;
   }

   public emg b(emh $$0) {
      this.i.remove($$0);
      return this;
   }

   public djw c() {
      return this.a;
   }

   public dlm d() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public azh b(@Nullable iz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azh.a(ac.c()) : azh.a(ayz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eic g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emh> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emk.a a(List<emk.a> $$0, @Nullable iz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emg d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
