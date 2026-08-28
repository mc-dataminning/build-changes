import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class emi {
   private djy a;
   private dlo b;
   private iz c;
   private boolean d;
   @Nullable
   private eie e;
   private boolean f;
   @Nullable
   private azh g;
   private int h;
   private final List<emj> i;
   private boolean j;
   private boolean k;

   public emi() {
      this.a = djy.a;
      this.b = dlo.a;
      this.c = iz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public emi a() {
      emi $$0 = new emi();
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

   public emi a(djy $$0) {
      this.a = $$0;
      return this;
   }

   public emi a(dlo $$0) {
      this.b = $$0;
      return this;
   }

   public emi a(iz $$0) {
      this.c = $$0;
      return this;
   }

   public emi a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public emi a(eie $$0) {
      this.e = $$0;
      return this;
   }

   public emi a(@Nullable azh $$0) {
      this.g = $$0;
      return this;
   }

   public emi b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public emi c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public emi b() {
      this.i.clear();
      return this;
   }

   public emi a(emj $$0) {
      this.i.add($$0);
      return this;
   }

   public emi b(emj $$0) {
      this.i.remove($$0);
      return this;
   }

   public djy c() {
      return this.a;
   }

   public dlo d() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public azh b(@Nullable iz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azh.a(ac.c()) : azh.a(ayz.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eie g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emj> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emm.a a(List<emm.a> $$0, @Nullable iz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public emi d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
