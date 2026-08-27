import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class edc {
   private dbm a;
   private ddc b;
   private hx c;
   private boolean d;
   @Nullable
   private dyy e;
   private boolean f;
   @Nullable
   private auv g;
   private int h;
   private final List<edd> i;
   private boolean j;
   private boolean k;

   public edc() {
      this.a = dbm.a;
      this.b = ddc.a;
      this.c = hx.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public edc a() {
      edc $$0 = new edc();
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

   public edc a(dbm $$0) {
      this.a = $$0;
      return this;
   }

   public edc a(ddc $$0) {
      this.b = $$0;
      return this;
   }

   public edc a(hx $$0) {
      this.c = $$0;
      return this;
   }

   public edc a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public edc a(dyy $$0) {
      this.e = $$0;
      return this;
   }

   public edc a(@Nullable auv $$0) {
      this.g = $$0;
      return this;
   }

   public edc b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public edc c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public edc b() {
      this.i.clear();
      return this;
   }

   public edc a(edd $$0) {
      this.i.add($$0);
      return this;
   }

   public edc b(edd $$0) {
      this.i.remove($$0);
      return this;
   }

   public dbm c() {
      return this.a;
   }

   public ddc d() {
      return this.b;
   }

   public hx e() {
      return this.c;
   }

   public auv b(@Nullable hx $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? auv.a(ac.b()) : auv.a(auo.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dyy g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<edd> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public edg.a a(List<edg.a> $$0, @Nullable hx $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public edc d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
