import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eha {
   private dey a;
   private dgo b;
   private ib c;
   private boolean d;
   @Nullable
   private ecw e;
   private boolean f;
   @Nullable
   private axd g;
   private int h;
   private final List<ehb> i;
   private boolean j;
   private boolean k;

   public eha() {
      this.a = dey.a;
      this.b = dgo.a;
      this.c = ib.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public eha a() {
      eha $$0 = new eha();
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

   public eha a(dey $$0) {
      this.a = $$0;
      return this;
   }

   public eha a(dgo $$0) {
      this.b = $$0;
      return this;
   }

   public eha a(ib $$0) {
      this.c = $$0;
      return this;
   }

   public eha a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eha a(ecw $$0) {
      this.e = $$0;
      return this;
   }

   public eha a(@Nullable axd $$0) {
      this.g = $$0;
      return this;
   }

   public eha b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public eha c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eha b() {
      this.i.clear();
      return this;
   }

   public eha a(ehb $$0) {
      this.i.add($$0);
      return this;
   }

   public eha b(ehb $$0) {
      this.i.remove($$0);
      return this;
   }

   public dey c() {
      return this.a;
   }

   public dgo d() {
      return this.b;
   }

   public ib e() {
      return this.c;
   }

   public axd b(@Nullable ib $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? axd.a(ac.b()) : axd.a(aww.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public ecw g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ehb> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ehe.a a(List<ehe.a> $$0, @Nullable ib $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eha d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
