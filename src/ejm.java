import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class ejm {
   private dhd a;
   private dit b;
   private id c;
   private boolean d;
   @Nullable
   private efi e;
   private boolean f;
   @Nullable
   private axt g;
   private int h;
   private final List<ejn> i;
   private boolean j;
   private boolean k;

   public ejm() {
      this.a = dhd.a;
      this.b = dit.a;
      this.c = id.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public ejm a() {
      ejm $$0 = new ejm();
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

   public ejm a(dhd $$0) {
      this.a = $$0;
      return this;
   }

   public ejm a(dit $$0) {
      this.b = $$0;
      return this;
   }

   public ejm a(id $$0) {
      this.c = $$0;
      return this;
   }

   public ejm a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public ejm a(efi $$0) {
      this.e = $$0;
      return this;
   }

   public ejm a(@Nullable axt $$0) {
      this.g = $$0;
      return this;
   }

   public ejm b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public ejm c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public ejm b() {
      this.i.clear();
      return this;
   }

   public ejm a(ejn $$0) {
      this.i.add($$0);
      return this;
   }

   public ejm b(ejn $$0) {
      this.i.remove($$0);
      return this;
   }

   public dhd c() {
      return this.a;
   }

   public dit d() {
      return this.b;
   }

   public id e() {
      return this.c;
   }

   public axt b(@Nullable id $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? axt.a(ac.b()) : axt.a(axm.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public efi g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<ejn> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public ejq.a a(List<ejq.a> $$0, @Nullable id $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public ejm d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
