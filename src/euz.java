import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class euz {
   private dri a;
   private dsz b;
   private iu c;
   private boolean d;
   @Nullable
   private eqt e;
   private eun f;
   @Nullable
   private azv g;
   private int h;
   private final List<eva> i;
   private boolean j;
   private boolean k;

   public euz() {
      this.a = dri.a;
      this.b = dsz.a;
      this.c = iu.c;
      this.f = eun.b;
      this.i = Lists.newArrayList();
   }

   public euz a() {
      euz $$0 = new euz();
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

   public euz a(dri $$0) {
      this.a = $$0;
      return this;
   }

   public euz a(dsz $$0) {
      this.b = $$0;
      return this;
   }

   public euz a(iu $$0) {
      this.c = $$0;
      return this;
   }

   public euz a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public euz a(eqt $$0) {
      this.e = $$0;
      return this;
   }

   public euz a(@Nullable azv $$0) {
      this.g = $$0;
      return this;
   }

   public euz a(eun $$0) {
      this.f = $$0;
      return this;
   }

   public euz b(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public euz b() {
      this.i.clear();
      return this;
   }

   public euz a(eva $$0) {
      this.i.add($$0);
      return this;
   }

   public euz b(eva $$0) {
      this.i.remove($$0);
      return this;
   }

   public dri c() {
      return this.a;
   }

   public dsz d() {
      return this.b;
   }

   public iu e() {
      return this.c;
   }

   public azv b(@Nullable iu $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azv.a(af.c()) : azv.a(azm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eqt g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<eva> i() {
      return this.i;
   }

   public boolean j() {
      return this.f == eun.b;
   }

   public evd.b a(List<evd.b> $$0, @Nullable iu $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public euz c(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
