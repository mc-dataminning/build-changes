import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class eme {
   private dju a;
   private dlk b;
   private iz c;
   private boolean d;
   @Nullable
   private eia e;
   private boolean f;
   @Nullable
   private azf g;
   private int h;
   private final List<emf> i;
   private boolean j;
   private boolean k;

   public eme() {
      this.a = dju.a;
      this.b = dlk.a;
      this.c = iz.c;
      this.f = true;
      this.i = Lists.newArrayList();
   }

   public eme a() {
      eme $$0 = new eme();
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

   public eme a(dju $$0) {
      this.a = $$0;
      return this;
   }

   public eme a(dlk $$0) {
      this.b = $$0;
      return this;
   }

   public eme a(iz $$0) {
      this.c = $$0;
      return this;
   }

   public eme a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public eme a(eia $$0) {
      this.e = $$0;
      return this;
   }

   public eme a(@Nullable azf $$0) {
      this.g = $$0;
      return this;
   }

   public eme b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public eme c(boolean $$0) {
      this.j = $$0;
      return this;
   }

   public eme b() {
      this.i.clear();
      return this;
   }

   public eme a(emf $$0) {
      this.i.add($$0);
      return this;
   }

   public eme b(emf $$0) {
      this.i.remove($$0);
      return this;
   }

   public dju c() {
      return this.a;
   }

   public dlk d() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public azf b(@Nullable iz $$0) {
      if (this.g != null) {
         return this.g;
      } else {
         return $$0 == null ? azf.a(ac.c()) : azf.a(ayx.a($$0));
      }
   }

   public boolean f() {
      return this.d;
   }

   @Nullable
   public eia g() {
      return this.e;
   }

   public boolean h() {
      return this.j;
   }

   public List<emf> i() {
      return this.i;
   }

   public boolean j() {
      return this.f;
   }

   public emi.a a(List<emi.a> $$0, @Nullable iz $$1) {
      int $$2 = $$0.size();
      if ($$2 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return $$0.get(this.b($$1).a($$2));
      }
   }

   public eme d(boolean $$0) {
      this.k = $$0;
      return this;
   }

   public boolean k() {
      return this.k;
   }
}
