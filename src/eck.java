import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eck {
   private dav a;
   private dcl b;
   private hv c;
   private boolean d;
   @Nullable
   private dyg e;
   private boolean f;
   @Nullable
   private auf g;
   private int h;
   private final List<ecl> i;
   private boolean j;
   private boolean k;

   public eck() {
      this.a = dav.a;
      this.b = dcl.a;
      this.c = hv.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public eck a() {
      eck $$0 = new eck();
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

   public eck a(dav $$0) {
      this.a = $$0;
      return this;
   }

   public eck a(dcl $$0) {
      this.b = $$0;
      return this;
   }

   public eck a(hv $$0) {
      this.c = $$0;
      return this;
   }

   public eck a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eck a(dyg $$0) {
      this.e = $$0;
      return this;
   }

   public eck a(@Nullable auf $$0) {
      this.g = $$0;
      return this;
   }

   public eck b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public eck c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eck b() {
      this.i.clear();
      return this;
   }

   public eck a(ecl $$0) {
      this.i.add($$0);
      return this;
   }

   public eck b(ecl $$0) {
      this.i.remove($$0);
      return this;
   }

   public dav c() {
      return this.a;
   }

   public dcl d() {
      return this.b;
   }

   public hv e() {
      return this.c;
   }

   public auf b(@Nullable hv $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? auf.a(ac.b()) : auf.a(aty.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dyg g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ecl> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public eco.a a(List<eco.a> $$0, @Nullable hv $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eck d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
