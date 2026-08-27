import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class edk {
   private dbu a;
   private ddk b;
   private hx c;
   private boolean d;
   @Nullable
   private dzg e;
   private boolean f;
   @Nullable
   private auw g;
   private int h;
   private final List<edl> i;
   private boolean j;
   private boolean k;

   public edk() {
      this.a = dbu.a;
      this.b = ddk.a;
      this.c = hx.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public edk a() {
      edk $$0 = new edk();
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

   public edk a(dbu $$0) {
      this.a = $$0;
      return this;
   }

   public edk a(ddk $$0) {
      this.b = $$0;
      return this;
   }

   public edk a(hx $$0) {
      this.c = $$0;
      return this;
   }

   public edk a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public edk a(dzg $$0) {
      this.e = $$0;
      return this;
   }

   public edk a(@Nullable auw $$0) {
      this.g = $$0;
      return this;
   }

   public edk b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public edk c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public edk b() {
      this.i.clear();
      return this;
   }

   public edk a(edl $$0) {
      this.i.add($$0);
      return this;
   }

   public edk b(edl $$0) {
      this.i.remove($$0);
      return this;
   }

   public dbu c() {
      return this.a;
   }

   public ddk d() {
      return this.b;
   }

   public hx e() {
      return this.c;
   }

   public auw b(@Nullable hx $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? auw.a(ac.b()) : auw.a(aup.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dzg g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<edl> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public edo.a a(List<edo.a> $$0, @Nullable hx $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public edk d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
