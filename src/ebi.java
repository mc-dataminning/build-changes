import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ebi {
   private dab a;
   private dbr b;
   private hx c;
   private boolean d;
   @Nullable
   private dxe e;
   private boolean f;
   @Nullable
   private atw g;
   private int h;
   private final List<ebj> i;
   private boolean j;
   private boolean k;

   public ebi() {
      this.a = dab.a;
      this.b = dbr.a;
      this.c = hx.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ebi a() {
      ebi $$0 = new ebi();
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

   public ebi a(dab $$0) {
      this.a = $$0;
      return this;
   }

   public ebi a(dbr $$0) {
      this.b = $$0;
      return this;
   }

   public ebi a(hx $$0) {
      this.c = $$0;
      return this;
   }

   public ebi a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ebi a(dxe $$0) {
      this.e = $$0;
      return this;
   }

   public ebi a(@Nullable atw $$0) {
      this.g = $$0;
      return this;
   }

   public ebi b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ebi c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ebi b() {
      this.i.clear();
      return this;
   }

   public ebi a(ebj $$0) {
      this.i.add($$0);
      return this;
   }

   public ebi b(ebj $$0) {
      this.i.remove($$0);
      return this;
   }

   public dab c() {
      return this.a;
   }

   public dbr d() {
      return this.b;
   }

   public hx e() {
      return this.c;
   }

   public atw b(@Nullable hx $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? atw.a(ac.b()) : atw.a(atq.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dxe g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ebj> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ebm.a a(List<ebm.a> $$0, @Nullable hx $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ebi d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
