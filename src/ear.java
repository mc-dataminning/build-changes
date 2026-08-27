import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ear {
   private czp a;
   private dbf b;
   private ht c;
   private boolean d;
   @Nullable
   private dwn e;
   private boolean f;
   @Nullable
   private ato g;
   private int h;
   private final List<eas> i;
   private boolean j;
   private boolean k;

   public ear() {
      this.a = czp.a;
      this.b = dbf.a;
      this.c = ht.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ear a() {
      ear $$0 = new ear();
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

   public ear a(czp $$0) {
      this.a = $$0;
      return this;
   }

   public ear a(dbf $$0) {
      this.b = $$0;
      return this;
   }

   public ear a(ht $$0) {
      this.c = $$0;
      return this;
   }

   public ear a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ear a(dwn $$0) {
      this.e = $$0;
      return this;
   }

   public ear a(@Nullable ato $$0) {
      this.g = $$0;
      return this;
   }

   public ear b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ear c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ear b() {
      this.i.clear();
      return this;
   }

   public ear a(eas $$0) {
      this.i.add($$0);
      return this;
   }

   public ear b(eas $$0) {
      this.i.remove($$0);
      return this;
   }

   public czp c() {
      return this.a;
   }

   public dbf d() {
      return this.b;
   }

   public ht e() {
      return this.c;
   }

   public ato b(@Nullable ht $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ato.a(ac.b()) : ato.a(ati.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dwn g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eas> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public eav.a a(List<eav.a> $$0, @Nullable ht $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ear d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
