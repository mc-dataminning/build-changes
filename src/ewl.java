import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ewl {
   private dsr a;
   private dui b;
   private iw c;
   private boolean d;
   @Nullable
   private esf e;
   private evz f;
   @Nullable
   private bai g;
   private int h;
   private final List<ewm> i;
   private boolean j;
   private boolean k;

   public ewl() {
      this.a = dsr.a;
      this.b = dui.a;
      this.c = iw.c;
      this.f = evz.b;
      this.i = Lists.newArrayList();
   }

   public ewl a() {
      ewl $$0 = new ewl();
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

   public ewl a(dsr $$0) {
      this.a = $$0;
      return this;
   }

   public ewl a(dui $$0) {
      this.b = $$0;
      return this;
   }

   public ewl a(iw $$0) {
      this.c = $$0;
      return this;
   }

   public ewl a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ewl a(esf $$0) {
      this.e = $$0;
      return this;
   }

   public ewl a(@Nullable bai $$0) {
      this.g = $$0;
      return this;
   }

   public ewl a(evz $$0) {
      this.f = $$0;
      return this;
   }

   public ewl b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ewl b() {
      this.i.clear();
      return this;
   }

   public ewl a(ewm $$0) {
      this.i.add($$0);
      return this;
   }

   public ewl b(ewm $$0) {
      this.i.remove($$0);
      return this;
   }

   public dsr c() {
      return this.a;
   }

   public dui d() {
      return this.b;
   }

   public iw e() {
      return this.c;
   }

   public bai b(@Nullable iw $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? bai.a(ag.c()) : bai.a(azz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public esf g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ewm> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == evz.b;
   }

   public ewp.b a(List<ewp.b> $$0, @Nullable iw $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ewl c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
