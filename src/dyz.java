import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dyz {
   private cxs a;
   private czj b;
   private gw c;
   private boolean d;
   @Nullable
   private dvc e;
   private boolean f;
   @Nullable
   private ase g;
   private int h;
   private final List<dza> i;
   private boolean j;
   private boolean k;

   public dyz() {
      this.a = cxs.a;
      this.b = czj.a;
      this.c = gw.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dyz a() {
      dyz $$0 = new dyz();
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

   public dyz a(cxs $$0) {
      this.a = $$0;
      return this;
   }

   public dyz a(czj $$0) {
      this.b = $$0;
      return this;
   }

   public dyz a(gw $$0) {
      this.c = $$0;
      return this;
   }

   public dyz a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dyz a(dvc $$0) {
      this.e = $$0;
      return this;
   }

   public dyz a(@Nullable ase $$0) {
      this.g = $$0;
      return this;
   }

   public dyz b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dyz c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dyz b() {
      this.i.clear();
      return this;
   }

   public dyz a(dza $$0) {
      this.i.add($$0);
      return this;
   }

   public dyz b(dza $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxs c() {
      return this.a;
   }

   public czj d() {
      return this.b;
   }

   public gw e() {
      return this.c;
   }

   public ase b(@Nullable gw $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? ase.a(ac.b()) : ase.a(ary.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dvc g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dza> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dzd.a a(List<dzd.a> $$0, @Nullable gw $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dyz d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
