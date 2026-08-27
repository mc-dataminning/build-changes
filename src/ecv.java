import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ecv {
   private dbf a;
   private dcv b;
   private hx c;
   private boolean d;
   @Nullable
   private dyr e;
   private boolean f;
   @Nullable
   private aup g;
   private int h;
   private final List<ecw> i;
   private boolean j;
   private boolean k;

   public ecv() {
      this.a = dbf.a;
      this.b = dcv.a;
      this.c = hx.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ecv a() {
      ecv $$0 = new ecv();
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

   public ecv a(dbf $$0) {
      this.a = $$0;
      return this;
   }

   public ecv a(dcv $$0) {
      this.b = $$0;
      return this;
   }

   public ecv a(hx $$0) {
      this.c = $$0;
      return this;
   }

   public ecv a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ecv a(dyr $$0) {
      this.e = $$0;
      return this;
   }

   public ecv a(@Nullable aup $$0) {
      this.g = $$0;
      return this;
   }

   public ecv b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ecv c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ecv b() {
      this.i.clear();
      return this;
   }

   public ecv a(ecw $$0) {
      this.i.add($$0);
      return this;
   }

   public ecv b(ecw $$0) {
      this.i.remove($$0);
      return this;
   }

   public dbf c() {
      return this.a;
   }

   public dcv d() {
      return this.b;
   }

   public hx e() {
      return this.c;
   }

   public aup b(@Nullable hx $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? aup.a(ac.b()) : aup.a(aui.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dyr g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ecw> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ecz.a a(List<ecz.a> $$0, @Nullable hx $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ecv d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
