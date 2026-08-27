import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class edb {
   private dbl a;
   private ddb b;
   private hx c;
   private boolean d;
   @Nullable
   private dyx e;
   private boolean f;
   @Nullable
   private auu g;
   private int h;
   private final List<edc> i;
   private boolean j;
   private boolean k;

   public edb() {
      this.a = dbl.a;
      this.b = ddb.a;
      this.c = hx.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public edb a() {
      edb $$0 = new edb();
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

   public edb a(dbl $$0) {
      this.a = $$0;
      return this;
   }

   public edb a(ddb $$0) {
      this.b = $$0;
      return this;
   }

   public edb a(hx $$0) {
      this.c = $$0;
      return this;
   }

   public edb a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public edb a(dyx $$0) {
      this.e = $$0;
      return this;
   }

   public edb a(@Nullable auu $$0) {
      this.g = $$0;
      return this;
   }

   public edb b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public edb c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public edb b() {
      this.i.clear();
      return this;
   }

   public edb a(edc $$0) {
      this.i.add($$0);
      return this;
   }

   public edb b(edc $$0) {
      this.i.remove($$0);
      return this;
   }

   public dbl c() {
      return this.a;
   }

   public ddb d() {
      return this.b;
   }

   public hx e() {
      return this.c;
   }

   public auu b(@Nullable hx $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? auu.a(ac.b()) : auu.a(aun.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dyx g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<edc> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public edf.a a(List<edf.a> $$0, @Nullable hx $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public edb d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
