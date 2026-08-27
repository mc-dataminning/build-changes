import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dyn {
   private cxg a;
   private cyx b;
   private gu c;
   private boolean d;
   @Nullable
   private duq e;
   private boolean f;
   @Nullable
   private aru g;
   private int h;
   private final List<dyo> i;
   private boolean j;
   private boolean k;

   public dyn() {
      this.a = cxg.a;
      this.b = cyx.a;
      this.c = gu.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dyn a() {
      dyn $$0 = new dyn();
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

   public dyn a(cxg $$0) {
      this.a = $$0;
      return this;
   }

   public dyn a(cyx $$0) {
      this.b = $$0;
      return this;
   }

   public dyn a(gu $$0) {
      this.c = $$0;
      return this;
   }

   public dyn a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dyn a(duq $$0) {
      this.e = $$0;
      return this;
   }

   public dyn a(@Nullable aru $$0) {
      this.g = $$0;
      return this;
   }

   public dyn b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dyn c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dyn b() {
      this.i.clear();
      return this;
   }

   public dyn a(dyo $$0) {
      this.i.add($$0);
      return this;
   }

   public dyn b(dyo $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxg c() {
      return this.a;
   }

   public cyx d() {
      return this.b;
   }

   public gu e() {
      return this.c;
   }

   public aru b(@Nullable gu $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? aru.a(ac.b()) : aru.a(arp.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public duq g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dyo> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dyr.a a(List<dyr.a> $$0, @Nullable gu $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dyn d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
