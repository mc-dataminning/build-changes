import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dym {
   private cxf a;
   private cyw b;
   private gv c;
   private boolean d;
   @Nullable
   private dup e;
   private boolean f;
   @Nullable
   private art g;
   private int h;
   private final List<dyn> i;
   private boolean j;
   private boolean k;

   public dym() {
      this.a = cxf.a;
      this.b = cyw.a;
      this.c = gv.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dym a() {
      dym $$0 = new dym();
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

   public dym a(cxf $$0) {
      this.a = $$0;
      return this;
   }

   public dym a(cyw $$0) {
      this.b = $$0;
      return this;
   }

   public dym a(gv $$0) {
      this.c = $$0;
      return this;
   }

   public dym a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dym a(dup $$0) {
      this.e = $$0;
      return this;
   }

   public dym a(@Nullable art $$0) {
      this.g = $$0;
      return this;
   }

   public dym b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dym c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dym b() {
      this.i.clear();
      return this;
   }

   public dym a(dyn $$0) {
      this.i.add($$0);
      return this;
   }

   public dym b(dyn $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxf c() {
      return this.a;
   }

   public cyw d() {
      return this.b;
   }

   public gv e() {
      return this.c;
   }

   public art b(@Nullable gv $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? art.a(ac.b()) : art.a(aro.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public dup g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dyn> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dyq.a a(List<dyq.a> $$0, @Nullable gv $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dym d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
