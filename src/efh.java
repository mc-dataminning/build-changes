import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class efh {
   private ddo a;
   private dfe b;
   private hz c;
   private boolean d;
   @Nullable
   private ebd e;
   private boolean f;
   @Nullable
   private awp g;
   private int h;
   private final List<efi> i;
   private boolean j;
   private boolean k;

   public efh() {
      this.a = ddo.a;
      this.b = dfe.a;
      this.c = hz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public efh a() {
      efh $$0 = new efh();
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

   public efh a(ddo $$0) {
      this.a = $$0;
      return this;
   }

   public efh a(dfe $$0) {
      this.b = $$0;
      return this;
   }

   public efh a(hz $$0) {
      this.c = $$0;
      return this;
   }

   public efh a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public efh a(ebd $$0) {
      this.e = $$0;
      return this;
   }

   public efh a(@Nullable awp $$0) {
      this.g = $$0;
      return this;
   }

   public efh b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public efh c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public efh b() {
      this.i.clear();
      return this;
   }

   public efh a(efi $$0) {
      this.i.add($$0);
      return this;
   }

   public efh b(efi $$0) {
      this.i.remove($$0);
      return this;
   }

   public ddo c() {
      return this.a;
   }

   public dfe d() {
      return this.b;
   }

   public hz e() {
      return this.c;
   }

   public awp b(@Nullable hz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? awp.a(ac.b()) : awp.a(awi.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ebd g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<efi> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public efl.a a(List<efl.a> $$0, @Nullable hz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public efh d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
