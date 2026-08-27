import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class dyo {
   private cxh a;
   private cyy b;
   private gu c;
   private boolean d;
   @Nullable
   private dur e;
   private boolean f;
   @Nullable
   private aru g;
   private int h;
   private final List<dyp> i;
   private boolean j;
   private boolean k;

   public dyo() {
      this.a = cxh.a;
      this.b = cyy.a;
      this.c = gu.b;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public dyo a() {
      dyo $$0 = new dyo();
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

   public dyo a(cxh $$0) {
      this.a = $$0;
      return this;
   }

   public dyo a(cyy $$0) {
      this.b = $$0;
      return this;
   }

   public dyo a(gu $$0) {
      this.c = $$0;
      return this;
   }

   public dyo a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public dyo a(dur $$0) {
      this.e = $$0;
      return this;
   }

   public dyo a(@Nullable aru $$0) {
      this.g = $$0;
      return this;
   }

   public dyo b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public dyo c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public dyo b() {
      this.i.clear();
      return this;
   }

   public dyo a(dyp $$0) {
      this.i.add($$0);
      return this;
   }

   public dyo b(dyp $$0) {
      this.i.remove($$0);
      return this;
   }

   public cxh c() {
      return this.a;
   }

   public cyy d() {
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
   public dur g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<dyp> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public dys.a a(List<dys.a> $$0, @Nullable gu $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public dyo d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
